package webprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{

	@RequestMapping("/index")
	public String index() {
		
		return "root.index";	
	}
	
	/*
	 * @Override public ModelAndView handleRequest(HttpServletRequest request,
	 * HttpServletResponse response) throws Exception {
	 * 
	 * ModelAndView mv=new ModelAndView("root.index"); mv.addObject("data",
	 * "MVC HELLO"); //mv.setViewName("/WEB-INF/view/index.jsp");
	 * 
	 * 
	 * return mv; }
	 */
	
}
