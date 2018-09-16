package sv.com.dcc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import sv.com.dcc.models.entities.customers;
import sv.com.dcc.models.services.ICustomerService;

@Controller
@SessionAttributes ("customer")

public class CustomerController {

		@Autowired
		private ICustomerService customerService;
		
		@RequestMapping(value="/listar", method=RequestMethod.GET)
		public String listar(Model model) {
			model.addAttribute("titulo","listado de cliente ");
			model.addAttribute("customers", customerService.findAll());
			return "listar";
		}
		
}
