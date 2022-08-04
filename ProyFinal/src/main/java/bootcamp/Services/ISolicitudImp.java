package bootcamp.Services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.Bean.SolicitudRequest;
import bootcamp.Bean.SolicitudResponse;
import bootcamp.Models.AFP;
import bootcamp.Models.Retiro;
import bootcamp.Models.Solicitud;
import bootcamp.Repos.IAFPRepo;
import bootcamp.Repos.ISolicitudRepo;
import bootcamp.Repos.IRetiroRepo;

@Component
public class ISolicitudImp implements ISolicitud {
	private static final Logger logger=LoggerFactory.getLogger(ISolicitudImp.class);

	@Autowired
	ISolicitudRepo repo;
	
	@Autowired
	IAFPRepo repoAFP;
	
	@Autowired
	IRetiroRepo repoRetiro;

	@Override
	public List<Solicitud> Store() throws Exception {
		List<Solicitud> response = new ArrayList<>();
		try {
			List<Solicitud> lista = new ArrayList<>();
			lista=repo.findAll();

			response = lista;
		}
		catch(Exception e)
		{
			logger.info("Error: "+e.getMessage());
		}
		finally {

			logger.info("Solicitud Terminda");
		}
		return response;
	}

	@Override
	public SolicitudResponse Register(SolicitudRequest request) throws Exception {
		SolicitudResponse response= new SolicitudResponse();
		try {
			logger.info("Inicio de Solitud");
			int idAfp = request.getAfp();
			AFP oAFP= repoAFP.findById(idAfp).get();
			Retiro ret = repoRetiro.findById(21).get();
			
			response.setDNI(request.getDNI());
			response.setImporteRetiro(request.getImporte());
			if(request.getImporte()<=ret.getImporte()) {
				if(request.getImporte()<ret.getImporte()/2)
				{
					response.setRespuesta("Monto mínimo no cubierto por favor revise el monto mínimo a retirar");
					response.setEstado("Rechazado");
				}
				else {
					response.setRespuesta("Solicitud de Retiro Procesada");
					response.setEstado("Aprobado");
					Solicitud sol= new Solicitud();
					sol.setAfp(oAFP.getId());
					sol.setDNI(request.getDNI());
					sol.setImporte(request.getImporte());
					sol.setEstado("Aprobado");
					
					repo.save(sol);
				}
			}
			else {
				response.setRespuesta("No se puede registrar la solicitud. Monto mayor que el permitido");
				response.setEstado("Rechazado");
			}
			
		}
		catch(Exception e) {
			logger.info("Error: "+e.getMessage());
			response.setRespuesta("Error: " + e.getMessage());
			response.setEstado("No Procesado");
		}
		finally {
			logger.info("Solicitud Terminda");
		}
		
		return response;
	}

	@Override
	public Solicitud FindByID(Integer id) throws Exception {
		java.util.Optional<Solicitud> op=repo.findById(id);
		return op.isPresent() ? op.get() : new Solicitud();
	}

	@Override
	public Solicitud Update(Solicitud request) throws Exception {
		return repo.save(request);
	}

	@Override
	public boolean Delete(Integer id) throws Exception {
		repo.deleteById(id);
		return true;
	}

}
