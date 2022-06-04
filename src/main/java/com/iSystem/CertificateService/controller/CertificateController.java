package com.iSystem.CertificateService.controller;

import com.iSystem.CertificateService.service.CertificateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping(params = ("certificate"))
public class CertificateController {
    private CertificateService certificateService;
}
