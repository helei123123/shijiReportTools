package com.shiji.serviceImpl;

import com.shiji.entity.PosCheckVo;
import com.shiji.mapper.pos.PosChecksMapper;
import com.shiji.service.*;
import com.shiji.util.EnCapsulateQueryDate;
import com.shiji.util.ExportExcel;
import com.shiji.util.ResultFormat;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/21 14:30
 * @description：posChecks业务层
 * @modified By：
 * @version: v1.0$
 */
@Service
public class PosChecksServiceImpl implements PosChecksServices {

	@Autowired
	private PosChecksMapper posChecksMapper;

	@Autowired
	private PosCheckItemsServices posCheckItemsServices;

	@Autowired
	private OutOutletsServices outOutletsServices;

	@Autowired
	private PosBusinessDaysServices posBusinessDaysServices;

	@Autowired
	private PosCheckPaymentsServices posCheckPaymentsServices;

	@Autowired
	private PosCheckDiscountsServices posCheckDiscountsServices;

	@Autowired
	private PosCheckDiscountsItemsServices posCheckDiscountsItemsServices;

	@Autowired
	private PosCheckTableServices posCheckTableServices;

	@Override
	public List<Map<String, Object>> selectAll() {
		return posChecksMapper.selectAll();
	}

	public List<Map<String, Object>> findPosChecksByCheckNumAndOutletIdAndBdayId(String checkNum, String outletId, String sDayId, String typeTime, Date dbeginTime, Date dendTime) {
		return posChecksMapper.findPosChecksByCheckNumAndOutletIdAndBdayId(checkNum, outletId, sDayId, typeTime, dbeginTime, dendTime);
	}

