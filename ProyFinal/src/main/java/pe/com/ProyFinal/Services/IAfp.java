package pe.com.ProyFinal.Services;


import Model.AFP;
import pe.com.ProyFinal.Bean.AFPResponse;

public interface IAfp {
	
	public AFP Register(AFP request) throws Exception;
	
	public AFP FindByID(Integer id) throws Exception;
	
	public AFPResponse Store() throws Exception;
	
	public AFP Update(AFP request) throws Exception;
	
	public boolean Delete(Integer id) throws Exception;
}
