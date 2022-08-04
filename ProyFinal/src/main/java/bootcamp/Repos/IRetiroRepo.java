package bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import bootcamp.Models.Retiro;

public interface IRetiroRepo extends MongoRepository<Retiro, Integer>{

}
