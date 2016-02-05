package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Servlet01() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("this is Servlet01");
		System.out.println("fdsfds");
		

		System.out.println("000");


		System.out.println("eeit8316");
		System.out.println("haha");

	}

	
	protected void doPost(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		
		this.doGet(request, response);
	}

}
