package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import java.io.IOException;
import java.io.PrintWriter;

public class Form extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");
      PrintWriter out = resp.getWriter();

      String fullName = req.getParameter("fullName");
      String email = req.getParameter("email");

      // Print to terminal
      System.out.println("User Input: " + fullName + " " + email);

      // Display input on new page
      out.println("<html><body>");
      out.println("<h1>User's data Entered from the form</h1>");
      out.println("<p>Full Name: " + fullName + "</p>");
      out.println("<p>Email: " + email + "</p>");
      out.println("</body></html>");
   }

   @Override
   protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      doGet(req, resp);
   }

}
