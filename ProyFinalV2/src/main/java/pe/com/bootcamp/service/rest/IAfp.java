package pe.com.bootcamp.service.rest;

import pe.com.bootcamp.bean.AFPResponse;

import pe.com.bootcamp.Models.AFP;

public interface IAfp {

	public AFP Register(AFP request) throws Exception;

	public AFP FindByID(Integer id) throws Exception;

	public AFPResponse Store() throws Exception;

	public AFP Update(AFP request) throws Exception;

	public boolean Delete(Integer id) throws Exception;
}
