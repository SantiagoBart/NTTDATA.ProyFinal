package pe.com.bootcamp.service.rest;


import java.util.List;

import pe.com.bootcamp.Models.Customer;

public interface ICustomer {

	public Customer Register(Customer request) throws Exception;

	public Customer FindByID(Integer id) throws Exception;

	public List<Customer> Store() throws Exception;

	public Customer Update(Customer request) throws Exception;

	public boolean Delete(Integer id) throws Exception;
}
