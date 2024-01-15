package car;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Car extends GenericServlet{
	
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		String nameofcar = req.getParameter("carName");
		
		System.out.println("I have created my third servlet");
		PrintWriter printWriter = res.getWriter();
		printWriter.print("Your car name  is " + nameofcar);
		
	}

}
