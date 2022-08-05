package pe.com.bootcamp.service.rest;

import java.util.List;

import pe.com.bootcamp.bean.SolicitudRequest;
import pe.com.bootcamp.bean.SolicitudResponse;
import pe.com.bootcamp.Models.Solicitud;

public interface ISolicitud {

	public SolicitudResponse Register(SolicitudRequest request) throws Exception;

	public Solicitud FindByID(Integer id) throws Exception;

	public List<Solicitud> Store() throws Exception;

	public Solicitud Update(Solicitud request) throws Exception;

	public boolean Delete(Integer id) throws Exception;
}
