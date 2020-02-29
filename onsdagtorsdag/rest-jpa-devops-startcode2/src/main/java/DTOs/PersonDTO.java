package DTOs;


import entities.Person;

public class PersonDTO {

    private long id;
    private String fName;
    private String lName;
    private String phone;
    

    public PersonDTO(Person p) {

        this.fName = p.getFirstname();
        this.lName = p.getLastname();
        this.phone = p.getPhone();
        this.id = p.getId();

    }

    public PersonDTO(String fn,String ln, String phone) {

        this.fName = fn;
        this.lName = ln;
        this.phone = phone;        

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "PersonDTO{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", phone=" + phone + '}';
    }}

        // getters setters hashcode and equals 
 

