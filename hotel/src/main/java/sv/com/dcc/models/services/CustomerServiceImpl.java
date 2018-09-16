package sv.com.dcc.models.services;

	import java.util.List;
	
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;
	import org.springframework.transaction.annotation.Transactional;
	
	import sv.com.dcc.models.dao.ICustomersDao;
	import sv.com.dcc.models.entities.customers;
	
@Service
public class CustomerServiceImpl implements ICustomerService {
	
	@Autowired
	private ICustomersDao customerDao;
	
	@Override
	@Transactional(readOnly=true)
	public List<customers> findAll() {
	 return (List<customers>) customerDao.findAll();
  }
	@Override
	@Transactional(readOnly=true) 
	public customers findOne(Long id) {
		return customerDao.findById(id).orElse(null);		
  }
	@Override
	@Transactional
	public void save(customers customer) {
		customerDao.save(customer);
  }
	@Override
	@Transactional
	public void delete(Long id) {
		customerDao.deleteById(id);
	}
}
	
