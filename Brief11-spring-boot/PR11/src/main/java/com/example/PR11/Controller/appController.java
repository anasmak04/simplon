package com.example.PR11.Controller;

import java.util.List;

import com.example.PR11.dao.DaoImpl;
import com.example.PR11.models.Employe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class appController {
		@Autowired
		private DaoImpl dao;
		
		
		@RequestMapping("/")
		public String Home(Model model) { 
			List<Employe> listEmployes = dao.listAll();
			model.addAttribute("listEmployes", listEmployes);
			return "index";
		}
		
		@RequestMapping("/new")
		public String showNewProductPage(Model model) {
		    Employe employe = new Employe();
		    model.addAttribute("employe", employe);
		    return "new_Employe";
		}
		
		@RequestMapping(value = "/save", method = RequestMethod.POST)
		public String saveEmploye(@ModelAttribute("employe") Employe employe) {
		    dao.save(employe);
		    return "redirect:/";
		}
		
		@RequestMapping("/edit/{id_employees}")
		public ModelAndView showEditProductPage(@PathVariable(name = "id_employees") Long id_employees) {
		    ModelAndView mav = new ModelAndView("edit_product");
		    Employe employe = dao.get(id_employees);
		    mav.addObject("employe", employe);
		    return mav;
		}
		
		@RequestMapping("/delete/{id_employees}")
		public String deleteEmploye(@PathVariable(name = "id_employees") Long id_employees) {
			dao.delete(id_employees);
		    return "redirect:/";
		}

		
}