package servicios;

import java.util.List;

import org.springframework.stereotype.Service;

import interfaces.InterfazContactoSim;
import modelo.DatosSimulation;
import modelo.DatosSolicitud;
import modelo.Entidad;

@Service
public class ContactoSimService implements InterfazContactoSim{

	@Override
	public int solicitarSimulation(DatosSolicitud sol) {
		return 0;
	}

	@Override
	public DatosSimulation descargarDatos(int ticket) {
		return null;
	}

	@Override
	public List<Entidad> getEntities() {
		return null;
	}

	@Override
	public boolean isValidEntityId() {
		return false;
	}

}
