import java.io.*;
import java.servlet.*;
import java.servlet.http.*;

public class InactiveIntervalServlet extends HttpServlet
{
	public void doGet(HttpServletRequest req,HttpservletResponse res)throws ServletException,IOException
	{
	response.setContentType("text/html");
	HttpSession session = request.getSession(true);
	out.println("The previous timeout was "+session.getMaxInactiveInterval()+"<br>");
	session.setMaxInterval(2*60*60);
	out.println("The newly assinged timeout is "+session.getMaxInactiveInterval()+"<br>");
	}
}