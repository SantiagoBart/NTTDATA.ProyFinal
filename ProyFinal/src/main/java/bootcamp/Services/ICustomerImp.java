package bootcamp.Services;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import bootcamp.Models.Customer;
import bootcamp.Repos.ICustomerRepo;

@Component
public class ICustomerImp implements ICustomer {
	private static final Logger logger=LoggerFactory.getLogger(ICustomerImp.class);

	@Autowired
	ICustomerRepo repo;

	@Override
	public List<Customer> Store() throws Exception {
		List<Customer> response = new ArrayList<>();
		try {
			List<Customer> lista = new ArrayList<>();
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
	public Customer Register(Customer request) throws Exception {
		return repo.save(request);
	}

	@Override
	public Customer FindByID(Integer id) throws Exception {
		java.util.Optional<Customer> op=repo.findById(id);
		return op.isPresent() ? op.get() : new Customer();
	}

	@Override
	public Customer Update(Customer request) throws Exception {
		return repo.save(request);
	}

	@Override
	public boolean Delete(Integer id) throws Exception {
		repo.deleteById(id);
		return true;
	}

}
