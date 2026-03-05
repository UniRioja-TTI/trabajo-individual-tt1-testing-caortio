package com.tt1.trabajo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import servicios.ContactoSimService;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class ContactoSimServiceTest {

    private ContactoSimService service;

    @BeforeEach
    void setUp() {
        service = new ContactoSimService();
    }

    @Test
    void testGetEntities() {
        var entidades = service.getEntities();
        assertFalse(entidades.isEmpty());
        assertTrue(entidades.size() >= 5);
    }

    @Test 
    void testSolicitarSimulation() {
        var cantidades = Map.of(1, 2, 3, 1);
        var solicitud = new DatosSolicitud(cantidades); 
        int ticket = service.solicitarSimulation(solicitud);
        assertTrue(ticket > 1);
    }

    @Test
    void testDescargarDatos() {
        DatosSimulation resultado1 = service.descargarDatos(1005);
        DatosSimulation resultado2 = service.descargarDatos(999999);
        DatosSimulation resultado3 = service.descargarDatos(-1);

        assertNull(resultado1);
        assertNull(resultado2);
        assertNull(resultado3);
    }
    
    @Test
    void testIsValidEntityId() {
        assertTrue(service.isValidEntityId());
    }
}