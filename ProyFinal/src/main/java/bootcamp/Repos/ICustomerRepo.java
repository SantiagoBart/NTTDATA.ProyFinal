package bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import bootcamp.Models.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, Integer>{

}
