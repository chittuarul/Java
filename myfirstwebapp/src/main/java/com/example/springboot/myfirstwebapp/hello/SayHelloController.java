package com.example.springboot.myfirstwebapp.hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//@Component
@Controller
@Configuration
public class SayHelloController {
	@RequestMapping ("say-hello")
	@ResponseBody
	public String sayhello() {
		return "Hello!  my first web app.";
		
	}
	@RequestMapping ("say-hello-html")
	@ResponseBody
	public String sayhellohtml() {
		StringBuilder sb=new StringBuilder();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>");
		sb.append("first html page");
		sb.append("</title>");
		sb.append("<head>");
		sb.append("<body>");
		sb.append("this is my first html -hardcoded");
		sb.append("</body>");
		sb.append("</html");
		
		return sb.toString();
		
		}
	@RequestMapping ("say-hello-jsp")
	//@ResponseBody
	public String sayhellojsp() {
		///myfirstwebapp/src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
		return "sayHello";
		
	}
}
