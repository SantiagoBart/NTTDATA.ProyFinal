package bootcamp.Bean;

import java.util.List;

import bootcamp.Models.AFP;
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
