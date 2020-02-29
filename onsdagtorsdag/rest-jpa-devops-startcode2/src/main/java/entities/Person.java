/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import javax.persistence.NamedQuery;


/**
 *
 * @author Claus
 */

@Entity
@NamedQuery(name = "Person.deleteAllRows", query = "DELETE from Person")
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;    
    public String fName, lName, phone;
    public Date created, lastEdited;

    public Person() {
    }
    
    

    public Person(String firstname, String lastname, String phone, Date created, Date lastEdited) {
       
        this.fName = firstname;
        this.lName = lastname;
        this.phone = phone;
        this.created = created;
        this.lastEdited = lastEdited;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public String getFirstname() {
        return fName;
    }

    public void setFirstname(String firstname) {
        this.fName = fName;
    }

    public String getLastname() {
        return lName;
    }

    public void setLastname(String lastname) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getLastEdited() {
        return lastEdited;
    }

    public void setLastEdited(Date lastEdited) {
        this.lastEdited = lastEdited;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", firstname=" + fName + ", lastname=" + lName + ", phone=" + phone + ", created=" + created + ", lastEdited=" + lastEdited + '}';
    }
    }
    