	@Override
	public ResultFormat findPosChecksByCheckNumAndOutletCodeAndBusinessDay(String outletCode, String checkNum, String businessDay, String typeTime, String rangTime) throws Exception {
		SimpleDateFormat ymd = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat ymdhms = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sDayId = null;
		String outletId = null;
		String beginTime = "";
		String endTime = "";
		Date dbeginTime = null;
		Date dendTime = null;
		if (!StringUtils.isEmpty(businessDay)) {
			Date parse = ymd.parse(businessDay);
			sDayId = posBusinessDaysServices.findByDayId(parse);
			if (sDayId == null || sDayId == "")
				return ResultFormat.build(1, null);
		}
		if (!StringUtils.isEmpty(rangTime)) {
			StringBuilder sbBeginTime = new StringBuilder();
			StringBuilder sbEndTime = new StringBuilder();
			String[] split = rangTime.split("-");
			beginTime = sbBeginTime.append(businessDay + " ").append(split[0]).toString();
			endTime = sbEndTime.append(businessDay + " ").append(split[1]).toString();
		}
		if (!StringUtils.isEmpty(beginTime))
			dbeginTime = ymdhms.parse(beginTime);
		if (!StringUtils.isEmpty(endTime))
			dendTime = ymdhms.parse(endTime);
		if (!StringUtils.isEmpty(outletCode)) {
			outletId = outOutletsServices.findByOutletId(outletCode);
			if (outletId == null || outletId == "")
				return ResultFormat.build(0, null);
		}

		if (checkNum == "" || checkNum == null)
			checkNum = null;
		List<Map<String, Object>> poschecksReuslts = this.findPosChecksByCheckNumAndOutletIdAndBdayId(checkNum, outletId, sDayId, typeTime, dbeginTime, dendTime);
		if (poschecksReuslts == null || poschecksReuslts.size() == 0)
			return ResultFormat.build(2, null);
		String title = "";
		if (StringUtils.isEmpty(businessDay))
			title = ymd.format(new Date()) + "-" + new Random().nextInt(500);
		else
			title = businessDay + "-" + new Random().nextInt(500);
		//excel中的头部信息
		String[] sPosChecks = {"chks_id", "chks_bday_id", "chks_bper_id", "chks_shop_id", "chks_olet_id",
				"chks_sect_id", "chks_aif", "chks_txn", "chks_check_prefix", "chks_check_num", "chks_check_prefix_num", "chks_ctbl_id", "chks_guests", "chks_gen_check_num_type", "chks_children", "chks_print_count", "chks_receipt_print_count", "chks_party_count", "chks_check_total", "chks_item_total", "chks_sc1", "chks_sc2", "chks_sc3", "chks_sc4", "chks_sc5", "chks_tax1", "chks_tax2", "chks_tax3", "chks_tax4", "chks_tax5", "chks_tax6", "chks_tax7", "chks_tax8", "chks_tax9", "chks_tax10", "chks_tax11", "chks_tax12", "chks_tax13", "chks_tax14", "chks_tax15", "chks_tax16", "chks_tax17", "chks_tax18", "chks_tax19", "chks_tax20", "chks_tax21", "chks_tax22", "chks_tax23", "chks_tax24", "chks_tax25", "chks_incl_tax_ref1", "chks_incl_tax_ref2", "chks_incl_tax_ref3", "chks_incl_tax_ref4", "chks_pre_disc", "chks_mid_disc", "chks_post_disc", "chks_gratuity_total", "chks_round_amount", "chks_payment_total", "chks_tips_total", "chks_surcharge_total", "chks_paid", "chks_resv_book_date", "chks_resv_refno_with_prefix", "chks_ordering_type", "chks_ordering_mode", "chks_non_revenue", "chks_memb_id", "chks_ctyp_id", "chks_settle_shift_num", "chks_remark", "chks_open_time", "chks_open_loctime", "chks_open_user_id", "chks_open_stat_id", "chks_close_time", "chks_close_loctime", "chks_close_user_id", "chks_close_stat_id", "chks_close_bper_id", "chks_modified_time", "chks_modified_loctime", "chks_modified_user_id", "chks_modified_stat_id", "chks_print_time", "chks_print_loctime", "chks_print_user_id", "chks_print_stat_id", "chks_lock_time", "chks_lock_loctime", "chks_lock_user_id", "chks_lock_stat_id", "chks_void_time", "chks_void_loctime", "chks_void_user_id", "chks_void_stat_id", "chks_void_vdrs_id", "chks_owner_user_id", "chks_status", "chks_slave_id", "chks_slave_created", "chks_slave_modified", "chks_sync_id", "created", "modified"};
		String[] sPosCheckItems = {"citm_id", "citm_bday_id", "citm_bper_id", "citm_shop_id", "citm_olet_id", "citm_chks_id", "citm_cpty_id", "citm_item_id", "citm_code", "citm_name_l1", "citm_name_l2", "citm_name_l3", "citm_name_l4", "citm_name_l5", "citm_short_name_l1", "citm_short_name_l2", "citm_short_name_l3", "citm_short_name_l4", "citm_short_name_l5", "citm_parent_citm_id", "citm_role", "citm_child_count", "citm_modifier_count", "citm_seat", "citm_mix_and_match_citm_id", "citm_seq", "citm_round_total", "citm_total", "citm_round_amount", "citm_carry_total", "citm_qty", "citm_base_qty", "citm_price", "citm_original_price", "citm_basic_price", "citm_basic_calculate_method", "citm_sc1", "citm_sc2", "citm_sc3", "citm_sc4", "citm_sc5", "citm_tax1", "citm_tax2", "citm_tax3", "citm_tax4", "citm_tax5", "citm_tax6", "citm_tax7", "citm_tax8", "citm_tax9", "citm_tax10", "citm_tax11", "citm_tax12", "citm_tax13", "citm_tax14", "citm_tax15", "citm_tax16", "citm_tax17", "citm_tax18", "citm_tax19", "citm_tax20", "citm_tax21", "citm_tax22", "citm_tax23", "citm_tax24", "citm_tax25", "citm_incl_tax_ref1", "citm_incl_tax_ref2", "citm_incl_tax_ref3", "citm_incl_tax_ref4", "citm_pre_disc", "citm_mid_disc", "citm_post_disc", "citm_original_price_level", "citm_price_level", "citm_revenue", "citm_carry_revenue", "citm_unit_cost", "citm_print_queue1_itpq_id", "citm_print_queue2_itpq_id", "citm_print_queue3_itpq_id", "citm_print_queue4_itpq_id", "citm_print_queue5_itpq_id", "citm_print_queue6_itpq_id", "citm_print_queue7_itpq_id", "citm_print_queue8_itpq_id", "citm_print_queue9_itpq_id", "citm_print_queue10_itpq_id", "citm_no_print", "citm_charge_sc1", "citm_charge_sc2", "citm_charge_sc3", "citm_charge_sc4", "citm_charge_sc5", "citm_charge_tax1", "citm_charge_tax2", "citm_charge_tax3", "citm_charge_tax4", "citm_charge_tax5", "citm_charge_tax6", "citm_charge_tax7", "citm_charge_tax8", "citm_charge_tax9", "citm_charge_tax10", "citm_charge_tax11", "citm_charge_tax12", "citm_charge_tax13", "citm_charge_tax14", "citm_charge_tax15", "citm_charge_tax16", "citm_charge_tax17", "citm_charge_tax18", "citm_charge_tax19", "citm_charge_tax20", "citm_charge_tax21", "citm_charge_tax22", "citm_charge_tax23", "citm_charge_tax24", "citm_charge_tax25", "citm_hide", "citm_original_olet_id", "citm_icat_id", "citm_idep_id", "citm_icou_id", "citm_digp_id", "citm_get_revenue", "citm_serving_status", "citm_pending", "citm_ordering_type", "citm_round_status", "citm_order_time", "citm_order_loctime", "citm_order_user_id", "citm_order_stat_id", "citm_rush_time", "citm_rush_loctime", "citm_rush_user_id", "citm_rush_stat_id", "citm_rush_count", "citm_delivery_time", "citm_void_time", "citm_void_loctime", "citm_void_user_id", "citm_void_stat_id", "citm_void_vdrs_id", "citm_void_consumed", "citm_status", "citm_slave_id", "citm_slave_created", "citm_slave_modified", "citm_sync_id", "created", "modified"};
		String[] sPosCheckPayments = {"cpay_id", "cpay_bday_id", "cpay_bper_id", "cpay_shop_id", "cpay_olet_id", "cpay_chks_id", "cpay_cpty_id", "cpay_paym_id", "cpay_name_l1", "cpay_name_l2", "cpay_name_l3", "cpay_name_l4", "cpay_name_l5", "cpay_short_name_l1", "cpay_short_name_l2", "cpay_short_name_l3", "cpay_short_name_l4", "cpay_short_name_l5", "cpay_payment_type", "cpay_seq", "cpay_pay_total", "cpay_pay_tips", "cpay_pay_surcharge", "cpay_pay_change", "cpay_pay_foreign_currency", "cpay_pay_foreign_total", "cpay_pay_foreign_tips", "cpay_pay_foreign_surcharge", "cpay_pay_foreign_change", "cpay_currency_code", "cpay_currency_rate", "cpay_change_back_currency", "cpay_special", "cpay_non_revenue", "cpay_memb_id", "cpay_meal_user_id", "cpay_ref_data1", "cpay_ref_data2", "cpay_ref_data3", "cpay_pay_time", "cpay_pay_loctime", "cpay_pay_user_id", "cpay_pay_stat_id", "cpay_void_time", "cpay_void_loctime", "cpay_void_user_id", "cpay_void_stat_id", "cpay_void_vdrs_id", "cpay_status", "cpay_slave_id", "cpay_slave_created", "cpay_slave_modified", "cpay_sync_id", "created", "modified"};
		String[] sPosDiscounts = {"cdis_id", "cdis_bday_id", "cdis_bper_id", "cdis_shop_id", "cdis_olet_id", "cdis_chks_id", "cdis_cpty_id", "cdis_citm_id", "cdis_dtyp_id", "cdis_name_l1", "cdis_name_l2", "cdis_name_l3", "cdis_name_l4", "cdis_name_l5", "cdis_short_name_l1", "cdis_short_name_l2", "cdis_short_name_l3", "cdis_short_name_l4", "cdis_short_name_l5", "cdis_dgrp_id", "cdis_seq", "cdis_round_total", "cdis_total", "cdis_round_amount", "cdis_method", "cdis_type", "cdis_used_for", "cdis_class_key", "cdis_rate", "cdis_fix_amount", "cdis_include_tax_sc_mask", "cdis_include_pre_disc", "cdis_include_mid_disc", "cdis_apply_time", "cdis_apply_loctime", "cdis_apply_user_id", "cdis_apply_stat_id", "cdis_void_time", "cdis_void_loctime", "cdis_void_user_id", "cdis_void_stat_id", "cdis_void_vdrs_id", "cdis_status", "cdis_slave_id", "cdis_slave_created", "cdis_slave_modified", "cdis_sync_id", "created", "modified"};
		String[] sPosDiscountItems = {"cdit_id", "cdit_olet_id", "cdit_cdis_id", "cdit_citm_id", "cdit_total", "cdit_round_total", "cdit_status", "cdit_slave_id", "cdit_slave_created", "cdit_slave_modified", "cdit_sync_id", "created", "modified"};

		List<Object[]> lPosChecksResults = new ArrayList<>();
		List<Object> chksId = new ArrayList<>();
		for (int i = 0; i < poschecksReuslts.size(); i++) {
			Object[] objs = new Object[sPosChecks.length];
			Map<String, Object> sCellMap = poschecksReuslts.get(i);
			chksId.add(sCellMap.get("chks_id"));
			for (int j = 0; j < sPosChecks.length; j++) {
				if (sCellMap.get(sPosChecks[j]) == null || sCellMap.get(sPosChecks[j]) == "")
					objs[j] = "null";
				else
					objs[j] = sCellMap.get(sPosChecks[j]);

			}
			lPosChecksResults.add(objs);
		}
		//通过chksId查询pos_check_items表中的数据并进行封装
		List<Map<String, Object>> poscheckItemsReuslts = posCheckItemsServices.findPoscheckItemsByChksid(chksId);
		List<Object[]> lPosCheckItemsResult = EnCapsulateQueryDate.encapsulateQueryData(poscheckItemsReuslts, sPosCheckItems);
		//通过chksId查询pos_check_payments表中的数据并进行封装
		List<Map<String, Object>> poscheckPaymentsReuslts = posCheckPaymentsServices.findPoscheckPaymentsByChksid(chksId);
		List<Object[]> lPosCheckPaymentsResults = EnCapsulateQueryDate.encapsulateQueryData(poscheckPaymentsReuslts, sPosCheckPayments);
		//通过chksId查询pos_check_discounts表中的数据并进行封装
		List<Map<String, Object>> poscheckDiscounts = posCheckDiscountsServices.findPosCheckDiscountsByChksid(chksId);
		List<Object[]> lposCheckDiscountsResults = EnCapsulateQueryDate.encapsulateQueryData(poscheckDiscounts, sPosDiscounts);
		//通过cdisId查询Pos_check_discount_items表中的数据并进行封装
		List<Object> lfieldResults = EnCapsulateQueryDate.encapsulateFieldListByFieldKey(poscheckDiscounts, "cdis_id");
		List<Map<String, Object>> poscheckDiscountItems = posCheckDiscountsItemsServices.findPosCheckDiscountItemsByCdisId(lfieldResults);
		List<Object[]> lposCheckDiscountItemsResults = EnCapsulateQueryDate.encapsulateQueryData(poscheckDiscountItems, sPosDiscountItems);
		File file = new File("");
		File file1 = new File(file.getCanonicalPath() + "\\Report\\");
		//判断文件夹是否存在不存在则创建
		if (!file1.exists()) {
			file1.mkdir();
		}
		OutputStream out = new FileOutputStream(file.getCanonicalPath() + "\\Report\\" + title + ".xls");
		ExportExcel eeu = new ExportExcel();
		HSSFWorkbook workbook = new HSSFWorkbook();
		eeu.exportExcel(workbook, 0, "Pos_checks", sPosChecks, lPosChecksResults, out);
		eeu.exportExcel(workbook, 1, "Pos_check_items", sPosCheckItems, lPosCheckItemsResult, out);
		eeu.exportExcel(workbook, 2, "Pos_check_payments", sPosCheckPayments, lPosCheckPaymentsResults, out);
		eeu.exportExcel(workbook, 3, "Pos_check_Discounts", sPosDiscounts, lposCheckDiscountsResults, out);
		eeu.exportExcel(workbook, 4, "Pos_check_DiscountItems", sPosDiscountItems, lposCheckDiscountItemsResults, out);
		//原理就是将所有的数据一起写入，然后再关闭输入流。
		workbook.write(out);
		out.close();
		return new ResultFormat(200, "导出成功!", null);
	}

