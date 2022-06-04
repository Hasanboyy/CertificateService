package com.iSystem.CertificateService.service;

import com.iSystem.CertificateService.model.Direction;
import com.iSystem.CertificateService.repository.DirectionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DirectionService {
    private DirectionRepository directionRepository;

    public boolean create(Direction direction) {
        directionRepository.save(direction);
        return true;
    }

    public List<Direction> getAll() {
        return directionRepository.findAll();
    }

}
