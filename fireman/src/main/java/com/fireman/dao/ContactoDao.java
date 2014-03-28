package com.fireman.dao;

import java.util.ArrayList;

import com.fireman.entity.Contacto;

public interface ContactoDao {

	public void guardarContacto(Contacto contacto);
	
	public ArrayList<Contacto> contactos();
	
	public void eliminarContacto(Long id);
	
}