	@Override
	public ResultFormat findPosChecksByBusinessDay(String businessDayRang, String typeTime, String rangTime) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		if (StringUtils.isEmpty(businessDayRang))
			return new ResultFormat(0, "请输入营业日!", null);
		String[] splitTime = businessDayRang.split("-");
		StringBuilder sbBeginTime = new StringBuilder();
		StringBuilder sbEndTime = new StringBuilder();
		Date businessDayBeginDate = sdf.parse(sbBeginTime.append(splitTime[0]).append("-").append(splitTime[1]).append("-").append(splitTime[2]).toString());
		Date businessDayEndDate = sdf.parse(sbEndTime.append(splitTime[3]).append("-").append(splitTime[4]).append("-").append(splitTime[5]).toString());
		List<String> sDayIds = posBusinessDaysServices.findByDayId(businessDayBeginDate, businessDayEndDate);
		Date CheckBeginTime = null;
		Date CheckEndTime = null;
		if (sDayIds == null || sDayIds.size() == 0)
			return new ResultFormat(1, "当前的营业日不存在!", null);
		if (!StringUtils.isEmpty(rangTime)) {
			CheckBeginTime = sdf1.parse(businessDayBeginDate.toString() + " " + rangTime.split("-")[0]);
			CheckEndTime = sdf1.parse(businessDayBeginDate.toString() + " " + rangTime.split("-")[1]);
		}
		//创建一个list用来存放一种类型的数据进行重复使用
		List<Object> chksIds = new ArrayList<>();
		//(1)Check total in pos_checks != payment total in pos_check_payments
		List<PosCheckVo> resultLists = posChecksMapper.findAllByBusinessDayIdAndTimeRang(businessDayBeginDate, businessDayEndDate, CheckBeginTime, CheckEndTime, typeTime);
		processingChksIdData(resultLists, chksIds);
		//将discountTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountsByChksid = posCheckDiscountsServices.findPosCheckDiscountsByChksidAndDiscounttotal(chksIds);
		ProcessDiscountTotalData(resultLists, posCheckDiscountsByChksid);
		//将itemTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckItemsByChksid = posCheckItemsServices.findPoscheckItemsByChksidAndItemtotal(chksIds);
		ProcessItemTotalData(resultLists, poscheckItemsByChksid);
		//将discountItemTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountItemsTotalByCdisId = posCheckDiscountsItemsServices.findPosCheckDiscountItemsTotalByCdisId(chksIds);
		ProcessDiscountItemTotalData(resultLists, posCheckDiscountItemsTotalByCdisId);
		//将paymentPayTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckPaymentsTotalByChksid = posCheckPaymentsServices.findPoscheckPaymentsTotalByChksid(chksIds);
		ProcessPaymentTotalData(resultLists, poscheckPaymentsTotalByChksid);
		//清空第一种不完整数据的chksId
		chksIds.clear();

