package pe.com.bootcamp.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class SolicitudResponse {	
	
	private String DNI;

	private double ImporteRetiro;
	
	private String Respuesta;
	
	private String Estado;
}
