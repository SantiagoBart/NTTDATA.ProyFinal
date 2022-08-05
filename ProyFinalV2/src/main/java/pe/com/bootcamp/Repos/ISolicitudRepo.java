package pe.com.bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.bootcamp.Models.Solicitud;

public interface ISolicitudRepo extends MongoRepository<Solicitud, Integer>{

}
