package Calculator;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
//@WebServlet("/add")

public class CalcServlet extends HttpServlet {

public void service(HttpServletRequest rq,HttpServletResponse rsp) throws IOException
{
	int i=Integer.parseInt(rq.getParameter("number1"));
	int j=Integer.parseInt(rq.getParameter("number2"));
	int sum=i+j;
	PrintWriter out=rsp.getWriter();
	out.println("Sum of two number is "+sum);
}
}
