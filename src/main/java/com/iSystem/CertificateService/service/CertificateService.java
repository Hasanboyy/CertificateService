package com.iSystem.CertificateService.service;

import com.iSystem.CertificateService.repository.CertificateRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CertificateService {
    private CertificateRepository certificateRepository;
}
