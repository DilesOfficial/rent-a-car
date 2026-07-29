package com.skillmentor.rentacar.repo;

import com.skillmentor.rentacar.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.UUID;

@EnableJpaRepositories
public interface OrderDetailsRepo extends JpaRepository<OrderDetails, UUID> {
}
