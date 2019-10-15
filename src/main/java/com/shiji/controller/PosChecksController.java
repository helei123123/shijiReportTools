package com.shiji.controller;

import com.shiji.service.PosActionLogsServices;
import com.shiji.service.PosChecksServices;
import com.shiji.util.ResultFormat;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/21 14:28
 * @description：poschecks控制层
 * @modified By：
 * @version: v1.0$
 */
@Slf4j
@Controller
@RequestMapping("/export")
public class PosChecksController {

	@Autowired
	private PosChecksServices posChecksServices;
	@Autowired
	private PosActionLogsServices posActionLogsServices;

	@RequestMapping("/index")
	public Object index() {
		return "ExcelExport";
	}

	@RequestMapping("/integrityReportIndex")
	public Object integrityReportIndex() {
		return "IntegrityReportIndex";
	}

	@RequestMapping("/logsIndex")
	public Object logsIndex() {
		return "logsReportIndex";
	}
	@RequestMapping("/excelExport")
	public Object excelExport(String outletCode, String checkNum, String businessDay, String timeType, String rangTime, Model model) {
		ResultFormat resultFormat = null;
		try {
			resultFormat = posChecksServices.findPosChecksByCheckNumAndOutletCodeAndBusinessDay(outletCode, checkNum, businessDay, timeType, rangTime);
		} catch (FileNotFoundException e) {
			resultFormat = new ResultFormat(3, null, null);
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(5, null, null);
		} catch (IOException e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(4, null, null);
		} catch (Exception e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(4, null, null);

		}
		model.addAttribute("Results", resultFormat);

		return "ExcelExport";
	}
	@RequestMapping("/integrityExcelExport")
	public Object integrityExcelExport(String businessDayRang, String timeType, String rangTime, Model model) {
		ResultFormat resultFormat = null;
		try {
			resultFormat = posChecksServices.findPosChecksByBusinessDay(businessDayRang,timeType,rangTime);
		}catch (FileNotFoundException e) {
			resultFormat = new ResultFormat(3, null, null);
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace(); 
			resultFormat = new ResultFormat(5, null, null);
		} catch (IOException e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(4, null, null);
		} catch (Exception e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(4, null, null);
		}
		model.addAttribute("Results", resultFormat);
		return "IntegrityReportIndex";
	}

	@RequestMapping("/logsReport")
	public Object logsReport(String businessDayRang,String checkNum,Model model){
		ResultFormat resultFormat = null;
		try {
			resultFormat =  posActionLogsServices.findByBusinessDayAndCheckNum(businessDayRang,checkNum);
		}catch (FileNotFoundException e) {
			resultFormat = new ResultFormat(3, null, null);
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(5, null, null);
		} catch (IOException e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(4, null, null);
		} catch (Exception e) {
			e.printStackTrace();
			resultFormat = new ResultFormat(4, null, null);
		}
		model.addAttribute("Results", resultFormat);
		return "logsReportIndex";
	}
}
