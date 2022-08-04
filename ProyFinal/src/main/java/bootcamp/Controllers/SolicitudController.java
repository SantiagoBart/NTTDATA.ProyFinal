package bootcamp.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bootcamp.Models.Solicitud;
import bootcamp.Services.ISolicitud;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/Solicitud")
public class SolicitudController {
	private static final Logger logger=LoggerFactory.getLogger(SolicitudController.class);

	@Autowired
	ISolicitud oSolic;

	@PostMapping(value="/FindAll", consumes="application/json", produces="application/json")
	public List<Solicitud> CustomerStore()
	{
		List<Solicitud> response= new ArrayList<>();
		try {
			logger.info("Inicio de Solicitud");
			response=oSolic.Store();

		}catch(Exception e) {
			logger.info("Error: " + e.getMessage());
		}finally {
			logger.info("Fin de Solicitud");
		}

		return response;
	}

	@PostMapping(value="/Register", consumes="application/json", produces="application/json")
	public Solicitud CustomerCreate(@RequestBody Solicitud request) {
		Solicitud response= new Solicitud();
		try {
			logger.info("Inicio de Solicitud");
			response=oSolic.Register(request);
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
	public Solicitud CustomerEdit(Integer id) {
		Solicitud response= new Solicitud();
		try {
			logger.info("Inicio de Solicitud");
			response=oSolic.FindByID(id);
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
	public Solicitud CustomerUpdate(@RequestBody Solicitud request) {
		Solicitud response= new Solicitud();
		try {
			logger.info("Inicio de Solicitud");
			response=oSolic.Update(request);
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
	public boolean CustomerDelete(Integer id) {
		boolean response = false;
		try {
			logger.info("Inicio de Solicitud");
			response=oSolic.Delete(id);
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
