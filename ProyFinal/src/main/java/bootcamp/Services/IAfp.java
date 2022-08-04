package bootcamp.Services;

import bootcamp.Bean.AFPResponse;
import bootcamp.Models.AFP;

public interface IAfp {

	public AFP Register(AFP request) throws Exception;

	public AFP FindByID(Integer id) throws Exception;

	public AFPResponse Store() throws Exception;

	public AFP Update(AFP request) throws Exception;

	public boolean Delete(Integer id) throws Exception;
}
