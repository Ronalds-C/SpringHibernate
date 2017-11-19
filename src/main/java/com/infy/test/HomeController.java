package com.infy.test;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private Employee employee;
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = {"/","home"}, method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate );
		return "home";
	}
	
	@RequestMapping(value="addEmployee", method=RequestMethod.GET)
	public String addEmployee(Model m){
		return "addEmployee";
	}
	
	/*@RequestMapping(value="success", method=RequestMethod.GET)
	public String successMessage(@ModelAttribute("emp") @Valid Employee emp, BindingResult result, Model m){
		if(result.hasErrors()){
			return "error";
		}
		String message = employeeService.addEmployee(emp);
		m.addAttribute("message", message);
		return "success";
	}*/
	
	@RequestMapping(value="success", method=RequestMethod.GET)
	public String successMessage(@RequestParam("id") int id, @RequestParam("name") String name, @RequestParam("type") String type, @RequestParam("salary") double salary, @RequestParam("location") String location, @RequestParam("pincode") long pincode, Model m){
		employee.setId(id);
		employee.setName(name);
		employee.setType(type);
		employee.setSalary(salary);
		employee.setLocation(location);
		employee.setPincode(pincode);
		String message = employeeService.addEmployee(employee);
		m.addAttribute("message", message);
		return "success";
	}
}
