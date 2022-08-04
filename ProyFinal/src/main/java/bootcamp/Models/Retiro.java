package bootcamp.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Schema(description = "Información del Retiro Permitido")
@Entity
@Table(name = "Retiro")
public class Retiro {
	
	@Schema(description = "El DNI debe tener 8 caracteres")
	@Size(min = 8, message = "El DNI debe tener 8 caracteres")
	@Column(name = "dni", nullable = false, length = 8)
	private int DNI;
	
	@Schema(description = "El Importe debe ser mayor a Cero")
	@Column(name="importe", nullable=false)
	private double Importe;
	
	@Schema(description = "Fecha de Retiro")
	@Column(name="fecharetiro", nullable=false)
	private Date FechaRetiro;
	
	@Column(name="NumeroCuenta", nullable=false)
	private String NumeroCuenta;
}
