package pe.com.bootcamp.service.rest;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import pe.com.bootcamp.bean.AFPResponse;
import pe.com.bootcamp.Models.AFP;
import pe.com.bootcamp.Repos.IAFPRepo;

@Service
public class IAfpImp implements IAfp {
	private static final Logger logger=LoggerFactory.getLogger(IAfpImp.class);
	
	@Autowired	
	IAFPRepo repo;
	
	@Override
	public AFPResponse Store() {
		AFPResponse response= new AFPResponse();
		try {
			List<AFP> lista= new ArrayList<>();
			lista=repo.findAll();

			response.setAFPList(lista);
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
	public AFP Register(AFP request) throws Exception {
		return repo.save(request);
	}

	@Override
	public AFP FindByID(Integer id) throws Exception {
		java.util.Optional<AFP> op=repo.findById(id);
		return op.isPresent() ? op.get() : new AFP();
	}

	@Override
	public AFP Update(AFP request) throws Exception {
		return repo.save(request);
	}

	@Override
	public boolean Delete(Integer id) throws Exception {
		repo.deleteById(id);
		return true;
	}

}
