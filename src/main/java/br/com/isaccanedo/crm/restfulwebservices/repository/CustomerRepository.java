package br.com.isaccanedo.crm.restfulwebservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.isaccanedo.crm.restfulwebservices.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
