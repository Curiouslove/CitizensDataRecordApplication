package com.snapnet.citizensdatarecord.data.repository;

import com.snapnet.citizensdatarecord.data.model.Wards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardsRepository extends JpaRepository<Wards, Long>{

}