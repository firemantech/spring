package com.fireman.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fireman.dao.ContactoDao;
import com.fireman.entity.Contacto;
import com.fireman.service.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService {

	@Autowired
	private ContactoDao contactoDao;
	
	@Transactional
	public void guardarContacto(Contacto contacto) {
		contactoDao.guardarContacto(contacto);

	}

	@Transactional
	public ArrayList<Contacto> contactos() {
		return contactoDao.contactos();
	}

	@Transactional
	public void eliminarContacto(Long id) {
		contactoDao.eliminarContacto(id);

	}

}
