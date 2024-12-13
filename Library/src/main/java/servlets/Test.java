package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Test
 */
@WebServlet("/Test")
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		try {
			String fname = request.getParameter("first_name");
			String lname = request.getParameter("last_name");
			
			//String [] name = request.getParameterValues("name")); // in case we used one parameter called name with multiple values f name,l name.
			//out.println("Hello "+ name[0] + " " + name[1] + "<br>");
			out.println("Hello "+ fname + " " + lname);
			
			int age = Integer.parseInt(request.getParameter("age"));
			out.println("You are " + age +" years old <br>");
			
			Enumeration<String> params = request.getParameterNames() ;
			while(params.hasMoreElements()) {
				String param = params.nextElement();
				out.println("Parameter name "+param + "<br>");
			}
		}catch (Exception e) {
			out.println("Please enter a number!");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
