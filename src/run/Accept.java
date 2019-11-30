package run;
import java.util.*;
import java.io.*;
import java.io.Writer;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.*;
import javax.servlet.http.HttpSession;
/**
 * Servlet implementation class Accept
 */
public class Accept extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Accept() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//File file=new File("D:\\ObjectOriented\\Bank\\JavaVersionSDK\\ACPSample_B2C\\certs");
		//if(file.exists()) {
			//System.out.println(request.getRealPath("hello.txt"));
		//	System.out.println("file exist");
		//}
		//else {
//			System.out.println(request.getRealPath("hello.txt"));
//			System.out.println("not exist");
//		}
		HttpSession session=request.getSession(true);
		session.setAttribute("remoteIP", request.getRemoteAddr());
		String amount=request.getParameter("amount");
		double damount=Double.valueOf(amount);
		System.out.println(damount);
		int iamount=(int)(damount*100);
		String merId="77729005811004"+(int)((Math.random()*9+1)*Math.pow(10, 0));
		System.out.println("accept");
		String txnTime=(String)(new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()));
		String orderId=request.getParameter("orderID");
		//System.out.println("getServerName"+request.getServerName());
		Writer out=response.getWriter();
		System.out.print(merId);
		//out.write("<html>"+"<head></head><body><h1>"+request.getServerName()+"<br>"+merId+"</h1></body>"+"</html>");
		response.sendRedirect("http://"+request.getServerName()+":8080/ACPSample_B2C/form_6_2_FrontConsume?merId="+merId+"&txnAmt="+iamount+"&txnTime="+txnTime+"&orderId="+orderId);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
