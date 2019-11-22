package MyServer.MyServlet;

import java.util.List;


import java.util.Map;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class WebApp {
	private static ServletContext contxt;
	static {
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser sax = factory.newSAXParser();
			WebHandler web = new WebHandler();
			System.out.println("\n------ start read xml--------"); //

			//hread.currentThread().getContextClassLoader().getResource("web.xml");

			sax.parse(Thread.currentThread().getContextClassLoader().getResourceAsStream("web.xml"), web);

			contxt = new ServletContext();
			Map<String, String> servlet = contxt.getServlet();

			// servlet-name servlet-class
			System.out.println("----------entity----------------");// *******************************************

			for (Entity entity : web.getEntityList()) {
				System.out.println(entity.getName() + "->" + entity.getClz());// ********************
				servlet.put(entity.getName(), entity.getClz());

			}

			// url-pattern servlet-name
			Map<String, String> mapping = contxt.getMapping();
			System.out.println("----------mapping----------------");// *******************************************

			for (Mapping mapp : web.getMappingList()) {
				List<String> urls = mapp.getUrlPattern();
				for (String url : urls) {
					System.out.println(url + "->" + mapp.getName());// ********************
					mapping.put(url, mapp.getName());
				}
			}
		} catch (Exception e) {
			System.out.println("get xml");
			System.out.println(e);
		}
	}

	@SuppressWarnings("deprecation")
	public static Servlet getServlet(String url)
			throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		if ((null == url) || (url = url.trim()).equals("")) {
			return null;
		}

		System.out.print(url + "->");
		System.out.print(contxt.getMapping().get(url)+"->");
		System.out.println(contxt.getServlet().get(contxt.getMapping().get(url))); // ******************

		// return contxt.getServlet().get(contxt.getMapping().get(url));
		String name = contxt.getServlet().get(contxt.getMapping().get(url));
		String path = "Servlet" + "." + name;
		Servlet temp = null;
		try {
			// System.out.println(path);
			temp = (Servlet) Class.forName(path).newInstance();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("xml"+name);
		}
		System.out.println("-----------"+ name + "---------------------");
		return temp;//
	}
}
