package bootcamp.Services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.Models.Solicitud;
import bootcamp.Repos.ISolicitudRepo;

@Component
public class ISolicitudImp implements ISolicitud {
	private static final Logger logger=LoggerFactory.getLogger(ISolicitudImp.class);

	@Autowired
	ISolicitudRepo repo;

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
	public Solicitud Register(Solicitud request) throws Exception {
		return repo.save(request);
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
