package bootcamp.Services;

import java.util.List;

import bootcamp.Bean.SolicitudRequest;
import bootcamp.Bean.SolicitudResponse;
import bootcamp.Models.Solicitud;

public interface ISolicitud {

	public SolicitudResponse Register(SolicitudRequest request) throws Exception;

	public Solicitud FindByID(Integer id) throws Exception;

	public List<Solicitud> Store() throws Exception;

	public Solicitud Update(Solicitud request) throws Exception;

	public boolean Delete(Integer id) throws Exception;
}
