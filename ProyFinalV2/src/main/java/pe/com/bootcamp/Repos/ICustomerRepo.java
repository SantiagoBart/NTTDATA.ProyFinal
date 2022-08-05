package pe.com.bootcamp.Repos;

import org.springframework.data.mongodb.repository.MongoRepository;

import pe.com.bootcamp.Models.Customer;

public interface ICustomerRepo extends MongoRepository<Customer, Integer>{

}
