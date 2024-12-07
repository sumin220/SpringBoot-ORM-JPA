package com.example.myjpa.hellojpa;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(unique = true, length = 10, nullable = false)
    private String name;

    private String city;

    private String street;

    private String zipcode;



}
