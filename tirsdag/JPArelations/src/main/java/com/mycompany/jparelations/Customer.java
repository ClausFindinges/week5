/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.jparelations;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Claus
 */
@Entity
public class Customer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private Address address; 

    
    @ElementCollection
    private List<String> hobbies = new ArrayList();

    public Customer() {
    }
    
    

    public Customer(String firstname, String lastname) {
       
        this.firstName = firstname;
        this.lastName = lastname;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
   public void addHobby(String s) {
       
       hobbies.add(s);
   
       
   }
           
   public String getHobbies() {

       return String.join(",", hobbies);
       
   }

   @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", firstname=" + firstName + ", lastname=" + lastName + '}';
    }}
 


    