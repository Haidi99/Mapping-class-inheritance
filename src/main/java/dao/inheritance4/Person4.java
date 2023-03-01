package dao.inheritance4;
// default package
// Generated Jan 10, 2023, 10:26:34 AM by Hibernate Tools 6.0.0.Alpha2


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.InheritanceType;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name="person"
    ,catalog="inheritance4"
)
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Person4 implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;
     //private String personType;

    public Person4() {
    }

	
    public Person4(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    // public Person(String firstName, String lastName, String personType) {
    //    this.firstName = firstName;
    //    this.lastName = lastName;
    //   // this.personType = personType;
    // }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id", unique=true, nullable=false)
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    
    @Column(name="first_name", nullable=false, length=50)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="last_name", nullable=false, length=50)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    // @Column(name="person_type", length=45)
    // public String getPersonType() {
    //     return this.personType;
    // }
    
    // public void setPersonType(String personType) {
    //     this.personType = personType;
    // }




}

