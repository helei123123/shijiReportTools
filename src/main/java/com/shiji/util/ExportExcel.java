package com.shiji.util;

/**
 * @author ：jaylen
 * @date ：Created in 2019/8/20 15:17
 * @description：Export data to excel
 * @modified By：
 * @version: v1.0$
 */

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;

import java.io.OutputStream;
import java.util.List;

/**
 * 导出Excel公共方法
 *
 * @author jaylen
 * @version v1.0$
 */
public class ExportExcel {

	public ExportExcel() {
	}

	/**
	 * @param workbook
	 * @param sheetNum   (sheet的位置，0表示第一个表格中的第一个sheet)
	 * @param sheetTitle （sheet的名称）
	 * @param headers    （表格的标题）
	 * @param result     （表格的数据）
	 * @param out        （输出流）
	 * @throws Exception
	 * @Title: exportExcel
	 * @Description: 导出Excel的方法
	 * @author: jaylen @ 2019-08-24
	 */
	public void exportExcel(HSSFWorkbook workbook, int sheetNum,
	                        String sheetTitle, String[] headers, List<Object[]> result,
	                        OutputStream out) throws Exception {
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet();
		workbook.setSheetName(sheetNum, sheetTitle);
		// 设置表格默认列宽度为20个字节
		sheet.setDefaultColumnWidth((short) 20);
		// 生成一个样式
		HSSFCellStyle style = workbook.createCellStyle();
		// 设置这些样式
		style.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 生成一个字体
		HSSFFont font = workbook.createFont();
		font.setColor(HSSFColor.BLACK.index);
		font.setFontHeightInPoints((short) 12);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// 把字体应用到当前的样式
		style.setFont(font);

		// 指定当单元格内容显示不下时自动换行
		style.setWrapText(true);
		HSSFCellStyle style1 = workbook.createCellStyle();
		style1.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 产生表格标题行                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell((short) i);
			cell.setCellStyle(style);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text.toString());
		}
		// 遍历集合数据，产生数据行
		if (result != null) {
			int index = 1;
			for (Object[] m : result) {
				row = sheet.createRow(index);
				int cellIndex = 0;
				for (Object str : m) {
					HSSFCell cell = row.createCell((short) cellIndex);
					cell.setCellStyle(style1);
					cell.setCellValue(str.toString());
					cellIndex++;
				}
				index++;
			}
		}
	}

	public void exportInExcel(HSSFWorkbook workbook, int sheetNum,
	                          String sheetTitle, String[] headers, List<Object[]> result,
	                          OutputStream out) throws Exception {
		// 生成一个表格
		HSSFSheet sheet = workbook.createSheet();
		workbook.setSheetName(sheetNum, sheetTitle);
		// 设置表格默认列宽度为20个字节
		sheet.setDefaultColumnWidth((short) 18);
		// 生成一个样式
		HSSFCellStyle style = workbook.createCellStyle();
		// 设置这些样式
		style.setFillForegroundColor(HSSFColor.PALE_BLUE.index);
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 生成一个字体
		HSSFFont font = workbook.createFont();
		font.setColor(HSSFColor.BLACK.index);
		font.setFontHeightInPoints((short) 12);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		// 把字体应用到当前的样式
		style.setFont(font);

		// 指定当单元格内容显示不下时自动换行
		style.setWrapText(true);
		HSSFCellStyle style1 = workbook.createCellStyle();
		style1.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		// 产生表格标题行                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      qqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq
		HSSFRow row = sheet.createRow(0);
		for (int i = 0; i < headers.length; i++) {
			HSSFCell cell = row.createCell((short) i);
			cell.setCellStyle(style);
			HSSFRichTextString text = new HSSFRichTextString(headers[i]);
			cell.setCellValue(text.toString());
		}
		// 遍历集合数据，产生数据行
		if (result != null) {
			int index = 1;
			String temp = null;
			for (int i = 0; i < result.size(); i++) {
				row = sheet.createRow(index);
				int cellIndex = 0;
				if (temp == null)
					temp = result.get(i)[2].toString();
				if (!result.get(i)[2].equals(temp)) {
					for (Object str : result.get(i)) {
						HSSFCell cell = row.createCell((short) cellIndex);
						cell.setCellValue("");
						cellIndex++;
					}
					temp = result.get(i)[2].toString();
					i--;
				} else {
					for (Object str : result.get(i)) {
						HSSFCell cell = row.createCell((short) cellIndex);
						cell.setCellStyle(style1);
						cell.setCellValue(str.toString());
						cellIndex++;
					}
					temp = result.get(i)[2].toString();
				}
				index++;
			}
		}
	}
}
