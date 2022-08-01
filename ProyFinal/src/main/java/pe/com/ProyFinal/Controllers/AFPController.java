package pe.com.ProyFinal.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.ProyFinal.Bean.AFPResponse;
import pe.com.ProyFinal.Services.IAfp;

@RestController
@RequestMapping("/api/AFP")
public class AFPController {
	private static final Logger logger=LoggerFactory.getLogger(AFPController.class);
	
	@Autowired
	IAfp oAFP;
	
	@PostMapping(value="/FindAll", consumes="application/json", produces="application/json")
	public AFPResponse AFPStore(@RequestHeader(name="idTran", required=true) String idTran)
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
}