		//(2)Check item total in pos_check != all item total in pos_check_items
		List<PosCheckVo> resultLists1 = posChecksMapper.findAllByBusinessDayIdAndTimeRang1(businessDayBeginDate, businessDayEndDate, CheckBeginTime, CheckEndTime, typeTime);
		processingChksIdData(resultLists1, chksIds);

		//将discountTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountsByChksid1 = posCheckDiscountsServices.findPosCheckDiscountsByChksidAndDiscounttotal(chksIds);
		ProcessDiscountTotalData(resultLists1, posCheckDiscountsByChksid1);
		//将itemTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckItemsByChksid1 = posCheckItemsServices.findPoscheckItemsByChksidAndItemtotal(chksIds);
		ProcessItemTotalData(resultLists1, poscheckItemsByChksid1);
		//将discountItemTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountItemsTotalByCdisId1 = posCheckDiscountsItemsServices.findPosCheckDiscountItemsTotalByCdisId(chksIds);
		ProcessDiscountItemTotalData(resultLists1, posCheckDiscountItemsTotalByCdisId1);
		//将paymentPayTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckPaymentsTotalByChksid1 = posCheckPaymentsServices.findPoscheckPaymentsTotalByChksid(chksIds);
		ProcessPaymentTotalData(resultLists1, poscheckPaymentsTotalByChksid1);
		//清空第二种不完整数据的chksId
		chksIds.clear();

