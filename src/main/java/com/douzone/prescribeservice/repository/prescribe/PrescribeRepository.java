package com.douzone.prescribeservice.repository.prescribe;

import com.douzone.prescribeservice.entity.Prescribe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrescribeRepository extends JpaRepository<Prescribe, Long> {
    // @Query("select p from Prescribe p where p.visit.visitNo = 1")
    List<Prescribe> findAllByVisitVisitCode(Long visitNo);
}
