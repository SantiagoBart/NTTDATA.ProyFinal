package bootcamp.Bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

public class SolicitudResponse {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Schema(description = "El DNI debe tener 8 caracteres")
	@Size(min = 8, message = "El DNI debe tener 8 caracteres")
	@Column(name = "dni", nullable = false, length = 8)
	private String DNI;

	@Schema(description = "El Importe debe ser mayor a Cero")
	@Column(name="importe_retiro", nullable=false)
	private double ImporteRetiro;
	
	@Schema(description="Estado de Solicitud")
	@Column(name="estado")
	private String Estado;
}
