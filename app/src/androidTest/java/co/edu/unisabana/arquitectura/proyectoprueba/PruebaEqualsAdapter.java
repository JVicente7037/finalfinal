package co.edu.unisabana.arquitectura.proyectoprueba;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Adapter.AdminAdapter;
import Adapter.Conductor;
import Adapter.Pasajero;
import Adapter.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class PruebaEqualsAdapter {
    
    public PruebaEqualsAdapter() {
    }
    
   
     @Test
    public void hello() 
    {
        Usuario Ejemplo = new AdminAdapter();
	Ejemplo.SetTipoUsuario("Administrador");
	assertEquals(Ejemplo.getTipoUsuario(),"Administrador");
}
    @Test
    
    public void test() {
		Usuario Ejemplo = new Conductor();
		Ejemplo.SetTipoUsuario("Conductor");
		assertEquals(Ejemplo.getTipoUsuario(),"Conductor");
	}
    @Test
    public void test2() {
		Usuario Ejemplo = new Pasajero();
		Ejemplo.SetTipoUsuario("Pasajero");
		assertEquals(Ejemplo.getTipoUsuario(),"Pasajero");
	}
}
