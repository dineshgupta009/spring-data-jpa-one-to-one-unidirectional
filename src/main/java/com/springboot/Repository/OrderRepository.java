package com.springboot.Repository;

import com.springboot.Entity.Order1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order1,Long> {

    Order1 findByOrderTrackingNumber(String orderTrackingNumber);
}
