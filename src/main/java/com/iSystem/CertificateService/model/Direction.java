package com.iSystem.CertificateService.model;

import lombok.*;
import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("directions"))
public class Direction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;

}
