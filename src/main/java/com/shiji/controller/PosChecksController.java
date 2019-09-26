package com.shiji.controller;

import com.shiji.service.PosChecksServices;
import com.shiji.util.ResultFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
@Controller
@RequestMapping("/export")
public class PosChecksController {

	@Autowired
	private PosChecksServices posChecksServices;

	@RequestMapping("/index")
	public Object index() {
		return "ExcelExport";
	}

	@RequestMapping("/integrityReportIndex")
	public Object integrityReportIndex() {
		return "IntegrityReportIndex";
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
}
