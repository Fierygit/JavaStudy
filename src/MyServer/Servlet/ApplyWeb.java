package MyServer.Servlet;

import MyServer.MyServlet.Request;
import MyServer.MyServlet.Response;
import MyServer.MyServlet.Servlet;

public class ApplyWeb extends Servlet {
	
	public ApplyWeb() {

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
				"<head>\r\n" + 
				"	<title>chose one!!!!</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<div style=\"text-align: center;\"> ��ѡ��һ��web��������</div>\r\n" + 
				"		\r\n" + 
				"<br>\r\n" + 
				"<br>\r\n" + 
				"<div style=\"text-align: center;\">\r\n" + 
				"	<form method=\"post\" action=\"http://149.28.19.163:8888/web1\">\r\n" + 
				"		a web<input type=\"submit\" name=\"web1\" style=\"size: 20px\">\r\n" + 
				"	   </form>\r\n" + 
				"<br>\r\n" + 
				"<br>\r\n" + 
				"\r\n" + 
				"	   	<form method=\"post\" action=\"http://localhost:8888/web2\">\r\n" + 
				"		another web<input type=\"submit\" name=\"web2\">\r\n" + 
				"	   </form>\r\n" + 
				"\r\n" + 
				"</div>\r\n" + 
				"		\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
