package com.mhn.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhn.ticket.entity.PaymentInfo;
@Repository
public interface PaymentInfoRepo extends JpaRepository<PaymentInfo, String> {

}
