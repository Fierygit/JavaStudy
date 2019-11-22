package MyServer.Servlet;

import MyServer.MyServlet.Request;
import MyServer.MyServlet.Response;
import MyServer.MyServlet.Servlet;

public class LoginWebcss extends Servlet {
	
	public LoginWebcss() {

	}
	
	@Override
	public void doGet(Request req, Response rep) throws Exception {
		//rep.println("success123.....");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		rep.println("	.test{\r\n" + 
				"		background: red;\r\n" + 
				"\r\n" + 
				"	}\r\n" + 
				"");
	}

}
