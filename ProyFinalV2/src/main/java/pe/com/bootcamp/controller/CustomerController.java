package pe.com.bootcamp.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.com.bootcamp.Models.Customer;
import pe.com.bootcamp.service.rest.ICustomer;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/Customer")
public class CustomerController {
	private static final Logger logger=LoggerFactory.getLogger(CustomerController.class);

	@Autowired
	ICustomer oCustomer;

	@PostMapping(value="/FindAll", consumes="application/json", produces="application/json")
	public List<Customer> CustomerStore()
	{
		List<Customer> response= new ArrayList<>();
		try {
			logger.info("Inicio de Solicitud");
			response=oCustomer.Store();

		}catch(Exception e) {
			logger.info("Error: " + e.getMessage());
		}finally {
			logger.info("Fin de Solicitud");
		}

		return response;
	}

	@PostMapping(value="/Register", consumes="application/json", produces="application/json")
	public Customer CustomerCreate(@RequestBody Customer request) {
		Customer response= new Customer();
		try {
			logger.info("Inicio de Solicitud");
			response=oCustomer.Register(request);
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
	public Customer CustomerEdit(Integer id) {
		Customer response= new Customer();
		try {
			logger.info("Inicio de Solicitud");
			response=oCustomer.FindByID(id);
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
	public Customer CustomerUpdate(@RequestBody Customer request) {
		Customer response= new Customer();
		try {
			logger.info("Inicio de Solicitud");
			response=oCustomer.Update(request);
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
			response=oCustomer.Delete(id);
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
