package com.tt1.trabajo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import modelo.Destinatario;
import servicios.EnviarEmailsService;

class EmailServiceTest {

    private final EnviarEmailsService service = new EnviarEmailsService();

    @Test
    void enviarEmail_devuelveTrue_conDatosValidos() {
        var dest = new Destinatario(); 
        boolean resultado = service.enviarEmail(dest, "Hola, esto es una prueba");
        assertTrue(resultado);
    }

    @Test
    void enviarEmail_devuelveFalse_conEmailVacio() {
        var dest = new Destinatario();
        assertFalse(service.enviarEmail(dest, ""));
        assertFalse(service.enviarEmail(dest, "   "));
    }

    @Test
    void enviarEmail_devuelveFalse_conDestinatarioNulo() {
        assertFalse(service.enviarEmail(null, "Contenido válido"));
    }
}