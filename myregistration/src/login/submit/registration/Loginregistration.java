package login.submit.registration;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/loginregistration")
public class Loginregistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Loginregistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		customerDOA cd=new customerDOAImp();
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String submitType=request.getParameter("submit");
		customer c=cd.getcustomer(username,password);
		if(submitType.equals("login") && c!=null && c.getname()!=null)
		{
			request.setAttribute("message",c.getname());
			request.getRequestDispatcher("welcome.jsp").forward(request,response);
		}else if(submitType.equals("registration"))
		{
			c.setusername(username);
			c.setname(request.getParameter("name"));
			c.setpassword(password);
			cd.insertcustomer(c);
			request.setAttribute("successmessage","Registration Done..!!!Plz logine to continue!!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}else{
			request.setAttribute("message","Data Not Found,click on Registration!!!");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
	}

}
