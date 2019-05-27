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
public class PruebaAsserTrueAdapter {
    
    public PruebaAsserTrueAdapter() {
    }
    
   

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
    public void hello() 
    {
        Usuario Ejemplo = new AdminAdapter();
		Ejemplo.setLogin("login");
		Ejemplo.setPassword("123");
	assertTrue(Ejemplo.ingresar("login","123"));
        
        
    }
    @Test
    public void pru()
    {
        Usuario Ejemplo = new Conductor();
		Ejemplo.setLogin("login");
		Ejemplo.setPassword("123");
	assertTrue(Ejemplo.ingresar("login","123"));
    }
    @Test
    public void pru1()
    {
        Usuario Ejemplo = new Pasajero();
		Ejemplo.setLogin("login");
		Ejemplo.setPassword("123");
	assertTrue(Ejemplo.ingresar("login","123"));
    }
}
