package Addonserver;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Multiplication extends GenericServlet{
	
public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		int i1 = Integer.parseInt(req.getParameter("NUM1"));
		int i2 = Integer.parseInt(req.getParameter("NUM2"));
		int mul = i1*i2;
		PrintWriter printWriter = res.getWriter();
		
		printWriter.print("Multiplication is " +mul);
		printWriter.println();
		printWriter.println();
		printWriter.print("Multiplication is " +mul);
		
	}
	
	

}
