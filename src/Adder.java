

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Adder
 */
@WebServlet("/Adder")
public class Adder extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
	    response.setContentType("text/html");
	    
	    String val1 = request.getParameter("value1");
	    String val2 = request.getParameter("value2");
	    
	    int val1num = Integer.valueOf(val1);
	    int val2num = Integer.valueOf(val2);
	    
	    int result = val1num + val2num;	    

	    //Print writer writes to the socket
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<p>Sum of " + val1 + " and " + val2 + " is " + String.valueOf(result));
	    out.println("</body>");
	    out.println("</html>");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
	    response.setContentType("text/html");
	    
	    String val1 = request.getParameter("value1");
	    String val2 = request.getParameter("value2");
	    
	    int val1num = Integer.valueOf(val1);
	    int val2num = Integer.valueOf(val2);
	    
	    int result = val1num + val2num;

	    //Print writer writes to the socket
	    PrintWriter out = response.getWriter();
	    out.println("<html>");
	    out.println("<body>");
	    out.println("<p>Sum of " + val1 + " and " + val2 + " is " + String.valueOf(result));
	    out.println("</body>");
	    out.println("</html>");
	}
}
