package datapack;

import java.io.IOException;


import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/ViewServlet")
public class ViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	List<Employee> list;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServlet() {
        super();
        // TODO Auto-generated constructor stub
 
    }
    	protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
    		// TODO Auto-generated method stub
    		
		
		response.setContentType("tex/html");
		 
		 PrintWriter out = response.getWriter();
		 
		 out.println(" Hello from View Servlet ");
		 
		       try {
		        	 list = EmplDao.getAllEmployees();
		        	
		        } catch (ClassNotFoundException e) {
		        	
		       e.printStackTrace();
    	}
		 out.println(" <html><body style = background-color:red; >");
		 out.println(" <table border ='1'>");
		 out.println(" <tr><td>Id</td><td>Name</td><td>Password</td><td>Email></td><td>COuntry</td></tr>");		 
	     for (Employee e:list)
	     {
	    	 out.println(" <tr><td>> "+e.getId()+"</td><td>" +e.getEname()+""
	    + "</td><td>" +e.getEmail() +"</td><td>" +e.getEcountry()+"</td><td>"+ ""
	   + "<a href ='EditServlet?id="+e.getId()+"'>Edit Employee</a></td>"
	   + "<a href ='DeleteServlet?id=\"+e.getId()+\"'>Delete Employee</a></td></tr>");
	     }
	     out.println(" </table> ");
	     out.println("</body> </html> ");
           out.close();
	}
}
