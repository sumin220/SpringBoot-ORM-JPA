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
    private Long id;

    @Column(unique = true, length = 10, nullable = false)
    private String name;

    private Integer age;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date ModifiedDate;

    @Lob
    private String descriiption;

}
