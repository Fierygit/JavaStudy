package MyServer.Servlet;


import MyServer.MyServlet.Request;
import MyServer.MyServlet.Response;
import MyServer.MyServlet.Servlet;

public class Web1 extends Servlet {
	
	public Web1() {

	}
	
	@Override
	public void doGet(Request req, Response rep) throws Exception {
		//rep.println("success123.....");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		rep.println("<!DOCTYPE html>\r\n" + 
				"<head>\r\n" + 
				"<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n" + 
				"<title>Snake</title>\r\n" + 
				"<style>\r\n" + 
				"  *                         { margin:0; padding:0; font-family:Verdana,����; font-size:12px;}\r\n" + 
				"  table#map { width:auto; height:auto; margin:0 auto; border-collapse:collapse; border-spacing:0; background-color:#EAEAEA; clear:both;}\r\n" + 
				"  td                 { width:10px; height:10px; border:1px solid black;}\r\n" + 
				"  .shead         { background-color: orangered;}\r\n" + 
				"  .sbody         { background-color: black;}\r\n" + 
				"  .sfood         { background-color: orangered;}\r\n" + 
				"  .info        { width:400px; margin:0 auto; padding:3em 0;}\r\n" + 
				"  .info li{ float:left; height:30px; margin-right:2em; line-height:30px;}\r\n" + 
				"</style>\r\n" + 
				"<script type=\"text/javascript\" language=\"javascript\">\r\n" + 
				"function Snake(){\r\n" + 
				"        this.rows = 20;\r\n" + 
				"        this.cols = 40;\r\n" + 
				"        this.speed = 200;\r\n" + 
				"        this.currKey = 0;//��ǰ����\r\n" + 
				"        this.timer = 0;\r\n" + 
				"        this.sid = \"snakeObj\"+parseInt(Math.random()*100000);\r\n" + 
				"        eval(this.sid+\"=this\");\r\n" + 
				"        this.pos = [];//����\r\n" + 
				"        this.foodPos = {\"x\":-1,\"y\":-1};\r\n" + 
				"        this.foodNum = 0;\r\n" + 
				"        this.domTab = document.getElementById(\"map\");//��ͼ\r\n" + 
				"        this.pause = 1;//1,-1\r\n" + 
				"}\r\n" + 
				"Snake.prototype.init = function(){\r\n" + 
				"        this.map();\r\n" + 
				"        arguments[0] ? this.speed=arguments[0] : false;//ѡ���ٶ�\r\n" + 
				"        this.pos = [{\"x\":2,\"y\":5},{\"x\":1,\"y\":5},{\"x\":0,\"y\":5}];\r\n" + 
				"        for( j in this.pos ){//��ȫ��,moveֻ��ͷβ\r\n" + 
				"                this.domTab.rows[this.pos[j].y].cells[this.pos[j].x].className=\"sbody\";\r\n" + 
				"        }\r\n" + 
				"        this.domTab.rows[this.pos[0].y].cells[this.pos[0].x].className=\"shead\";\r\n" + 
				"        this.currKey = 0;\r\n" + 
				"        this.foodNum = 0;\r\n" + 
				"        this.food();\r\n" + 
				"        this.pause = 1;\r\n" + 
				"}\r\n" + 
				"Snake.prototype.trigger = function(e){\r\n" + 
				"        var e = e||event;\r\n" + 
				"        var eKey = e.keyCode||e.which||e.charCode;\r\n" + 
				"        if( eKey>=37 && eKey<=40 && eKey!=this.currKey && !( (this.currKey == 37 && eKey == 39) || (this.currKey == 38 && eKey == 40) || (this.currKey == 39 && eKey == 37) || (this.currKey == 40 && eKey == 38) ) && this.pause==-1 ){//��Ӧ:�������� & ���ǵ�ǰ���� & ���Ƿ����� & ������ͣ״̬\r\n" + 
				"                this.currKey = eKey;                \r\n" + 
				"        }else if( eKey==32 ){//�ո�:��ͣ,��ʼ\r\n" + 
				"                this.currKey = (this.currKey==0) ? 39 : this.currKey;\r\n" + 
				"                ((this.pause*=-1)==-1) ? this.timer=window.setInterval(this.sid+\".move()\",this.speed) : window.clearInterval(this.timer);\r\n" + 
				"        }\r\n" + 
				"};\r\n" + 
				"Snake.prototype.move = function(){//��ͷ��ɾβ�͡�������\r\n" + 
				"        switch(this.currKey){\r\n" + 
				"                case 37: \r\n" + 
				"                        if( this.pos[0].x <= 0 ){ this.die(); return; }//ײǽ\r\n" + 
				"                        else{ this.pos.unshift( {\"x\":this.pos[0].x-1,\"y\":this.pos[0].y}); }//����ͷ\r\n" + 
				"                        break;//left\r\n" + 
				"                case 38: \r\n" + 
				"                        if( this.pos[0].y <= 0 ){ this.die(); return; }\r\n" + 
				"                        else{ this.pos.unshift( {\"x\":this.pos[0].x,\"y\":this.pos[0].y-1}); }\r\n" + 
				"                        break;//up\r\n" + 
				"                case 39:\r\n" + 
				"                        if( this.pos[0].x >= this.cols-1 ){ this.die(); return; }\r\n" + 
				"                        else{ this.pos.unshift( {\"x\":this.pos[0].x+1,\"y\":this.pos[0].y}); }\r\n" + 
				"                        break;//right\r\n" + 
				"                case 40: \r\n" + 
				"                        if( this.pos[0].y >= this.rows-1 ){ this.die(); return; }\r\n" + 
				"                        else{ this.pos.unshift( {\"x\":this.pos[0].x,\"y\":this.pos[0].y+1}); }\r\n" + 
				"                        break;//down\r\n" + 
				"        };\r\n" + 
				"                \r\n" + 
				"        if( this.pos[0].x == this.foodPos.x && this.pos[0].y == this.foodPos.y ){//�Ե�ʳ��\r\n" + 
				"                this.foodPos.x = -1;//ʳ�ﱻ��,��ɾ��β\r\n" + 
				"                this.food();\r\n" + 
				"        }else if( this.currKey != 0 ){//ɾ��β,initʱ��ɾ\r\n" + 
				"                this.domTab.rows[this.pos[this.pos.length-1].y].cells[this.pos[this.pos.length-1].x].className=\"\";\r\n" + 
				"                this.pos.pop();\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        for( i=3;i<this.pos.length;i++ ){//���ߵĵ��Ľڿ�ʼ�ж��Ƿ�ײ���Լ��� ��Ϊ��ͷΪ���� �����ڲ����ܹչ���\r\n" + 
				"                if( this.pos.x == this.pos[0].x && this.pos.y == this.pos[0].y ){ \r\n" + 
				"                        this.die();\r\n" + 
				"                        return;\r\n" + 
				"                }\r\n" + 
				"        }\r\n" + 
				"        \r\n" + 
				"        this.domTab.rows[this.pos[0].y].cells[this.pos[0].x].className=\"shead\";//����ͷ\r\n" + 
				"        this.domTab.rows[this.pos[1].y].cells[this.pos[1].x].className=\"sbody\";//��ͷ������\r\n" + 
				"};\r\n" + 
				"Snake.prototype.die = function(){\r\n" + 
				"        alert(\"x_x\");\r\n" + 
				"        window.clearInterval(this.timer);\r\n" + 
				"        this.init();\r\n" + 
				"}\r\n" + 
				"Snake.prototype.food = function(){//����ʳ��\r\n" + 
				"        if( this.foodPos.x == -1 ){//�Ѵ���ʱλ�ò���\r\n" + 
				"                do{\r\n" + 
				"                        this.foodPos.y = Math.round( Math.random()*(this.rows-1) );\r\n" + 
				"                        this.foodPos.x = Math.round( Math.random()*(this.cols-1) );\r\n" + 
				"                }\r\n" + 
				"                while( this.domTab.rows[this.foodPos.y].cells[this.foodPos.x].className != \"\" )//��ֹ������������\r\n" + 
				"        }\r\n" + 
				"    this.domTab.rows[this.foodPos.y].cells[this.foodPos.x].className=\"sfood\";\r\n" + 
				"    document.getElementById(\"foodNum\").innerHTML=this.foodNum++;\r\n" + 
				"};\r\n" + 
				"Snake.prototype.map = function(){//������ͼ\r\n" + 
				"        this.domTab.firstChild ? this.domTab.removeChild(this.domTab.firstChild) : false;//���¿�ʼ ɾ��tbody\r\n" + 
				"        for( j = 0; j < this.rows; j++ ){\r\n" + 
				"                var tr = this.domTab.insertRow(-1);\r\n" + 
				"                for( i = 0; i < this.cols; i++ ){\r\n" + 
				"                        tr.insertCell(-1);\r\n" + 
				"                }\r\n" + 
				"        }\r\n" + 
				"};\r\n" + 
				"\r\n" + 
				"window.onload = function(){\r\n" + 
				"        var orz = new Snake();\r\n" + 
				"        orz.init();\r\n" + 
				"        document.onkeydown = function(e){ orz.trigger(e); };//firefox��Ҫ����e\r\n" + 
				"        document.getElementById(\"setSpeed\").onchange = function(){ this.blur(); orz.init(this.value); };\r\n" + 
				"};\r\n" + 
				"</script>\r\n" + 
				"</head>\r\n" + 
				"\r\n" + 
				"<body>\r\n" + 
				"        <ul class=\"info\">\r\n" + 
				"    <li>����:<span id=\"foodNum\"></span></li>\r\n" + 
				"    <li>ѡ���ٶ�:<select id=\"setSpeed\"><option value=\"200\">��(200)</option><option value=\"100\">��(100)</option><option value=\"50\">��(50)</option></select></li>\r\n" + 
				"    <li>�����ո���� ��ʼ/��ͣ</li>\r\n" + 
				"    </ul>\r\n" + 
				"    \r\n" + 
				"        <table id=\"map\"></table>\r\n" + 
				"</body>\r\n" + 
				"</html>");
	}

}
