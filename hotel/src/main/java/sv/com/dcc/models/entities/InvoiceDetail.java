package sv.com.dcc.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "invoices_details")
public class InvoiceDetail implements Serializable {
	private static final long serialVersionUID =1L;
	
	@Id
	private Long id;
	
	@Column
	private Integer quantity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@JoinColumn(name="product_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private Product product;
}
