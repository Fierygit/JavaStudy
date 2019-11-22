package MyServer.Servlet;

import MyServer.MyServlet.Request;
import MyServer.MyServlet.Response;
import MyServer.MyServlet.Servlet;

public class fireflycss extends Servlet {
	
	public fireflycss() {

	}
	
	@Override
	public void doGet(Request req, Response rep) throws Exception {
		//rep.println("success123.....");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		rep.println("#EntryTag {\r\n" + 
				"    margin-top: 20px;\r\n" + 
				"    font-size: 9pt;\r\n" + 
				"    color: gray\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#divRefreshComments {\r\n" + 
				"    text-align: right;\r\n" + 
				"    margin-right: 10px;\r\n" + 
				"    margin-bottom: 5px;\r\n" + 
				"    font-size: 9pt\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".topicListFooter {\r\n" + 
				"    text-align: right;\r\n" + 
				"    margin-right: 10px;\r\n" + 
				"    margin-top: 10px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"* {\r\n" + 
				"    margin: 0;\r\n" + 
				"    padding: 0\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"body {\r\n" + 
				"    color: #333;\r\n" + 
				"    background: #fff;\r\n" + 
				"    font-family: Verdana, Arial, Helvetica, sans-serif;\r\n" + 
				"    font-size: 10pt;\r\n" + 
				"    line-height: 1.8\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"img {\r\n" + 
				"    border: 0\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"li {\r\n" + 
				"    list-style: none\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"input,\r\n" + 
				"textarea {\r\n" + 
				"    border: 1px solid #999\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"h1,\r\n" + 
				"h2,\r\n" + 
				"h3,\r\n" + 
				"h4,\r\n" + 
				"h5,\r\n" + 
				"h6,\r\n" + 
				"th {\r\n" + 
				"    font-weight: bold;\r\n" + 
				"    color: #000\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"a {\r\n" + 
				"    text-decoration: none;\r\n" + 
				"    color: #333\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"a:hover {\r\n" + 
				"    color: #999\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#sideBar {\r\n" + 
				"    width: 220px;\r\n" + 
				"    float: left;\r\n" + 
				"    border: 1px solid #999;\r\n" + 
				"    border-top-width: 0;\r\n" + 
				"    overflow: hidden;\r\n" + 
				"    padding: 0 8px 40px 12px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#mainContent {\r\n" + 
				"    float: right;\r\n" + 
				"    margin-left: -250px;\r\n" + 
				"    width: 100%\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".forFlow {\r\n" + 
				"    margin: 0 16px 0 266px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#footer {\r\n" + 
				"    text-align: center\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#lnkBlogLogo {\r\n" + 
				"    display: none\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#blogTitle {\r\n" + 
				"    padding: 16px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#blogTitle h1 {\r\n" + 
				"    font-size: 17pt\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#blogTitle h2 {\r\n" + 
				"    font-size: 10.5pt;\r\n" + 
				"    color: #999\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#blogTitle .title {\r\n" + 
				"    font-size: 17pt\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#blogTitle .subtitle {\r\n" + 
				"    font-size: 10.5pt;\r\n" + 
				"    color: #999\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#navigator {\r\n" + 
				"    background: #f6f6f6;\r\n" + 
				"    border: 1px solid #ccc;\r\n" + 
				"    border-width: 1px;\r\n" + 
				"    height: 30px;\r\n" + 
				"    line-height: 30px;\r\n" + 
				"    color: #999;\r\n" + 
				"    padding-left: 15px;\r\n" + 
				"    padding-right: 5px;\r\n" + 
				"    padding-top: 2px\\9\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".blogStats {\r\n" + 
				"    float: right;\r\n" + 
				"    color: #999\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#navList li {\r\n" + 
				"    float: left;\r\n" + 
				"    margin-right: 20px;\r\n" + 
				"    font-size: 10.5pt\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#sideBar li,\r\n" + 
				".divRecentCommentAticle {\r\n" + 
				"    text-indent: -1.5em;\r\n" + 
				"    margin-left: 1.5em\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#sideBar h3,\r\n" + 
				"#MyIng .ing_title {\r\n" + 
				"    margin: 16px 0 0 -8px;\r\n" + 
				"    font-size: 14px;\r\n" + 
				"    text-align: left\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#sideBar .divRecentComment {\r\n" + 
				"    color: #666;\r\n" + 
				"    margin: 0 0 8px 8px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".ing_title a:link,\r\n" + 
				".ing_title a:visited,\r\n" + 
				".ing_title a:hover,\r\n" + 
				".ing_title a:active {\r\n" + 
				"    font-weight: bold\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"div.commentform textarea {\r\n" + 
				"    width: 450px;\r\n" + 
				"    height: 300px;\r\n" + 
				"    ont-size: 13px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".dayTitle {\r\n" + 
				"    display: none\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".entrylistTitle,\r\n" + 
				".thumbTitle,\r\n" + 
				".PostListTitle,\r\n" + 
				".forFlow h3 div,\r\n" + 
				".galleryTitle {\r\n" + 
				"    font-size: 14px;\r\n" + 
				"    font-weight: bold;\r\n" + 
				"    margin-top: 20px;\r\n" + 
				"    text-align: left\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".entrylistDescription,\r\n" + 
				".thumbDescription {\r\n" + 
				"    margin-left: 16px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".postTitle,\r\n" + 
				".entrylistPosttitle,\r\n" + 
				".feedback_area_title {\r\n" + 
				"    border-bottom: 1px solid #ddd;\r\n" + 
				"    font-size: 14px;\r\n" + 
				"    font-weight: bold;\r\n" + 
				"    margin: 20px 0 10px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".postBody p {\r\n" + 
				"    margin-top: 12px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".postBody h5 {\r\n" + 
				"    font-size: 10pt\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".commentform td div span {\r\n" + 
				"    margin-left: 12px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".gallery img {\r\n" + 
				"    margin: 8px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#taglist {\r\n" + 
				"    margin: 20px auto\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				".btn_my_zzk {\r\n" + 
				"    border: 0\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#sideBarMain {\r\n" + 
				"    padding-left: 0\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"#MyIng {\r\n" + 
				"    padding-left: 10px\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"p {\r\n" + 
				"    margin-top: 0;\r\n" + 
				"    margin-bottom: 0\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"div#sideBar div#side_ing_block ul li {\r\n" + 
				"    margin-left: 0;\r\n" + 
				"    text-indent: 0\r\n" + 
				"}\r\n" + 
				"\r\n" + 
				"@media only screen and (max-width:767px) {\r\n" + 
				"    #sideBar {\r\n" + 
				"        width: auto\r\n" + 
				"    }\r\n" + 
				"    .commentbox_main {\r\n" + 
				"        padding-right: 10px\r\n" + 
				"    }\r\n" + 
				"    div.commentform textarea {\r\n" + 
				"        width: 100%\r\n" + 
				"    }\r\n" + 
				"    #main {\r\n" + 
				"        padding: 0!important\r\n" + 
				"    }\r\n" + 
				"    #mainContent {\r\n" + 
				"        float: none!important;\r\n" + 
				"        margin-left: 0;\r\n" + 
				"        overflow: initial!important\r\n" + 
				"    }\r\n" + 
				"    .forFlow {\r\n" + 
				"        margin: 0 10px\r\n" + 
				"    }\r\n" + 
				"    #sideBar {\r\n" + 
				"        float: none!important;\r\n" + 
				"        margin-left: 0!important;\r\n" + 
				"        position: static!important\r\n" + 
				"    }\r\n" + 
				"}");
	}

}
