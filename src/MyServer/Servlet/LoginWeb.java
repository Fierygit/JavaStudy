package MyServer.Servlet;

import MyServer.MyServlet.Request;
import MyServer.MyServlet.Response;
import MyServer.MyServlet.Servlet;

public class LoginWeb extends Servlet {
	
	public LoginWeb() {

	}
	
	@Override
	public void doGet(Request req, Response rep) throws Exception {
		//rep.println("success123.....");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		rep.println("<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n " + 
				"	<title>\r\n" + 
				"		welcome to test!!!\r\n" + 
				"	</title>\r\n" + 
				"	<link rel=\"stylesheet\" type=\"text/css\" href=\"http://localhost:8888/LoginWebcss\">\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"	<div class=\"test\" style=\"text-align: center;\">\r\n" + 
				"       this is a try!!!!  no Id_number and password!!!\r\n" + 
				"       <br>\r\n" + 
				"       click �ύ������\r\n" + 
				"<br>\r\n" + 
				"<br>\r\n" + 
				"<br>\r\n" + 
				"	    <form method=\"post\" action=\"http://localhost:8888/app\">\r\n" + 
				"		输入<input type=\"text\" name=\"uname\">\r\n" + 
				"		����<input type=\"password\" name=\"pwd\">\r\n" + 
				"		<input type=\"submit\" name=\"login\">\r\n" + 
				"	</form>\r\n" + 
				"\r\n" + 
				"	</div>\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
