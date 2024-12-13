package com.example.myjpa.hellojpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "team") //1대 다 맵핑에서 나는 뭐랑 연결되어있지?
    private List<Member1> members = new ArrayList<>();




}
