package com.douzone.prescribeservice.repository.prescribe;

import com.douzone.prescribeservice.entity.Prescribe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescribeRepository extends JpaRepository<Prescribe, Long>, CustomPrescribeRepository {
    // @Query("select p from Prescribe p where p.visit.visitNo = 1")
    List<Prescribe> findAllByVisitVisitCode(Long visitCode);

}
