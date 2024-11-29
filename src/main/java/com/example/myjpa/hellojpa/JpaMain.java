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
            Member member = new Member();
            member.setId(1L);
            member.setName("member1");

            //영속
            log.info("=================Before================");
            em.persist(member);
            Member findMEmber1 = em.find(Member.class, 1L);
            Member findMEmber2 = em.find(Member.class, 1L);

            log.info(String.valueOf(findMEmber1.equals(findMEmber2)));

            log.info("=================After==================");


            Long id = findMEmber1.getId();
            String name = findMEmber1.getName();
            log.info("member1 id = " + id);
            log.info("member1 name = " + name);

        } catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }


    }
}
