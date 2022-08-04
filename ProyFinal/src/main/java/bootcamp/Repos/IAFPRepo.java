package bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import bootcamp.Models.AFP;

public interface IAFPRepo extends MongoRepository<AFP, Integer>{

}
