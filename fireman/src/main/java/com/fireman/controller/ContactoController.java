package com.fireman.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fireman.entity.Contacto;
import com.fireman.service.ContactoService;

@Controller
public class ContactoController {

	@Autowired
	private ContactoService contactService;

	@RequestMapping("/index")
	public String listContacts(Map<String, Object> map) {
		map.put("contacto", new Contacto());
		map.put("contactoList", contactService.contactos());
		return "contacto";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String addContact(@ModelAttribute("contacto") Contacto contact,
			BindingResult result) {
		contactService.guardarContacto(contact);
		return "redirect:/index";
	}

	@RequestMapping("/delete/{contactId}")
	public String deleteContact(@PathVariable("contactId") Long contactId) {
		contactService.eliminarContacto(contactId);
		return "redirect:/index";
	}

}
