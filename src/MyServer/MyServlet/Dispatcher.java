package MyServer.MyServlet;

import java.io.IOException;
import java.net.Socket;

/**
 * 
 * @author Administrator
 *
 */
public class Dispatcher implements Runnable {
	private Socket client;
	private Request req;
	private Response rep;
	private int code = 200;

	Dispatcher(Socket client) {
		this.client = client;
		try {
			System.out.println("a client is trying to connect!!!");
			req = new Request(client.getInputStream());
		
			String url = req.getUrl();
			if(url.length() >= 3) {
				String contentType = url.substring(url.length() - 3,url.length());
				System.out.println("-----request for "+ contentType);
				rep = new Response(client.getOutputStream(),contentType);
			}
		
			
		} catch (IOException e) {
			// e.printStackTrace();
			System.out.println("error456");
			code = 500;
			return;
		}
	}



	@Override
	public void run() {
		
	       System.out.println("-------------url-----------");
	       System.out.println(req.getUrl());
			if(req.getUrl() == "" || req.getUrl().trim() == "") {
				return;
			}
		       
		       
			try {
				
				Servlet serv = WebApp.getServlet(req.getUrl()); 

				if (null == serv) {
					this.code = 404;
				} else {
					serv.service(req, rep);
				}
				rep.pushToClient(code); 
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("error001");
			
				//e.printStackTrace();
				this.code = 500;
			}
		
		try {
			rep.pushToClient(500);
		} catch (IOException e) {
			System.out.println("it is error!!");
			//e.printStackTrace();
		}

		req.close();
		rep.close();
		try {
			this.client.close();
			System.out.println("-----reacte over\n\n");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
