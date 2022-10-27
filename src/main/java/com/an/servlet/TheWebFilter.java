package com.an.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;

@WebFilter("/WebServlet")
public class TheWebFilter implements Filter{  //Filter有很多 先用servlet的
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("WebFilter init過濾器生成"); //過濾器生成
	}
	
	@Override
	public void destroy() {
		System.out.println("WebFilter destroy過濾器銷毀"); //過濾器銷毀
	}
	
	@Override
	public void doFilter(ServletRequest servletRequest, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request=(HttpServletRequest) servletRequest;
		System.out.println("WebFilter doFilter 1 "+request.getAttribute("filter"));
		chain.doFilter(request, response);//過濾器放行
		System.out.println("WebFilter doFilter 2 "+request.getAttribute("filter"));
	}
}
