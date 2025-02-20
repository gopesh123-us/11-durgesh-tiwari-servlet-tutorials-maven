package tech.luv2code.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FirstServlet implements Servlet {
  private ServletConfig config;

  @Override
  public void init(ServletConfig config) throws ServletException {
    this.config = config;
    System.out.println("FirstServlet Initialized");
  }

  @Override
  public ServletConfig getServletConfig() { // TODO Auto-generated method stub
    return this.config;
  }

  @Override
  public void service(ServletRequest req, ServletResponse res)
    throws ServletException, IOException {
    System.out.println("Service method of FirstServlet called");
    res.setContentType("text/html");
    PrintWriter outPrintWriter = res.getWriter();
    outPrintWriter.println("""
    		<h1>Hello World of Servlets</h1>
    		<p>Hello from First Servlet</p>
    		</br>
    		""");
    outPrintWriter.println("""
    	    Here is the servlet info:&nbsp;""" + getServletInfo() + "</br>");
    outPrintWriter.println(getServletConfig().getServletContext().getContextPath());
  }

  @Override
  public String getServletInfo() { // TODO Auto-generated method stub
    return this.config.getServletName();
  }

  @Override
  public void destroy() {
    System.out.println("First Servlet Destroyed");
  }
}
