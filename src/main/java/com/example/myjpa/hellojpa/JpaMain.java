package com.example.myjpa.hellojpa;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

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
            System.out.println("==BEFORE==");
            em.persist(member);
            Member findMEmber1 = em.find(Member.class, 1L);
            Member findMEmber2 = em.find(Member.class, 1L);
            System.out.println(findMEmber1==findMEmber2);

            System.out.println("==AFTER==");


            System.out.println("findMEmber = " + findMEmber1.getId());
            System.out.println("findMEmber = " + findMEmber1.getName());
        } catch (Exception e) {
            tx.rollback();
        }finally {
            em.close();
        }


    }
}
