package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.*;
import modelo.*;
import servicios.ContactoSimService;

public class ContactoSimServiceTest {
	
	private ContactoSimService service;

    @BeforeEach
    void setUp() {
        service = new ContactoSimService();  
    }
    
    @Test
    void testGetEntities() {
        List<Entidad> entities = service.getEntities();
        assertNotNull(entities);
        assertTrue(entities.isEmpty());
    }

    @Test
    void testSolicitarSimulation() {
    	Map<Integer,Integer> nums = new HashMap<Integer, Integer>();
        DatosSolicitud sol = new DatosSolicitud(nums); 
        int ticket = service.solicitarSimulation(sol);
        assertEquals(0, ticket);
    }

    @Test
    void testDescargarDatos() {
        DatosSimulation result = service.descargarDatos(999);
        assertNull(result);
    }

    @Test
    void testIsValidEntityId() {
        assertFalse(service.isValidEntityId());
    }
}
