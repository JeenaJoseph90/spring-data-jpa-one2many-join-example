package jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import jpa.dto.OrderResponse;
import jpa.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
	
	@Query("SELECT new jpa.dto.OrderResponse(c.name, p.productName) from Customer c JOIN c.products p")
	public List<OrderResponse> getJoinInfo();

}
