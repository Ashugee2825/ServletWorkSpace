package hideform;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("tex/html");
		 
		 PrintWriter out = response.getWriter();
		 
	     String name = request.getParameter("name");
	     
		 HttpSession session =request.getSession(false);
		 
		 String uname =(String)session.getAttribute("name");
		 
		 out.println( "<html>");
		 
	     out.println( "<body style = 'background -color:orange>");
	     
	     out.println( "<h1>" +"Welcome TO Hidden Form"+"</h1>");
	     out.println( "</body></html>");
	     
			out.close();
		
		
	}

}
