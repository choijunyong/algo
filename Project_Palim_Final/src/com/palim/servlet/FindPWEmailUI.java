package com.palim.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

public class FindPWEmailUI implements Action {

	@Override
	public String execute(HttpServletRequest request) throws ServletException, IOException {
		
		return "findPW_email.jsp";
	}

}
