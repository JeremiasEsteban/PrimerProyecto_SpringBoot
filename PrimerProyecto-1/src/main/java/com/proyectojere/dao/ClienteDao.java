package com.proyectojere.dao;
import java.util.List;

import com.proyectojere.models.Cliente;

import jakarta.transaction.Transactional;

@Transactional
public interface ClienteDao {
List<Cliente> obtenerClientes();
}
