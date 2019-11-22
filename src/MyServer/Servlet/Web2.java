package MyServer.Servlet;

import MyServer.MyServlet.Request;
import MyServer.MyServlet.Response;
import MyServer.MyServlet.Servlet;

public class Web2 extends Servlet {
	
	public Web2() {

	}
	
	@Override
	public void doGet(Request req, Response rep) throws Exception {
		//rep.println("success123.....");
	}

	@Override
	public void doPost(Request req, Response rep) throws Exception {
		// TODO Auto-generated method stub
		rep.println("<!DOCTYPE html>\r\n" + 
				"<html lang=\"en\">\r\n" + 
				"    <head>\r\n" + 
				"            <meta charset=\"utf-8\">\r\n" + 
				"<style type=\"text/css\">\r\n" + 
				"body, html{\r\n" + 
				"background-color: #222222;\r\n" + 
				"}\r\n" + 
				"canvas{\r\n" + 
				"border: 6px #333333 solid;\r\n" + 
				"background-color: #111111;\r\n" + 
				"}\r\n" + 
				".ui{\r\n" + 
				"font-family: Arial,Helvetica, sans-serif;\r\n" + 
				"font-size: 10px;color: #999999;\r\n" + 
				"text-align: left;\r\n" + 
				"padding: 8px;\r\n" + 
				"background-color: rgba(0,0,0,0.5);\r\n" + 
				"position: absolute;\r\n" + 
				"z-index: 2;\r\n" + 
				"}\r\n" + 
				"#message{\r\n" + 
				"padding: 16px;\r\n" + 
				"}\r\n" + 
				"#status{\r\n" + 
				"width: 884px;\r\n" + 
				"height: 15px;\r\n" + 
				"padding: 8px;\r\n" + 
				"display: none;\r\n" + 
				"}\r\n" + 
				"#status span{\r\n" + 
				"color: #bbbbbb;\r\n" + 
				"font-weight: bold;\r\n" + 
				"margin-right: 5px;\r\n" + 
				"}\r\n" + 
				"#title{\r\n" + 
				"margin-bottom: 20px;\r\n" + 
				"color: #eeeeee;\r\n" + 
				"}\r\n" + 
				".ui ul{\r\n" + 
				"margin: 10px 0 10px 0;\r\n" + 
				"padding: 8px 0 8px 10px;\r\n" + 
				"}\r\n" + 
				".ui ul li{\r\n" + 
				"list-style: none;\r\n" + 
				"}\r\n" + 
				".ui a{\r\n" + 
				"outline: none;\r\n" + 
				"font-family: Arial, Helvetica, sans-serif;\r\n" + 
				"font-size: 38px;\r\n" + 
				"text-decoration: none;\r\n" + 
				"color: #bbbbbb;\r\n" + 
				"padding: 2px;\r\n" + 
				"display: block\r\n" + 
				"}\r\n" + 
				".ui a: hover{\r\n" + 
				"color: #ffffff;\r\n" + 
				"background-color: #000000;\r\n" + 
				"}\r\n" + 
				"</style>\r\n" + 
				"\r\n" + 
				"        </head>\r\n" + 
				"        <body>\r\n" + 
				"                <canvas id='world'></canvas>\r\n" + 
				"                <div id=\"status\" class=\"ui\"></div>\r\n" + 
				"                <div id=\"message\" class=\"ui\">\r\n" + 
				"                  <h2 id=\"title\">Sinuous - Instructions</h2>\r\n" + 
				"                  <ul>\r\n" + 
				"                    <li>1. Avoid red dots.</li>\r\n" + 
				"                    <li>2. Touch green dots for invulnerability.</li>\r\n" + 
				"                    <li>3. Use invulnerability to destroy red dots.</li>\r\n" + 
				"                    <li>4. Score extra points by moving around a lot.</li>\r\n" + 
				"                    <li>5. Stay alive.</li>\r\n" + 
				"                  </ul>\r\n" + 
				"                  <a href=\"#\" id=\"startButton\">Start</a>\r\n" + 
				"                </div>\r\n" + 
				"                <script>\r\n" + 
				"SinuousWorld=new function(){var D=navigator.userAgent.toLowerCase();var x=(D.indexOf(\"android\")!=-1)||(D.indexOf(\"iphone\")!=-1)||(D.indexOf(\"ipad\")!=-1);var d=x?window.innerWidth:900;var B=x?window.innerHeight:550;var h;var f;var z;var u;var K;var b;var w=[];var y=[];var H=[];var A;var t=(window.innerWidth-d);var r=(window.innerHeight-B);var J=false;var k=false;var C=0;var m=0;var s={x:-1.3,y:1};var E=1;this.init=function(){h=document.getElementById(\"world\");z=document.getElementById(\"status\");u=document.getElementById(\"message\");K=document.getElementById(\"title\");b=document.getElementById(\"startButton\");if(h&&h.getContext){f=h.getContext(\"2d\");var L=function(N,M,O){document.addEventListener(N,M,O)};L(\"mousemove\",c,false);L(\"mousedown\",l,false);L(\"mouseup\",I,false);h.addEventListener(\"touchstart\",i,false);L(\"touchmove\",q,false);L(\"touchend\",v,false);window.addEventListener(\"resize\",a,false);b.addEventListener(\"click\",j,false);A=new Player();a();if(x){h.style.border=\"none\";s.x*=2;s.y*=2;setInterval(G,1000/20)}else{setInterval(G,1000/60)}}};function j(L){if(k==false){k=true;w=[];y=[];C=0;E=1;A.trail=[];A.p.x=t;A.p.y=r;A.boost=0;u.style.display=\"none\";z.style.display=\"block\";m=new Date().getTime()}}function o(){k=false;u.style.display=\"block\";K.innerHTML=\"Game Over! (\"+Math.round(C)+\" points)\"}function c(L){t=L.clientX-(window.innerWidth-d)*0.5-10;r=L.clientY-(window.innerHeight-B)*0.5-10}function l(L){J=true}function I(L){J=false}function i(L){if(L.touches.length==1){L.preventDefault();t=L.touches[0].pageX-(window.innerWidth-d)*0.5;r=L.touches[0].pageY-(window.innerHeight-B)*0.5;J=true}}function q(L){if(L.touches.length==1){L.preventDefault();t=L.touches[0].pageX-(window.innerWidth-d)*0.5-20;r=L.touches[0].pageY-(window.innerHeight-B)*0.5-20}}function v(L){J=false}function a(){d=x?window.innerWidth:900;B=x?window.innerHeight:550;h.width=d;h.height=B;var M=(window.innerWidth-d)*0.5;var L=(window.innerHeight-B)*0.5;h.style.position=\"absolute\";h.style.left=M+\"px\";h.style.top=L+\"px\";if(x){u.style.left=\"0px\";u.style.top=\"0px\";z.style.left=\"0px\";z.style.top=\"0px\"}else{u.style.left=M+6+\"px\";u.style.top=L+200+\"px\";z.style.left=M+6+\"px\";z.style.top=L+6+\"px\"}}function g(O,M,L){var N=10+(Math.random()*15);while(--N>=0){n=new Particle();n.p.x=O.x+(Math.sin(N)*M);n.p.y=O.y+(Math.cos(N)*M);n.velocity={x:-4+Math.random()*8,y:-4+Math.random()*8};n.alpha=1;H.push(n)}}function G(){f.clearRect(0,0,h.width,h.height);var P={x:s.x*E,y:s.y*E};var O,M,N,L;if(k){E+=0.0008;pp=A.clonePosition();A.p.x+=(t-A.p.x)*0.13;A.p.y+=(r-A.p.y)*0.13;C+=0.4*E;C+=A.distanceTo(pp)*0.1;A.boost=Math.max(A.boost-1,0);if(A.boost>0&&(A.boost>100||A.boost%3!=0)){f.beginPath();f.fillStyle=\"#167a66\";f.strokeStyle=\"#00ffcc\";f.arc(A.p.x,A.p.y,A.s*2,0,Math.PI*2,true);f.fill();f.stroke()}A.trail.push(new Point(A.p.x,A.p.y));f.beginPath();f.strokeStyle=\"#648d93\";f.lineWidth=2;for(O=0,N=A.trail.length;O<N;O++){p=A.trail[O];f.lineTo(p.p.x,p.p.y);p.p.x+=P.x;p.p.y+=P.y}f.stroke();f.closePath();if(A.trail.length>60){A.trail.shift()}f.beginPath();f.fillStyle=\"#8ff1ff\";f.arc(A.p.x,A.p.y,A.s/2,0,Math.PI*2,true);f.fill()}if(k&&(A.p.x<0||A.p.x>d||A.p.y<0||A.p.y>B)){g(A.p,10);o()}for(O=0;O<w.length;O++){p=w[O];if(k){if(A.boost>0&&p.distanceTo(A.p)<((A.s*4)+p.s)*0.5){g(p.p,10);w.splice(O,1);O--;C+=10;continue}else{if(p.distanceTo(A.p)<(A.s+p.s)*0.5){g(A.p,10);o()}}}f.beginPath();f.fillStyle=\"#ff0000\";f.arc(p.p.x,p.p.y,p.s/2,0,Math.PI*2,true);f.fill();p.p.x+=P.x*p.f;p.p.y+=P.y*p.f;if(p.p.x<0||p.p.y>B){w.splice(O,1);O--}}for(O=0;O<y.length;O++){p=y[O];if(p.distanceTo(A.p)<(A.s+p.s)*0.5&&k){A.boost=300;for(M=0;M<w.length;M++){e=w[M];if(e.distanceTo(p.p)<100){g(e.p,10);w.splice(M,1);M--;C+=10}}}f.beginPath();f.fillStyle=\"#00ffcc\";f.arc(p.p.x,p.p.y,p.s/2,0,Math.PI*2,true);f.fill();p.p.x+=P.x*p.f;p.p.y+=P.y*p.f;if(p.p.x<0||p.p.y>B||A.boost!=0){y.splice(O,1);O--}}if(w.length<35*E){w.push(F(new Enemy()))}if(y.length<1&&Math.random()>0.997&&A.boost==0){y.push(F(new Boost()))}for(O=0;O<H.length;O++){p=H[O];p.velocity.x+=(P.x-p.velocity.x)*0.04;p.velocity.y+=(P.y-p.velocity.y)*0.04;p.p.x+=p.velocity.x;p.p.y+=p.velocity.y;p.alpha-=0.02;f.fillStyle=\"rgba(255,255,255,\"+Math.max(p.alpha,0)+\")\";f.fillRect(p.p.x,p.p.y,1,1);if(p.alpha<=0){H.splice(O,1)}}if(k){scoreText=\"Score: <span>\"+Math.round(C)+\"</span>\";scoreText+=\" Time: <span>\"+Math.round(((new Date().getTime()-m)/1000)*100)/100+\"s</span>\";z.innerHTML=scoreText}}function F(L){if(Math.random()>0.5){L.p.x=Math.random()*d;L.p.y=-20}else{L.p.x=d+20;L.p.y=(-B*0.2)+(Math.random()*B*1.2)}return L}};function Point(a,b){this.p={x:a,y:b}}Point.prototype.distanceTo=function(c){var b=c.x-this.p.x;var a=c.y-this.p.y;return Math.sqrt(b*b+a*a)};Point.prototype.clonePosition=function(){return{x:this.p.x,y:this.p.y}};function Player(){this.p={x:0,y:0};this.trail=[];this.s=8;this.boost=0}Player.prototype=new Point();function Enemy(){this.p={x:0,y:0};this.s=6+(Math.random()*4);this.f=1+(Math.random()*0.4)}Enemy.prototype=new Point();function Boost(){this.p={x:0,y:0};this.s=10+(Math.random()*8);this.f=1+(Math.random()*0.4)}Boost.prototype=new Point();function Particle(){this.p={x:0,y:0};this.f=1+(Math.random()*0.4);this.color=\"#ff0000\"}Particle.prototype=new Point();SinuousWorld.init();\r\n" + 
				"                </script>\r\n" + 
				"</body>\r\n" + 
				"</html>\r\n" + 
				"");
	}

}
