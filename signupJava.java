package servlet_pack;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class signupJava
 */
public class signupJava extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public signupJava() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		
		String name = request.getParameter("fullname");
		String email = request.getParameter("email");
		String pasw1 = request.getParameter("password");
		String pasw2 = request.getParameter("confirm_password");
		
		if(pasw1.equals(pasw2))
		{
		  	 //pw.print("<h1><center>Hello "+name+"</center></h1>");
			//response.sendRedirect("https://www.youtube.com/");
			RequestDispatcher rd=request.getRequestDispatcher("/login_signup.html");
			rd.forward(request, response);
		}
		else {
			pw.print("<h1><center>Password mismatch!!</center></h1>");
			
			//RequestDispatcher rd=request.getRequestDispatcher("/login_signup.html");
			//rd.include(request, response);
		}

		
		
		
	}

}
