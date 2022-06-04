package com.iSystem.CertificateService.repository;

import com.iSystem.CertificateService.model.Direction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectionRepository extends JpaRepository<Direction,Integer> {
}
