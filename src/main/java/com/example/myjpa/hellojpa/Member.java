package com.example.myjpa.hellojpa;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Member {

    @Id
    private Long id;

    private String name;

}
