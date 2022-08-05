package pe.com.bootcamp.Models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
@Document(collection="Retiro")
public class Retiro {
	
	@Size(min = 8, message = "El DNI debe tener 8 caracteres")
	@Column(name = "dni", nullable = false, length = 8)
	private int DNI;
		
	@Column(name="importe", nullable=false)
	private double Importe;
	
	@Column(name="fecharetiro", nullable=false)
	private Date FechaRetiro;
	
	@Column(name="NumeroCuenta", nullable=false)
	private String NumeroCuenta;
}
