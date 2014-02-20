package com.mkyong.common.controller;

import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;

public class HelloTag extends TagSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5375913536114043685L;

	public int doStartTag() {
		try {
			JspWriter out = pageContext.getOut();
			out.print("Hello,Tag!");
		} catch (Exception ex) {
			System.out.println("Error in HelloWorldTag class" + ex);
		}
		return (SKIP_BODY); // 返回一常量，告知已无标记体需处理
	}
}