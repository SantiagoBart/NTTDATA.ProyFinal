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
@Schema(description = "Información de AFP")
@Entity
@Table(name = "AFP")
public class AFP {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;

	@Schema(description = "El Nombre debe tener minimo 3 caracteres")
	@Size(min = 3, message = "El Nombre debe tener minimo 3 caracteres")
	@Column(name = "nombres", nullable = false, length = 70)
	private String Name;
}