		//(3)Check and item discount total in pos_check != all discount total in pos_check_discounts
		List<PosCheckVo> resultLists2 = posChecksMapper.findAllByBusinessDayIdAndTimeRang2(businessDayBeginDate, businessDayEndDate, CheckBeginTime, CheckEndTime, typeTime);
		processingChksIdData(resultLists2, chksIds);
		//将discountTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountsByChksid2 = posCheckDiscountsServices.findPosCheckDiscountsByChksidAndDiscounttotal(chksIds);
		ProcessDiscountTotalData(resultLists2, posCheckDiscountsByChksid2);
		//将itemTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckItemsByChksid2 = posCheckItemsServices.findPoscheckItemsByChksidAndItemtotal(chksIds);
		ProcessItemTotalData(resultLists2, poscheckItemsByChksid2);
		//将discountItemTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountItemsTotalByCdisId2 = posCheckDiscountsItemsServices.findPosCheckDiscountItemsTotalByCdisId(chksIds);
		ProcessDiscountItemTotalData(resultLists2, posCheckDiscountItemsTotalByCdisId2);
		//将paymentPayTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckPaymentsTotalByChksid2 = posCheckPaymentsServices.findPoscheckPaymentsTotalByChksid(chksIds);
		ProcessPaymentTotalData(resultLists2, poscheckPaymentsTotalByChksid2);
		//清空第三种不完整数据的chksId
		chksIds.clear();


