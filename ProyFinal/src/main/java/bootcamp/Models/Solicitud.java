package bootcamp.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Schema(description = "Información de Solicitud de Retiro")
@Entity
@Table(name = "Solicitud")
public class Solicitud {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Schema(description = "El DNI debe tener 8 caracteres")
	@Size(min = 8, message = "El DNI debe tener 8 caracteres")
	@Column(name = "dni", nullable = false, length = 8)
	private String DNI;

	@Schema(description = "El Importe debe ser mayor a Cero")
	@Column(name="importe", nullable=false)
	private double Importe;

	@Schema(description = "Codigo de AFP afiliado")
	@Column(name="idAFP", nullable=false)
	private int Afp;
}
