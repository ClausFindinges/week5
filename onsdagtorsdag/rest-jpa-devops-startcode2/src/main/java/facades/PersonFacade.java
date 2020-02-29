package facades;

import DTOs.PersonDTO;
import entities.Person;
import entities.RenameMe;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class PersonFacade implements IPersonFacadeInterface {

    private static PersonFacade instance;
    private static EntityManagerFactory emf;

    //Private Constructor to ensure Singleton
    private PersonFacade() {
    }

    /**
     *
     * @param _emf
     * @return an instance of this facade class.
     */
    public static PersonFacade getFacadeExample(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new PersonFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    //TODO Remove/Change this before use
    public long getRenameMeCount() {
        EntityManager em = emf.createEntityManager();
        try {
            long renameMeCount = (long) em.createQuery("SELECT COUNT(r) FROM RenameMe r").getSingleResult();
            return renameMeCount;
        } finally {
            em.close();
        }

    }

    @Override
    public PersonDTO addPerson(String fName, String lName, String phone) {
        EntityManager em = emf.createEntityManager();

        try {
            Date date = new Date();
            Person p = new Person(fName, lName, phone, date, date);
            em.getTransaction().begin();
            em.persist(p);

            em.getTransaction().commit();
            PersonDTO persondto = new PersonDTO(p);
            return persondto;

        } finally {
            em.close();
        }
    }

    @Override
    public PersonDTO deletePerson(int id) {

        EntityManager em = emf.createEntityManager();

        try {

            Person p = em.find(Person.class, id);
            em.getTransaction().begin();
            em.remove(p);
            em.getTransaction().commit();
            PersonDTO p2 = new PersonDTO(p);
            return p2;
        } finally {
            em.close();
        }
    }

    @Override
    public PersonDTO getPerson(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            Person p = em.find(Person.class, id);
            PersonDTO p2 = new PersonDTO(p);
            return p2;

        } finally {
            em.close();
        }
    }

    @Override
    public List<PersonDTO> getAllPersons() {
        EntityManager em = emf.createEntityManager();
        try {
            {
                List<PersonDTO> PersonDTOList = new ArrayList<>();
                TypedQuery<Person> query
                        = em.createQuery("SELECT p FROM Person p", Person.class);
                query.getResultList().forEach((p)
                        -> {
                    PersonDTOList.add(new PersonDTO(p));
                });
                return PersonDTOList;
            }
        } finally {
            em.close();
        }
    }

    @Override
    public PersonDTO editPerson(PersonDTO p) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            em.persist(p);

            em.getTransaction().commit();
            return p;
        } finally {
            em.close();
        }

    }
}