		//(4)Discount total on that item in pos_check_items != all discount on item in pos_check_discount_items
		List<PosCheckVo> resultLists3 = posCheckItemsServices.findAllByBusinessDayIdAndTimeRang(businessDayBeginDate, businessDayEndDate, CheckBeginTime, CheckEndTime, typeTime);
		processingChksIdData(resultLists3, chksIds);
		//将discountTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountsByChksid3 = posCheckDiscountsServices.findPosCheckDiscountsByChksidAndDiscounttotal(chksIds);
		ProcessDiscountTotalData(resultLists3, posCheckDiscountsByChksid3);
		//将itemTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckItemsByChksid3 = posCheckItemsServices.findPoscheckItemsByChksidAndItemtotal(chksIds);
		ProcessItemTotalData(resultLists3, poscheckItemsByChksid3);
		//将discountItemTotal封装到posCheckVo类
		List<Map<String, Object>> posCheckDiscountItemsTotalByCdisId3 = posCheckDiscountsItemsServices.findPosCheckDiscountItemsTotalByCdisId(chksIds);
		ProcessDiscountItemTotalData(resultLists3, posCheckDiscountItemsTotalByCdisId3);
		//将paymentPayTotal封装到posCheckVo类
		List<Map<String, Object>> poscheckPaymentsTotalByChksid3 = posCheckPaymentsServices.findPoscheckPaymentsTotalByChksid(chksIds);
		ProcessPaymentTotalData(resultLists3, poscheckPaymentsTotalByChksid3);
		//清空第四种不完整数据的chksId
		chksIds.clear();

