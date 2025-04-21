package mypack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;

/**
 * Servlet Filter implementation class MyFilter
 */
@WebFilter("/FirstServlet")
public class MyFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here

		// pass the request along the filter chain
		
		boolean flag = false;
		 String sname_error = " ",semail_error = "", scourse ="";
		    response.setContentType("tex/html");
			
			PrintWriter out = response.getWriter();
			
			 String sname = request.getParameter("uname");
		     String semail = request.getParameter("semail");
		     String course = request.getParameter("scourse");
		     
		     
		     if(sname == null || sname.equals(""))
		     {
		    	 sname_error =" Name is Requiresd";
		    	 flag =false;
		     }
		     
		     if(semail == null || semail.equals(""))
		     {
		    	 semail_error =" Email is Requiresd";
		    	 flag = false;
		     }
		     
		     if(course == null || course.equals(""))
		     {
		    	 course =" course is Requiresd";
		    	 flag = false;
		     }
		     
			out.println( "<h1>"+ "Welcome To Uplaztz"+"</h1>");
		     
		     out.println(" <html><body style = background-color:red; >");
		     out.println( "<h1>"+ "Student Registration Form "+"</h1>");
		     out.println( "<h1>"+ "Welcome To Uplaztz"+"</h1>");
		     out.println( " <form method = 'POST' action='FirstServlet'>");
			 out.println(" <table border ='1'>");
			 out.println(" <tr>");
			 
			 out.println(" <td>StudentName</td>");
			 out.println("<td><input type='text' name='uname 'value = '+sname+'></td>	");
			 out.println("<td><font color ='yellow' sizw='5'<b> "+sname_error+" </b></font> </td>	");
			 out.println("</tr>");
			 
			 out.println(" <tr>");
			 out.println(" <td>StudentName</td>");
			 out.println("<td><input type='text' name='uname 'value = '+sname+'></td>	");
			 out.println("<td><font color ='yellow' sizw='5'<b> "+sname_error+" </b></font> </td>	");
			 out.println("</tr>");
			 
			 out.println(" <tr>");
			 out.println(" <td>StudentEmail</td>");
			 out.println("<td><input type='text' name='uemail 'value = '+semail+'></td>	");
			 out.println("<td><font color ='yellow' sizw='5'<b> "+sname_error+" </b></font> </td>	");
			 out.println("</tr>");
			 
			 out.println(" <tr>");
			 out.println(" <td>StudentCourse</td>");
			 out.println("<td><input type='text' name='Course 'value = '+scourse+'></td>	");
			 out.println("<td><font color ='yellow' sizw='5'<b> "+sname_error+" </b></font> </td>	");
			 out.println("</tr>");
			 
		     out.println(" </table> ");
		     out.println( "</body></html>");
		     
		     if (flag ==true){
		    	 chain.doFilter(request, response);
		     }
		     
		     else {
		    	 out.println(" <html><body style = background-color:red; >");
			     out.println( "<h1>"+ "Student Registration Form "+"</h1>");
			     out.println( "<h1>"+ "Welcome To Uplaztz"+"</h1>");
			     out.println( " <form method = 'POST' action='FirstServlet'>");
				 out.println(" <table border ='1'>");
				 out.println(" <tr>");
				 
				 out.println(" <td>StudentName</td>");
				 out.println("<td><input type='text' name='uname 'value = '+sname+'></td>	");
				 out.println("<td><font color ='yellow' sizw='5'<b> "+sname_error+" </b></font> </td>	");
				 out.println("</tr>");
				 
				 out.println(" <tr>");
				 out.println(" <td>StudentName</td>");
				 out.println("<td><input type='text' name='uname 'value = '+sname+'></td>	");
				 out.println("<td><font color ='yellow' sizw='5'<b> "+sname_error+" </b></font> </td>	");
				 out.println("</tr>");
				 
				 out.println(" <tr>");
				 out.println(" <td>StudentEmail</td>");
				 out.println("<td><input type='text' name='uemail 'value = '+semail+'></td>	");
				 out.println("<td><font color ='yellow' sizw='5'<b> "+semail_error+" </b></font> </td>	");
				 out.println("</tr>");
				 
				 out.println(" <tr>");
				 out.println(" <td>StudentCourse</td>");
				 out.println("<td><input type='text' name='Course 'value = '+scourse+'></td>	");
				 out.println("<td><font color ='yellow' sizw='5'<b> "+course+" </b></font> </td>	");
				 out.println("</tr>");
				 
				 out.println(" <tr>");
				 out.println("<td><input type='submit' value='REGISTER'> </td>"); 
				 out.println("</tr>");
				 
				 
			     out.println(" </table> ");
			     out.println( "</body></html>");
		     }
	
		
		
		
		
		
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
