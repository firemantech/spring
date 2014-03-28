package com.fireman.dao.impl;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fireman.dao.ContactoDao;
import com.fireman.entity.Contacto;

@Repository
public class ContactoDaoImpl implements ContactoDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void guardarContacto(Contacto contacto) {
		sessionFactory.getCurrentSession().save(contacto);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Contacto> contactos() {
		return (ArrayList<Contacto>) sessionFactory.getCurrentSession().createQuery("from Contacto")
				 .list();
	}

	public void eliminarContacto(Long id) {
		 Contacto contacto = (Contacto) sessionFactory.getCurrentSession().load(
				 Contacto.class, id);
				 if (null != contacto) {
				 sessionFactory.getCurrentSession().delete(contacto);
				 }
	}

}
