package pe.com.bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.bootcamp.Models.AFP;

public interface IAFPRepo extends MongoRepository<AFP, Integer>{

}
