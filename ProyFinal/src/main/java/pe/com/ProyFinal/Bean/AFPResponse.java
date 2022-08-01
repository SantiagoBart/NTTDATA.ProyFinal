package pe.com.ProyFinal.Bean;

import java.util.List;

import Model.AFP;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@Data
@NoArgsConstructor
public class AFPResponse {
 public List<AFP> AFPList;
}
