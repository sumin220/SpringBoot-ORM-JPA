package com.example.myjpa.hellojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JpaMain {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();
        //code

        try {
            Member member1 = new Member(150L, "A");
            member1.setName("AAAA");

            em.detach(member1);

            log.info("===========================");

            //영속

            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }


    }
}
