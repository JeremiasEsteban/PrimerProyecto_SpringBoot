package com.proyectojere.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.proyectojere.models.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;


@Repository
@Transactional
public class UsuarioDaoImp implements ClienteDao{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Cliente> obtenerClientes() {
		String query="from Cliente";
		
		
		return entityManager.createQuery(query).getResultList();
		
	}

}
