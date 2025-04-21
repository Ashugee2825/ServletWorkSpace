package datapack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SaveServlet
 */
@WebServlet("/SaveServlet")
public class SaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveServlet() {
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
	 String name = request.getParameter("ename");
		 
		 String password = request.getParameter("epassword");
		 
		 String email = request.getParameter("email");
		 
		 String country = request.getParameter("ecountry");
		 
		 Employee e=new Employee();
		 
		 e.setEname(name);
		 
		 e.setEpassword(password);
		 
		 e.setEcountry(country);
		 
		 int status =EmplDao.save(e);
		 
		 if(status>0)
		 {
			 out.println("Record Inserted Succeefuly!!!!!!!");
			 
			 RequestDispatcher rs = request.getRequestDispatcher("index.html");
			 rs.include(request,response);
			 
		 }
		 else
		 {
			 out.println("Record Not Inserted...........oooops");
		 }
		 
		 out.close();
		 out.println("SAVE SERVLET to Get  Hello "); 	
		
	}

}
