package bootcamp.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.Bean.AFPResponse;
import bootcamp.Models.AFP;
import bootcamp.Services.IAfp;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/AFP")
public class AFPController {
	private static final Logger logger=LoggerFactory.getLogger(AFPController.class);

	@Autowired
	IAfp oAFP;

	@PostMapping(value = "/FindAll", consumes = "application/json", produces = "application/json")
	public AFPResponse AFPStore()
	{
		AFPResponse response= new AFPResponse();
		try {
			logger.info("Inicio de Solicitud");
			response=oAFP.Store();

		}catch(Exception e) {
			logger.info("Error: " + e.getMessage());
		}finally {
			logger.info("Fin de Solicitud");
		}

		return response;
	}

	@PostMapping(value="/Register", consumes="application/json", produces="application/json")
	public AFP AFPCreate(@RequestBody AFP request) {
		AFP response= new AFP();
		try {
			logger.info("Inicio de Solicitud");
			response=oAFP.Register(request);
		}
		catch(Exception e) {
			logger.info("Error: " + e.getMessage());
		}
		finally {
			logger.info("Fin de Solicitud");
		}

		return response;
	}

	@PostMapping(value="/FindById", consumes="application/json", produces="application/json")
	public AFP AFPEdit(Integer id) {
		AFP response= new AFP();
		try {
			logger.info("Inicio de Solicitud");
			response=oAFP.FindByID(id);
		}
		catch(Exception e) {
			logger.info("Error: " + e.getMessage());
		}
		finally {
			logger.info("Fin de Solicitud");
		}

		return response;
	}

	@PostMapping(value="/Update", consumes="application/json", produces="application/json")
	public AFP AFPUpdate(@RequestBody AFP request) {
		AFP response= new AFP();
		try {
			logger.info("Inicio de Solicitud");
			response=oAFP.Update(request);
		}
		catch(Exception e) {
			logger.info("Error: " + e.getMessage());
		}
		finally {
			logger.info("Fin de Solicitud");
		}

		return response;
	}

	@PostMapping(value="/Delete", consumes="application/json", produces="application/json")
	public boolean AFPDelete(Integer id) {
		boolean response = false;
		try {
			logger.info("Inicio de Solicitud");
			response=oAFP.Delete(id);
		}
		catch(Exception e) {
			logger.info("Error: " + e.getMessage());
		}
		finally {
			logger.info("Fin de Solicitud");
		}

		return response;
	}
}
