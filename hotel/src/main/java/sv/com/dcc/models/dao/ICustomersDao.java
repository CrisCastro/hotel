package sv.com.dcc.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.dcc.models.entities.customers;


public interface ICustomersDao extends CrudRepository<customers, Long>{
		
		//CrudRepository implementa todas las operaciones basicas de un crud.
		
		//@Query("select u from customers u where u.email =?1")
		//public customers findByEmailAddress(String email);
}
