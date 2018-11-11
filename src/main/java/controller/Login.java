package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login() {
		return "index.html";
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signUp() {
		return "Sign_Up.html";
	}
	
    @RequestMapping("/hello/{lastName}")
    public @ResponseBody
    String Hello(@PathVariable String lastName, @RequestParam String name) {

        return "Hello Frands Chai Pilo " + lastName + " " + name;


    }
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
    	return "Hello";
    }

}
