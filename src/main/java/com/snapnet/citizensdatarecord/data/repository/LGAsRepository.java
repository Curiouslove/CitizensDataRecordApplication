package com.snapnet.citizensdatarecord.data.repository;

import com.snapnet.citizensdatarecord.data.model.LGAs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LGAsRepository extends JpaRepository<LGAs, Long> {
}
