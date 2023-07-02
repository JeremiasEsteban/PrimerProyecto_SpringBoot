package com.proyectojere.controllers;



import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectojere.dao.ClienteDao;
import com.proyectojere.models.Cliente;


@RestController
public class ClienteController {
	
	@Autowired
	private ClienteDao clienteDao;
	
	
	@RequestMapping(value="mensaje")
	public String mensaje() {
		
		return "Hola mundo";
	}
	
    @RequestMapping(value="Clientes1")
	public List<String> listarClientes(){
		return List.of("Diego","Juan","Jose");
	}
    
    @RequestMapping(value="Clientes2")
    public Cliente listarClientes1() {
    	
    	Cliente cliente=new Cliente();
    	cliente.setNombre("embape");
    	cliente.setApellido("killian");
    	cliente.setDNI("45448790");
    	cliente.setTelefono("2612158473");
    	cliente.setDireccion("Jorge Luis Borges 888");
    	
    	
    	return cliente;
    }
    
    @RequestMapping(value="Clientes3/{id}")
    public Cliente getCliente(@PathVariable Long id) {
    	
    	Cliente cliente=new Cliente();
    	cliente.setId(id);
    	cliente.setNombre("embape");
    	cliente.setApellido("killian");
    	cliente.setDNI("45448790");
    	cliente.setTelefono("2612158473");
    	cliente.setDireccion("Jorge Luis Borges 888");
    	
    	
    	return cliente;
    }
    
    @RequestMapping(value="Cliente/lista_user")
    public List<Cliente> listar_variosClientes() {
    	
    	List<Cliente> cliente=new ArrayList<>();
    
    	Cliente cliente1=new Cliente();
    	cliente1.setId(1L);
    	cliente1.setNombre("embape");
    	cliente1.setApellido("killian");
    	cliente1.setDNI("45448790");
    	cliente1.setTelefono("2612158473");
    	cliente1.setDireccion("Jorge Luis Borges 888");
    	
    	Cliente cliente2=new Cliente();
    	cliente2.setId(2L);
    	cliente2.setNombre("fabian");
    	cliente2.setApellido("esteban");
    	cliente2.setDNI("45445790");
    	cliente2.setTelefono("2612154353");
    	cliente2.setDireccion("peltier");
    	
    	Cliente cliente3=new Cliente();
    	cliente3.setId(3L);
    	cliente3.setNombre("fabian");
    	cliente3.setApellido("esteban");
    	cliente3.setDNI("45445790");
    	cliente3.setTelefono("2612154353");
    	cliente3.setDireccion("peltier");
    	
        cliente.add(cliente1);
        cliente.add(cliente2);
        cliente.add(cliente3);
    	
    	return cliente;
    }
    
    @RequestMapping(value="api/clientes")
    public List<Cliente> getCliente(){
    	
    	List<Cliente> cliente=clienteDao.obtenerClientes();
    	
    	return cliente;
    }
}
