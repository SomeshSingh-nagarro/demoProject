package calc.com;


import javax.servlet.http.HttpServletRequest;


import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Add {
	@RequestMapping(value="/calc" ,params="add" ,method=RequestMethod.POST)
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int k=i+j;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
		}
	
	
	@RequestMapping(value="/calc" ,params="sub" ,method=RequestMethod.POST)
	public ModelAndView sub(HttpServletRequest request, HttpServletResponse response) {
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int k=i-j;
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
	}
	
	
	@RequestMapping(value="/calc" ,params="mul" ,method=RequestMethod.POST)
	public ModelAndView mul(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		String s = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
		if(s.contains(request.getParameter("t1")))
		{
			String m="Enter valid numer";
			mv.setViewName("display.jsp");
			mv.addObject("result",m);
			return mv;
		}
		else
		{
		int i=Integer.parseInt(request.getParameter("t1"));
		int j=Integer.parseInt(request.getParameter("t2"));
		int k=i*j;
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
	}
	}
	
	
	@RequestMapping(value="/calc" ,params="div" ,method=RequestMethod.POST)
	public ModelAndView div(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		double i=Double.parseDouble(request.getParameter("t1"));
		double j=Double.parseDouble(request.getParameter("t2"));
		double k=i/j;
		if(j==0)
		{
			String m="Divide by zero error";
			mv.setViewName("display.jsp");
			mv.addObject("result",m);
			return mv;
		}
		else
		{
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		return mv;
		}
	}
	
	public int add(int a,int b)
	{
		return a+b;
	}
	public int sub(int a,int b)
	{
		return a-b;
	}
	public int mul(int a,int b)
	{
		return a*b;
	}
	public int div(int a,int b)
	{
		return a/b;
	}
	
	
	
}
