package tech.luv2code.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
  private static final long serialVersionUID = 1L;
  String userNameString = "no username";

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
	  if(req.getParameter("name") != null) {
		  this.userNameString = req.getParameter("name");
	  }
	LocalDate now = LocalDate.now();
    resp.setContentType("text/html");
    PrintWriter outPrintWriter = resp.getWriter();
    outPrintWriter.println("Third Servlet called.");
    outPrintWriter.println(
      "This is implemented by extending HttpServlet - configured with web.xml"
    );
    outPrintWriter.println(
    		""" 
    		<h3>Form Submitted</h3>
    		<strong>Your name is: </strong>%s
    		<br>
    		Today's date is %s
    		""".formatted(this.userNameString, now) 
    		);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
    throws ServletException, IOException {
    System.out.println("post method called");
    this.doGet(req, resp);
  }
}
