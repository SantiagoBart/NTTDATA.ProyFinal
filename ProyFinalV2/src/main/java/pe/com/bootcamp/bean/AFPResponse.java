package pe.com.bootcamp.bean;

import java.util.List;

import pe.com.bootcamp.Models.AFP;
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