		//去掉所有不完整性中账单编号相同的数据 begin
		ProcessCheckNoData(chksIds, resultLists);
		ProcessRepetitionData(chksIds, resultLists1);
		ProcessRepetitionData(chksIds, resultLists2);
		ProcessRepetitionData(chksIds, resultLists3);

		chksIds.clear();
		ProcessCheckNoData(chksIds, resultLists1);
		ProcessRepetitionData(chksIds, resultLists2);
		ProcessRepetitionData(chksIds, resultLists3);


		chksIds.clear();
		ProcessCheckNoData(chksIds, resultLists2);
		ProcessRepetitionData(chksIds, resultLists3);
		//end

		//封装最终产生的excel数据
		List<PosCheckVo> resultsAll = new ArrayList<>();
		resultsAll.addAll(resultLists);
		resultsAll.addAll(resultLists1);
		resultsAll.addAll(resultLists2);
		resultsAll.addAll(resultLists3);
		//设置excel的标题栏
		String[] headRow = {"Outlet", "Date", "Check No.", "Table No.", "Check Item Total", "Item Total ( Mismatch )", "Payment Total ( Mismatch )", "Discount Total ( Mismatch )", "Discount Item Total ( Mismatch )", "Payment Type", "Amount", "Tips"};
		//封装产生excel的行数据
		List<Object[]> resultObjectArr = new ArrayList<>();
		for (int i = 0; i < resultsAll.size(); i++) {
			Object[] obi = new Object[headRow.length];
			obi[0] = resultsAll.get(i).getOutlet();
			obi[1] = resultsAll.get(i).getDate();
			obi[2] = resultsAll.get(i).getCheckNo();
			obi[3] = resultsAll.get(i).getTableNo() + resultsAll.get(i).getTableExt();
			obi[4] = resultsAll.get(i).getCheckItemTotal();
			obi[5] = resultsAll.get(i).getItemTotal() + "(" + (resultsAll.get(i).getCheckItemTotal() - resultsAll.get(i).getItemTotal()) + ")";
			obi[6] = resultsAll.get(i).getPaymentPayTotal() + "(" + (resultsAll.get(i).getCheckTotal() - resultsAll.get(i).getPaymentPayTotal()) + ")";
			obi[7] = resultsAll.get(i).getDiscountTotal() + "(" + (resultsAll.get(i).getCheckDiscountTotal() - resultsAll.get(i).getDiscountTotal()) + ")";
			obi[8] = resultsAll.get(i).getCheckItemDiscountTotal() + "(" + (resultsAll.get(i).getCheckItemDiscountTotal() - resultsAll.get(i).getCheckDiscountItemTotal()) + ")";
			obi[9] = resultsAll.get(i).getPaymentType();
			obi[10] = resultsAll.get(i).getAmount();
			obi[11] = resultsAll.get(i).getTips();
			resultObjectArr.add(obi);
		}

