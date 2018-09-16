package sv.com.dcc.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import sv.com.dcc.models.entities.customers;
import sv.com.dcc.models.entities.invoice;


public interface IInvoiceDao {
	@Query(value="SELECT * FROM Invoice sw JOIN customers w ON (sw.customers_id)= w.id) WHERE w.id=?1", nativeQuery =true)
	public invoice findByCustomerId(Long id);
}
