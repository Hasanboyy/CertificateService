package com.iSystem.CertificateService.controller;

import com.iSystem.CertificateService.model.Direction;
import com.iSystem.CertificateService.service.DirectionService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(params = ("/api/v1/direction"))
public class DirectionController {
    private DirectionService directionService;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Direction direction){
        boolean result = directionService.create(direction);
        return ResponseEntity.ok(result);
    }

    @GetMapping("/getAll")
    public ResponseEntity<?> getAll(){
        List<Direction> result = directionService.getAll();
        return ResponseEntity.ok(result);
    }



}
