package com.shiji.serviceImpl;

import com.shiji.mapper.pos.PosActionLogsMapper;
import com.shiji.mapper.pos.PosBusinessDaysMapper;
import com.shiji.service.PosActionLogsServices;
import com.shiji.util.EnCapsulateQueryDate;
import com.shiji.util.ExportExcel;
import com.shiji.util.ResultFormat;
import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * @author ：jaylen
 * @date ：Created in 2019/10/15 9:30
 * @description：posActionLogsServices
 * @modified By：
 * @version: v1.0$$
 */
@Slf4j
@Service
public class PosActionLogsServicesImpl implements PosActionLogsServices {
	@Autowired
	private PosActionLogsMapper posActionLogsMapper;
	@Autowired
	private PosBusinessDaysMapper posBusinessDaysMapper;
	@Override
	public ResultFormat findByBusinessDayAndCheckNum(String businessDayRang, String checkNum) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date beginDate = null;
		Date endDate = null;
		//设置导出excel的标题栏
		String headRow[] = {"alog_id", "alog_key", "alog_user_id", "alog_action_time", "alog_action_loctime", "alog_action_result", "alog_table", "alog_record_id", "alog_shop_id", "alog_olet_id", "alog_bday_id", "alog_bper_id", "alog_stat_id", "alog_chks_id", "alog_cpty_id", "alog_citm_id", "alog_cdis_id", "alog_cpay_id", "alog_remark", "alog_slave_id", "alog_slave_created", "alog_slave_modified", "alog_sync_id", "created", "modified"};
		//进行查询的数据的切分
		if (!StringUtils.isEmpty(businessDayRang)) {
			StringBuilder sb = new StringBuilder();
			String[] businessDateArry = businessDayRang.split("-");
			beginDate = sdf.parse(sb.append(businessDateArry[0]).append("-").append(businessDateArry[1]).append("-").append(businessDateArry[2]).toString());
			StringBuilder sb1 = new StringBuilder();
			endDate = sdf.parse(sb1.append(businessDateArry[3]).append("-").append(businessDateArry[4]).append("-").append(businessDateArry[5]).toString());
		}
		if(beginDate!=null && !StringUtils.isEmpty(beginDate.toString())){
			List<String> sDayIds = posBusinessDaysMapper.findDateRangByDayId(beginDate, endDate);
			if (sDayIds == null || sDayIds.size() == 0)
				return new ResultFormat(1, "当前的营业日范围不存在!", null);
		}
		List<Map<String, Object>> result = posActionLogsMapper.findByBusinessDayAndCheckNum(beginDate, endDate, checkNum);
		if(result==null || result.size() ==0)
			return new ResultFormat(2, "账单编号不存在!", null);
		List<Object[]> resultObjectArr = EnCapsulateQueryDate.encapsulateQueryData(result, headRow);
		//设置文件的名称以及路径
		if(beginDate==null){
			beginDate=new Date();
		}
		String title = sdf.format(beginDate) + "-" + new Random().nextInt(500);
		File file = new File("");
		File file1 = new File(file.getCanonicalPath() + "\\actionLogsReport\\");
		//判断文件夹是否存在不存在则创建
		if (!file1.exists()) {
			file1.mkdir();
		}
		//将处理好的数据写入excel表中
		OutputStream out = new FileOutputStream(file.getCanonicalPath() + "\\actionLogsReport\\" + title + ".xls");
		ExportExcel eeu = new ExportExcel();
		HSSFWorkbook workbook = new HSSFWorkbook();
		eeu.exportExcel(workbook, 0, "actionLogsReport", headRow, resultObjectArr, out);
		workbook.write(out);
		out.close();
		return new ResultFormat(200,"导出成功!","");
	}
}
