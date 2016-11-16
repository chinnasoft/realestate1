package com.chinnasoft.realestate.utils;
/**
 *    File       :   JasperReportPdfCreation.java
 *    Package    :   com.ariel.hmserp.utils
 *    Created    :   Sep 26, 2014 3:48:21 PM
 *    Project    :   Hospital Management System ERP
 *    Author     :   Kavuri Suresh Babu
 *    Company    :   Ariel Technologies PVT LTD.
 **//*

package com.ariel.hmserp.utils;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;

import org.springframework.stereotype.Component;

import com.ariel.hmserp.dto.IpdPatientsReportsDTO;

@Component("jasperCreationPdf")
public class JasperReportPdfCreation {

	public JasperPrint generatePrint(String pathJrxml,
			Map<String, Object> parameterMap, List<Map<String, Object>> dataList)
			throws JRException {
		JasperReport report = JasperCompileManager.compileReport(pathJrxml);
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource(
				dataList);
		JasperPrint print = JasperFillManager.fillReport(report, parameterMap,
				beanColDataSource);
		return print;
	}

	
	public JasperPrint generatePrint1(String pathJrxml,
			Map<String, Object> parameterMap)
			throws JRException {
		JasperReport report = JasperCompileManager.compileReport(pathJrxml);
		@SuppressWarnings("unchecked")
		JRBeanCollectionDataSource beanColDataSource = new JRBeanCollectionDataSource((Collection<String>) parameterMap);
		JasperPrint print = JasperFillManager.fillReport(report, parameterMap,
				beanColDataSource);
		return print;
	}
	public void jasperPdfCreation(String pathJrxml,
			Map<String, Object> parameterMap,
			List<Map<String, Object>> dataList, String downloadName,
			HttpServletResponse response, HttpServletRequest request)
			throws JRException, IOException {

		JasperPrint print = generatePrint(pathJrxml, parameterMap, dataList);

		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename="
				+ (downloadName));
		JasperExportManager.exportReportToPdfStream(print,
				response.getOutputStream());

	}

	
	public void jasperPdfCreation1(String pathJrxml,
			Map<String, Object> parameterMap,
			 String downloadName,
			HttpServletResponse response, HttpServletRequest request)
			throws JRException, IOException {

		JasperPrint print = generatePrint1(pathJrxml, parameterMap);

		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename="
				+ (downloadName));
		JasperExportManager.exportReportToPdfStream(print,
				response.getOutputStream());

	}
	public void jasperPdfCreation(JasperPrint print, String downloadName,
			HttpServletResponse response) throws JRException, IOException {

		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename="
				+ (downloadName));
		JasperExportManager.exportReportToPdfStream(print,
				response.getOutputStream());

	}

	public void createSinglePdfFile(List<JasperPrint> jasPrnList,
			String downloadName, HttpServletResponse response)
			throws JRException, IOException {
		response.setContentType("application/pdf");
		response.setHeader("Content-Disposition", "attachment; filename="
				+ (downloadName));
		JRPdfExporter PdfExporter = new JRPdfExporter();
		PdfExporter.setExporterInput(SimpleExporterInput
				.getInstance(jasPrnList));
		PdfExporter.setExporterOutput(new SimpleOutputStreamExporterOutput(
				response.getOutputStream()));
		PdfExporter.exportReport();

	}
	
	

}
*/