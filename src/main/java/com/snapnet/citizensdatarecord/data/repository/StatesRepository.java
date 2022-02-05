package com.snapnet.citizensdatarecord.data.repository;

import com.snapnet.citizensdatarecord.data.model.States;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepository  extends JpaRepository<States, Long> {
}
