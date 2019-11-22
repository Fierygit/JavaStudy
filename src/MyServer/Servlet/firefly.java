package MyServer.Servlet;

import MyServer.MyServlet.Request;
import MyServer.MyServlet.Response;
import MyServer.MyServlet.Servlet;

public class firefly extends Servlet {
	
	public firefly() {

	}
	
	@Override
	public void doGet(Request req, Response rep) throws Exception {
		//rep.println("success123.....");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		rep.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"zh-cn\">\r\n" + 
				"\r\n" + 
				"<head>\r\n" + 
				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\r\n" + 
				"    <meta name=\"referrer\" content=\"never\" />\r\n" + 
				"    <title>blog</title>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <link id=\"MainCss\" type=\"text/css\" rel=\"stylesheet\" href=\"fireflycss\" />\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"    <a name=\"top\"></a>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"    <div id=\"home\">\r\n" + 
				"        <div id=\"header\">\r\n" + 
				"            <div id=\"blogTitle\">\r\n" + 
				"\r\n" + 
				"                <!--done-->\r\n" + 
				"                <div class=\"title\"><a id=\"Header1_HeaderTitle\" class=\"headermaintitle\" href=\"\"> Firefly</a></div>\r\n" + 
				"                <div class=\"subtitle\">���Ų˵������ߣ�һ·����Ļ�</div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"            </div>\r\n" + 
				"            <!--end: blogTitle ���͵ı���͸����� -->\r\n" + 
				"            <div id=\"navigator\">\r\n" + 
				"\r\n" + 
				"                <ul id=\"navList\">\r\n" + 
				"                    <li id=\"nav_sitehome\"><a id=\"blog_nav_sitehome\" class=\"menu\" href=\"\"\r\n" + 
				"                            onclick=\"javaScript:alert('û����أ���')\">ѡ��</a></li>\r\n" + 
				"                    <li id=\"nav_myhome\"><a id=\"blog_nav_myhome\" class=\"menu\" href=\"\"\r\n" + 
				"                            onclick=\"javaScript:alert('�ۣ���')\">ѡ��</a></li>\r\n" + 
				"                    <li id=\"nav_newpost\"><a id=\"blog_nav_newpost\" class=\"menu\" rel=\"nofollow\" href=\"\"\r\n" + 
				"                            onclick=\"javaScript:alert('ûʲô�ã���')\">ѡ��</a></li>\r\n" + 
				"                    <li id=\"nav_contact\"><a id=\"blog_nav_contact\" class=\"menu\" rel=\"nofollow\" href=\"\"\r\n" + 
				"                            onclick=\"javaScript:alert('�Ժ���˵����')\">ѡ��</a></li>\r\n" + 
				"                    <li id=\"nav_rss\"><a id=\"blog_nav_rss\" class=\"menu\" href=\"\" onclick=\"javaScript:alert('����')\">ѡ��</a>\r\n" + 
				"                        <!--<a id=\"blog_nav_rss_image\" class=\"aHeaderXML\" \r\n" + 
				"    href=\"https://www.cnblogs.com/donlianli/rss\">\r\n" + 
				"    <img src=\"//www.cnblogs.com/images/xml.gif\" alt=\"����\" /></a>-->\r\n" + 
				"                    </li>\r\n" + 
				"                    <li id=\"nav_admin\"><a id=\"blog_nav_admin\" class=\"menu\" rel=\"nofollow\" href=\"\"\r\n" + 
				"                            onclick=\"javaScript:alert('��Ұ�򲻹���������ģ���')\">ѡ��</a></li>\r\n" + 
				"                </ul>\r\n" + 
				"\r\n" + 
				"                <div class=\"blogStats\">\r\n" + 
				"\r\n" + 
				"                    <div id=\"blog_stats\">\r\n" + 
				"\r\n" + 
				"                        <!--done-->\r\n" + 
				"                        ���-0&nbsp; ����-0&nbsp; ����-0&nbsp;\r\n" + 
				"                    </div>\r\n" + 
				"\r\n" + 
				"                </div>\r\n" + 
				"                <!--end: blogStats -->\r\n" + 
				"            </div>\r\n" + 
				"            <!--end: navigator ���͵����� -->\r\n" + 
				"        </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"        <!--end: header ͷ�� -->\r\n" + 
				"        <div id=\"main\">\r\n" + 
				"            <div id=\"mainContent\">\r\n" + 
				"                <div class=\"forFlow\">\r\n" + 
				"\r\n" + 
				"                    <div id=\"post_detail\">\r\n" + 
				"                        <!--done-->\r\n" + 
				"                        <div id=\"topics\">\r\n" + 
				"                            <div class=\"post\">\r\n" + 
				"                                <h1 class=\"postTitle\">\r\n" + 
				"                                    <a id=\"cb_post_title_url\" class=\"postTitle2\" href=\"\">���׷������Ľ���</a>\r\n" + 
				"                                </h1>\r\n" + 
				"                                <!-- <div class=\"clear\"></div> -->\r\n" + 
				"                                <div class=\"postBody\">\r\n" + 
				"                                    <div id=\"cnblogs_post_body\" class=\"blogpost-body\">\r\n" + 
				"                                        <p><strong>�����������ģʽ��chrome��</strong></p>\r\n" + 
				"\r\n" + 
				"                                        <p>&nbsp; &nbsp;���ȣ�������ᷢ��һ��ʲô��û�е�http����Ӧ�þ��ǲ���һ�¡�</p>\r\n" + 
				"\r\n" + 
				"                                        <p>&nbsp; &nbsp;���ţ��������ŷ���������������http���� ʱ��Ӧ����һ�����Ρ�</p>\r\n" + 
				"                                        <p>&nbsp; &nbsp;����������������������ҳ��û��css��js������оͻ�����������󡣶��������\r\n" + 
				"                                            ��ȵ�����css��js������ϲŻ���Ⱦ��ҳ��ʣ�µ�ͼƬ��Դ�����Ӧ���Ƕ�̬���أ�����http��post\r\n" + 
				"                                            ���󷽷�10G�ļ����¡�\r\n" + 
				"                                        </p>\r\n" + 
				"                                        <p>&nbsp;>&nbsp;&nbsp;&nbsp; ������Ҫ�������Դ�������֮�� ������ᷢ��һ��ͼ�������httpЭ�顣</p>\r\n" + 
				"\r\n" + 
				"                                        <p>&nbsp;>&nbsp;&nbsp;&nbsp; ����֪�������������ʽ֮�󣬴���������ĵ�һ�������������һ���������ж�\r\n" + 
				"                                            ���������Ĳ���С��3�Ͳ����������������ݴ���\r\n" + 
				"                                        </p>\r\n" + 
				"                                        <br>\r\n" + 
				"                                        <p><strong>���������������1</strong></p>\r\n" + 
				"                                        <p>&nbsp;&nbsp;&nbsp;&nbsp;����������Ĵ���ģʽ��ͨ���ж�http�Ĳ����ģ���̬���ز�ͬ��httpЭ���ʽ��</p>\r\n" + 
				"                                        <br>\r\n" + 
				"                                        <p><strong>���������������2</strong></p>\r\n" + 
				"                                        <p>&nbsp;&nbsp;&nbsp;&nbsp;�����ļ��е�Ѱ�ң�ͨ���жϲ����õ�������ļ�Ŀ¼��</p>\r\n" + 
				"                                        <p>&nbsp;</p>\r\n" + 
				"\r\n" + 
				"                                        <p><strong>���������������3</strong></p>\r\n" + 
				"                                        <p>&nbsp;&nbsp;&nbsp;&nbsp;���һ������html���ļ����࣬�����������ݿ⶯̬������ݡ�</p>\r\n" + 
				"                                        <p>&nbsp;</p>\r\n" + 
				"\r\n" + 
				"                                        <p><strong>���������������4</strong></p>\r\n" + 
				"                                        <p>&nbsp;&nbsp;�������ݿ�</p>\r\n" + 
				"\r\n" + 
				"                                        <br><br>\r\n" + 
				"                                        <p>&nbsp;������û��á�</p>\r\n" + 
				"                                        <p><img src=\"https://res.wx.qq.com/mpres/htmledition/images/icon/common/emotion_panel/emoji_wx/2_05.png\"\r\n" + 
				"                                                alt=\"\" data-ratio=\"1\" data-w=\"20\" />��</p>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                                        <div id=\"topics\">\r\n" + 
				"                                            <div class=\"post\">\r\n" + 
				"                                                <h1 class=\"postTitle\">\r\n" + 
				"                                                    <a id=\"cb_post_title_url\" class=\"postTitle2\"\r\n" + 
				"                                                        href=\"https://www.cnblogs.com/baby123/p/6477429.html\">nohup��&amp;��̨���У����̲鿴����ֹ</a>\r\n" + 
				"                                                </h1>\r\n" + 
				"                                                <div class=\"clear\"></div>\r\n" + 
				"                                                <div class=\"postBody\">\r\n" + 
				"                                                    <div id=\"cnblogs_post_body\" class=\"blogpost-body\">\r\n" + 
				"                                                        <p>1.nohup</p>\r\n" + 
				"                                                        <p>��;�����Ҷϵ��������</p>\r\n" + 
				"                                                        <p>�﷨��nohup Command [ Arg &hellip; ] [��&amp; ]</p>\r\n" + 
				"                                                        <p>���������Ƿ� nohup ���������ض����նˣ�����������ӵ���ǰĿ¼�� nohup.out �ļ��С�</p>\r\n" + 
				"                                                        <p>���������ǰĿ¼�� nohup.out �ļ�����д������ض��� $HOME/nohup.out �ļ��С�</p>\r\n" + 
				"                                                        <p>�������û���ļ��ܴ������������׷�ӣ���ô Command ����ָ��������ɵ��á�</p>\r\n" + 
				"                                                        <div class=\"lemma-main-content\">�˳�״̬������������г���ֵ��&nbsp;����</div>\r\n" + 
				"                                                        <div class=\"lemma-main-content\">����126 ���Բ��ҵ����ܵ��� Command\r\n" + 
				"                                                            ����ָ�������&nbsp;����</div>\r\n" + 
				"                                                        <div class=\"lemma-main-content\">����127 nohup �����������ܲ����� Command\r\n" + 
				"                                                            ����ָ�������&nbsp;����</div>\r\n" + 
				"                                                        <div class=\"lemma-main-content\">��������nohup ������˳�״̬�� Command\r\n" + 
				"                                                            ����ָ��������˳�״̬��</div>\r\n" + 
				"                                                        <p>2.&amp;</p>\r\n" + 
				"                                                        <p>��;���ں�̨����</p>\r\n" + 
				"                                                        <p>һ������һ����</p>\r\n" + 
				"                                                        <p>nohup command &amp;</p>\r\n" + 
				"                                                        <p>eg:</p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre class=\"brush:javascript;gutter:true;\"> nohup /usr/local/node/bin/node /www/im/chat.js &gt;&gt; /usr/local/node/output.log 2&gt;&amp;1 &amp;\r\n" + 
				"                                        </pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320150831908-545166421.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <p>���̺�7585</p>\r\n" + 
				"                                                        <p>�鿴���еĺ�̨����</p>\r\n" + 
				"                                                        <p>��1��jobs -l</p>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320150912955-1772662776.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <p>jobs����ֻ����ǰ�ն���Ч�ģ��ر��ն˺�����һ���ն�jobs�Ѿ��޷�������̨�ܵó����ˣ���ʱ����ps�����̲鿴���\r\n" + 
				"                                                        </p>\r\n" + 
				"                                                        <p>��2��ps -ef&nbsp;</p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre\r\n" + 
				"                                                                class=\"brush:javascript;gutter:true;\">ps -aux|grep chat.js</pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <pre> a:��ʾ���г��� <br /> u:���û�Ϊ���ĸ�ʽ����ʾ <br /> x:��ʾ���г��򣬲����ն˻�������</pre>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320153334877-1168175476.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <p>ע��</p>\r\n" + 
				"                                                        <p>������ps -def | grep���ҽ��̺ܷ��㣬���һ�����ǻ�grep�Լ�</p>\r\n" + 
				"                                                        <p>������grep -v�������Խ�grep�����ų���</p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre\r\n" + 
				"                                                                class=\"brush:javascript;gutter:true;\"> ps -aux|grep chat.js| grep -v grep</pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320153456502-1139370768.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <p>��������awk��ȡһ�½���ID��</p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre class=\"brush:javascript;gutter:true;\"> ps -aux|grep chat.js| grep -v grep | awk '{print $2}'\r\n" + 
				"                                        </pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320153606799-967154073.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <pre></pre>\r\n" + 
				"                                                        <p>3.���ĳ������������������ĳ���˿ڱ�ռ��</p>\r\n" + 
				"                                                        <p>�鿴ʹ��ĳ�˿ڵĽ���</p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre class=\"brush:javascript;gutter:true;\">lsof -i:8090\r\n" + 
				"                                        </pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320154514377-1985478430.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre class=\"brush:javascript;gutter:true;\">netstat -ap|grep 8090\r\n" + 
				"                                        </pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320154600658-246972161.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <p>�鿴������id֮��ʹ��netstat����鿴��ռ�õĶ˿�</p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre class=\"brush:javascript;gutter:true;\">netstat -nap|grep 7779\r\n" + 
				"                                        </pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320155041815-1272481492.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <p>ʹ��killɱ�����Ǻ�������</p>\r\n" + 
				"                                                        <p>4.��ֹ��̨���еĽ���</p>\r\n" + 
				"                                                        <div class=\"cnblogs_Highlighter\">\r\n" + 
				"                                                            <pre\r\n" + 
				"                                                                class=\"brush:javascript;gutter:true;\">kill -9  ���̺�</pre>\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <p><img src=\"https://images2015.cnblogs.com/blog/798214/201703/798214-20170320153728049-88100874.png\"\r\n" + 
				"                                                                alt=\"\" /></p>\r\n" + 
				"                                                        <p>&nbsp;</p>\r\n" + 
				"                                                    </div>\r\n" + 
				"                                                    <div id=\"MySignature\"></div>\r\n" + 
				"                                                    <div class=\"clear\"></div>\r\n" + 
				"                                                    <div id=\"blog_post_info_block\">\r\n" + 
				"                                                        <div id=\"BlogPostCategory\"></div>\r\n" + 
				"                                                        <div id=\"EntryTag\"></div>\r\n" + 
				"                                                        <div id=\"blog_post_info\">\r\n" + 
				"                                                        </div>\r\n" + 
				"                                                        <div class=\"clear\"></div>\r\n" + 
				"                                                        <div id=\"post_next_prev\"></div>\r\n" + 
				"                                                    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                                                </div>\r\n" + 
				"                                            </div>\r\n" + 
				"                                        </div>\r\n" + 
				"                                        <!-- ****** -->\r\n" + 
				"                                        <p>&nbsp;</p>\r\n" + 
				"                                    </div>\r\n" + 
				"                                    <div id=\"MySignature\"></div>\r\n" + 
				"                                    <div class=\"clear\"></div>\r\n" + 
				"                                    <div id=\"blog_post_info_block\">\r\n" + 
				"                                        <div id=\"BlogPostCategory\"></div>\r\n" + 
				"                                        <div id=\"EntryTag\"></div>\r\n" + 
				"                                        <div id=\"blog_post_info\">\r\n" + 
				"                                        </div>\r\n" + 
				"                                        <div class=\"clear\"></div>\r\n" + 
				"                                        <div id=\"post_next_prev\"></div>\r\n" + 
				"                                    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                                </div>\r\n" + 
				"\r\n" + 
				"                                <div style=\"text-align:right; margin-right: 40px; class=\" postDesc\">posted @\r\n" + 
				"                                    <span id=\"post-date\">2019-05-09 13:02</span>\r\n" + 
				"                                </div>\r\n" + 
				"                            </div>\r\n" + 
				"\r\n" + 
				"                        </div>\r\n" + 
				"                        <!--end: topics ���¡���������-->\r\n" + 
				"                    </div>\r\n" + 
				"                    <a name=\"!comments\"></a>\r\n" + 
				"                    <div id=\"blog-comments-placeholder\"></div>\r\n" + 
				"                    <div id='comment_form' class='commentform'>\r\n" + 
				"                        <a name='commentform'></a>\r\n" + 
				"                        <div id='divCommentShow'></div>\r\n" + 
				"                        <div id='comment_nav' style=\"text-align:right; margin-right: 40px; \"><span\r\n" + 
				"                                id='span_refresh_tips'></span>\r\n" + 
				"                            <br>\r\n" + 
				"                            <a href='#top'>���ض���</a></div>\r\n" + 
				"                        <br>\r\n" + 
				"                        <div id='comment_form_container'></div>\r\n" + 
				"                        <div class='ad_text_commentbox' id='ad_text_under_commentbox'></div>\r\n" + 
				"                        <div id='ad_t2'></div>\r\n" + 
				"                        <div id='opt_under_post'></div>\r\n" + 
				"                        <div id=\"footer\">\r\n" + 
				"\r\n" + 
				"                            <!--done-->\r\n" + 
				"                            Copyright &copy;2019\r\n" + 
				"                        </div>\r\n" + 
				"\r\n" + 
				"                    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                </div>\r\n" + 
				"                <!--end: forFlow -->\r\n" + 
				"            </div>\r\n" + 
				"            <!--end: mainContent ������������-->\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"            <div id=\"sideBar\">\r\n" + 
				"                <div id=\"sideBarMain\">\r\n" + 
				"\r\n" + 
				"                    <!--done-->\r\n" + 
				"                    <div class=\"newsItem\">\r\n" + 
				"                        <h3 class=\"catListTitle\">����</h3>\r\n" + 
				"                        <div id=\"blog-news\">�������ݣ�������ϧ\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"\r\n" + 
				"                    <div id=\"sidebar_shortcut\" class=\"sidebar-block\">\r\n" + 
				"                        <div class=\"catListLink\">\r\n" + 
				"                            <h3 class=\"catListTitle\">��������</h3>\r\n" + 
				"                            <ul>\r\n" + 
				"                                <li><a target=\"_blank\" href=\"https://www.baidu.com\" title=\"baidu\">�ٶ�</a></li>\r\n" + 
				"                                <li><a target=\"_blank\" target=\"_blank\" href=\"https://www.google.com\"\r\n" + 
				"                                        title=\"google\">google</a></li>\r\n" + 
				"                                <li><a target=\"_blank\" href=\"https://www.bing.cn\" title=\"bing\">bing</a></li>\r\n" + 
				"                                <li><a target=\"_blank\" href=\"https://www.cnblogs.com\" title=\"csdn\">csdn</a></li>\r\n" + 
				"\r\n" + 
				"                            </ul>\r\n" + 
				"                        </div>\r\n" + 
				"                    </div>\r\n" + 
				"\r\n" + 
				"                    <div id=\"leftcontentcontainer\">\r\n" + 
				"                        <h3 class=\"catListTitle\">others</h3>\r\n" + 
				"                        <p>abcdefghijklmnopqrstuvwxyz</p>\r\n" + 
				"\r\n" + 
				"                        <div id=\"blog-sidecolumn\"></div>\r\n" + 
				"                    </div>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"                </div>\r\n" + 
				"                <!--end: sideBarMain -->\r\n" + 
				"            </div>\r\n" + 
				"            <!--end: sideBar ��������� -->\r\n" + 
				"            <div class=\"clear\"></div>\r\n" + 
				"        </div>\r\n" + 
				"        <!--end: main -->\r\n" + 
				"        <div class=\"clear\"></div>\r\n" + 
				"\r\n" + 
				"        <!--end: footer -->\r\n" + 
				"    </div>\r\n" + 
				"    <!--end: home �Զ����������� -->\r\n" + 
				"\r\n" + 
				"</body>\r\n" + 
				"\r\n" + 
				"</html>��");
	}

}
