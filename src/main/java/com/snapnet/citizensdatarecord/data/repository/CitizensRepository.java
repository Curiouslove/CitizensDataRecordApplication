package com.snapnet.citizensdatarecord.data.repository;

import com.snapnet.citizensdatarecord.data.model.Citizens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CitizensRepository extends JpaRepository<Citizens, Long> {
}
