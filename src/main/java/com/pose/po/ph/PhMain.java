package com.pose.po.ph;

import javax.servlet.ServletException;

import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PhMain {
	private static Logger logger = LoggerFactory.getLogger(PhMain.class);

	public static void main(String[] args) throws ServletException, LifecycleException  {
		Tomcat tomcat = new Tomcat();
		tomcat.setPort(8085);
		tomcat.getConnector().setURIEncoding("UTF-8");
		String path = PhMain.class.getResource("/").getPath();
		tomcat.addWebapp("", path.substring(0, path.indexOf("target")) + "src/main/webapp");
		tomcat.start();
		logger.info("Started tomcat");
		tomcat.getServer().await();
	}
}