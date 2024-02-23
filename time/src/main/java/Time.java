import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Time extends HttpServlet {

   @Override
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      resp.setContentType("text/html");

      PrintWriter out = resp.getWriter();

      out.println("<html><body>");
      out.println("<h1>Current Time</h1>");

      Date currentTime = new Date();
      out.println("<p>" + currentTime.toString() + "</p>");

      out.println("</body></html>");

   }

}
