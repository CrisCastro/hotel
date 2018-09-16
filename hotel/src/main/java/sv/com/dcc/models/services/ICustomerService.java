package sv.com.dcc.models.services;

import java.util.List;
import sv.com.dcc.models.entities.customers;

public interface ICustomerService {
	
	
	public List<customers> findAll();
	
	public void save(customers customer);
	
	public customers findOne(Long id);
	
	public void delete (Long id);
}
