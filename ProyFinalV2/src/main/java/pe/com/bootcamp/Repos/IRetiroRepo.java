package pe.com.bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.bootcamp.Models.Retiro;

public interface IRetiroRepo extends MongoRepository<Retiro, Integer>{

}
