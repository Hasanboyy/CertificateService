package com.iSystem.CertificateService.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter

@Entity
@Table(name = ("certificates"))
public class Certificate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = ("user_id"),insertable = false,updatable = false)
    private User user;
    @Column(name = ("user_id"))
    private Integer userId;

    @ManyToOne
    @JoinColumn(name = ("direction_id"),insertable = false,updatable = false)
    private Direction direction;
    @Column(name = ("direction_id"))
    private Integer directionId;


}
