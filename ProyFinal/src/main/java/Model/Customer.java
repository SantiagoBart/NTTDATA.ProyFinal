package Model;

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
@Schema(description = "Información de Cliente")
@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Schema(description = "El Nombre debe tener minimo 3 caracteres")
	@Size(min = 3, message = "El Nombre debe tener minimo 3 caracteres")
	@Column(name = "nombres", nullable = false, length = 50)
	private String Names;
	
	@Schema(description = "Los Apellidos debe tener minimo 5 caracteres")
	@Size(min = 5, message = "Los Apellidos debe tener minimo 5 caracteres")
	@Column(name = "apellidos", nullable = false, length = 50)
	private String LastName;
	
	@Schema(description = "El DNI debe tener 8 caracteres")
	@Size(min = 8, message = "El DNI debe tener 8 caracteres")
	@Column(name = "dni", nullable = false, length = 8)
	private String DNI;
	
	@Schema(description = "El DNI debe tener 9 caracteres")
	@Size(min = 9, message = "El DNI debe tener 9 caracteres")
	@Column(name = "telefono", nullable = false, length = 9)
	private String Phone;
	
	@Schema(description = "El Correo debe tener 10 caracteres")
	@Size(min = 10, message = "El DNI debe tener 10 caracteres")
	@Column(name = "correo", nullable = false, length = 25)
	private String Email;
	
	@Schema(description = "El Codigo de AFP es obligatorio")
	@Size(min = 1, message = "El Codigo de AFP es obligatorio")
	@Column(name = "afp", nullable = false, length = 99)
	private String Afp;
}
