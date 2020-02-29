/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jparelations;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Claus
 */


public class tester {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    
    public static void main(String[] args) {
     
    EntityManager em = emf.createEntityManager();
    
    em.getTransaction().begin();
    Customer cl = new Customer("Theis", "Jonson");
    Customer c2 = new Customer("Tanja", "Ridder");
    
    cl.addHobby("skak");
    c2.addHobby("Stangtennis");
    
    em.persist(cl);
    em.persist(c2);
    
    em.getTransaction().commit();
    
    Persistence.generateSchema ("NAME_OF YOUR_PU", null); 
    
    }
}
