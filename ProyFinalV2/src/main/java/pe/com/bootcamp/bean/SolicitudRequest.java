package pe.com.bootcamp.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class SolicitudRequest {

	private String DNI;
	
	private double Importe;
	
	private int Afp;	
}
