package org.jvm;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;


public class JvmReport {
public static void jvmReportGenerate(String json) {
	File f =new File("C:\\Users\\user\\eclipse-workspace1\\Cucumber\\Reports\\JvmReport");
	Configuration c = new Configuration(f, "fb application");
	c.addClassifications("Browser", "Chrome");
	c.addClassifications("Platform", "Windows");
	List<String> l=new LinkedList<String>();
	l.add(json);
	ReportBuilder r = new ReportBuilder(l, c);
	r.generateReports();
}
}
