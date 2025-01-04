package com.nguyenklinh.shopapp.repositorys;

import com.nguyenklinh.shopapp.models.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}