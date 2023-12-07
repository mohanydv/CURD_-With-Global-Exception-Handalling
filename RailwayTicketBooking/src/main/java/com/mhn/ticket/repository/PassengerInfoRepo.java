package com.mhn.ticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mhn.ticket.entity.PassengerInfo;
@Repository
public interface PassengerInfoRepo extends JpaRepository<PassengerInfo, Long> {

}
