package bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import bootcamp.Models.Solicitud;

public interface ISolicitudRepo extends MongoRepository<Solicitud, Integer>{

}
