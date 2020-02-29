/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facades;

import DTOs.PersonDTO;
import java.util.List;

/**
 *
 * @author Claus
 */
public interface IPersonFacadeInterface {
    
  public PersonDTO addPerson(String fName, String lName, String phone);  
  public PersonDTO deletePerson(int id);  
  public PersonDTO getPerson(int id);  
  public List<PersonDTO> getAllPersons();  
  public PersonDTO editPerson(PersonDTO p);



    
}
