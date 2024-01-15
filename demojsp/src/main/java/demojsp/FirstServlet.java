package demojsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		System.out.println("I have created my first servlet");
		PrintWriter printWriter = res.getWriter();
		printWriter.print("I have created my first servlet and received the response in browser");
		
	}
	
	

}
