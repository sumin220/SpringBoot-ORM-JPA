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
    private String id;

    @Column(unique = true, length = 10, nullable = false)
    private String name;



}
