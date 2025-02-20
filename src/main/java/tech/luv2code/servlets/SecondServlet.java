package tech.luv2code.servlets;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "secondServlet", urlPatterns = { "/second" })
public class SecondServlet extends GenericServlet {
  private static final long serialVersionUID = 1L;

  @Override
  public void service(ServletRequest req, ServletResponse res)
    throws ServletException, IOException {
    PrintWriter pWriter = res.getWriter();
    pWriter.println("This is second servlet");
    pWriter.println(
      "This is implemented by extending GenericServlet. Only service method is implemented"
    );
  }
}
