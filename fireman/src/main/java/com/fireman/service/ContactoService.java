package com.fireman.service;

import java.util.ArrayList;

import com.fireman.entity.Contacto;

public interface ContactoService {

	public void guardarContacto(Contacto contacto);
	
	public ArrayList<Contacto> contactos();
	
	public void eliminarContacto(Long id);
	
}
