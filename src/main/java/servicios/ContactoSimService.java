package servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;

@Service
public class ContactoSimService implements InterfazContactoSim{

	private static final Logger logger = LoggerFactory.getLogger(ContactoSimService.class);
	private int ticketCounter = 5;
	private final Random random = new Random();
	private final List<Entidad> entidadesDisponibles = List.of(
			new Entidad(1, "Movistar", "España"),
            new Entidad(2, "Vodafone", "España"),
            new Entidad(3, "Orange", "España"),
            new Entidad(4, "Yoigo", "España"),
            new Entidad(5, "Pepephone", "España"),
            new Entidad(6, "Lowii", "España"),
            new Entidad(7, "Simyo", "España"),
            new Entidad(8, "O2", "España")
	    );
	
	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		if (sol == null) {
            logger.warn("Solicitud inválida o vacía");
            return -1;
        }

        int ticket = ticketCounter++;
        logger.info("Nueva solicitud aceptada → Ticket: {}", ticket);

		return ticket;
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		logger.debug("Consulta de datos para ticket no implementada aún: {}", ticket);
        return null;
    }

	@Override
	public List<Entidad> getEntities() {
		return entidadesDisponibles;
	}

	@Override
	public boolean isValidEntityId() {
		logger.warn("Implementación incompleta");
        return true;	
    }

}
