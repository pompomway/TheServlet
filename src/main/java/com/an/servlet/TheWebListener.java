package com.an.servlet;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class TheWebListener implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {  //初始化
		// TODO Auto-generated method stub
		System.out.println("test WebListener contextInitialized監聽初始化"); //spring啟動前初始化
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) { //銷毀
		System.out.println("test WebListener contextDestroyed監聽銷毀");
	}

}