		//设置文件的名称以及路径
		String title = sdf.format(businessDayBeginDate) + "-" + new Random().nextInt(500);
		File file = new File("");
		File file1 = new File(file.getCanonicalPath() + "\\checkIntegrityReport\\");
		//判断文件夹是否存在不存在则创建
		if (!file1.exists()) {
			file1.mkdir();
		}
		//将处理好的数据写入excel表中
		OutputStream out = new FileOutputStream(file.getCanonicalPath() + "\\checkIntegrityReport\\" + title + ".xls");
		ExportExcel eeu = new ExportExcel();
		HSSFWorkbook workbook = new HSSFWorkbook();
		eeu.exportInExcel(workbook, 0, "checkIntegrityReport", headRow, resultObjectArr, out);
		workbook.write(out);
		out.close();
		return new ResultFormat(200, "导出成功!", null);
	}

	/**
	 * 填写posCheckVo的paymentPayTotal数据
	 */
	private void ProcessPaymentTotalData(List<PosCheckVo> resultLists, List<Map<String, Object>> poscheckPaymentsTotalByChksid) {
		for (int i = 0; i < poscheckPaymentsTotalByChksid.size(); i++) {
			for (int j = 0; j < resultLists.size(); j++) {
				if (poscheckPaymentsTotalByChksid.get(i).get("chksId").equals(resultLists.get(j).getChksId()))
					resultLists.get(j).setPaymentPayTotal(Double.parseDouble(poscheckPaymentsTotalByChksid.get(i).get("paymentPayTotal").toString()));
			}
		}
	}

	/**
	 * 处理结果集的重复数据
	 */
	private void ProcessRepetitionData(List<Object> chksIds, List<PosCheckVo> resultLists) {
		for (int i = 0; i < chksIds.size(); i++) {
			for (int j = 0; j < resultLists.size(); j++) {
				if (chksIds.get(i).equals(resultLists.get(j).getCheckNo())) {
					resultLists.remove(j);
					j--;
				}
			}
		}
	}

	/**
	 * 获取结果集的账单编号
	 */
	private void ProcessCheckNoData(List<Object> chksIds, List<PosCheckVo> resultLists) {
		for (PosCheckVo posCheckVo : resultLists) {
			if (!chksIds.contains(posCheckVo.getCheckNo()))
				chksIds.add(posCheckVo.getCheckNo());
		}
	}

	/**
	 * 填写posCheckVo的checkItemTotal数据
	 */
	private void ProcessItemTotalData(List<PosCheckVo> resultLists, List<Map<String, Object>> poscheckItemsByChksid) {
		for (int i = 0; i < poscheckItemsByChksid.size(); i++) {
			for (int j = 0; j < resultLists.size(); j++) {
				if (poscheckItemsByChksid.get(i).get("chksId").equals(resultLists.get(j).getChksId())) {
					resultLists.get(j).setItemTotal(Double.parseDouble(poscheckItemsByChksid.get(i).get("itemTotal").toString()));
					resultLists.get(j).setCheckItemDiscountTotal(Double.parseDouble(poscheckItemsByChksid.get(i).get("checkItemDiscountTotal").toString()));
				}
			}
		}
	}

	/**
	 * 填写posCheckVo的discountTotal数据
	 */
	private void ProcessDiscountTotalData(List<PosCheckVo> resultLists, List<Map<String, Object>> posCheckDiscountsByChksid) {
		for (int i = 0; i < posCheckDiscountsByChksid.size(); i++) {
			for (int j = 0; j < resultLists.size(); j++) {
				if (posCheckDiscountsByChksid.get(i).get("chksId").equals(resultLists.get(j).getChksId()))
					resultLists.get(j).setDiscountTotal(Double.parseDouble(posCheckDiscountsByChksid.get(i).get("discountTotal").toString()));
			}
		}
	}

	/**
	 * 填写posCheckVo的discountItemTotal数据
	 */
	private void ProcessDiscountItemTotalData(List<PosCheckVo> resultLists, List<Map<String, Object>> posCheckDiscountsByChksid) {
		for (int i = 0; i < posCheckDiscountsByChksid.size(); i++) {
			for (int j = 0; j < resultLists.size(); j++) {
				if (posCheckDiscountsByChksid.get(i).get("chksId").equals(resultLists.get(j).getChksId()))
					resultLists.get(j).setCheckDiscountItemTotal(Double.parseDouble(posCheckDiscountsByChksid.get(i).get("checkDiscountItemTotal").toString()));
			}
		}
	}

	/**
	 * 获取结果集去重后的chksId
	 */
	private void processingChksIdData(List<PosCheckVo> resultLists, List<Object> chksIds) {
		for (PosCheckVo posCheckVo : resultLists)
			if (!chksIds.contains(posCheckVo.getChksId()))
				chksIds.add(posCheckVo.getChksId());
	}

}
