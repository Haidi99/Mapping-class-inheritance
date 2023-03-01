// default package
// Generated Jan 9, 2023, 9:43:53 PM by Hibernate Tools 6.0.0.Alpha2
package dao.inheritance1;

import jakarta.persistence.Column;
//import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import static jakarta.persistence.GenerationType.IDENTITY;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Table;

/**
 * Person generated by hbm2java
 */
@Table(name="person"
    ,catalog="inheritance1"
)
@MappedSuperclass
public abstract class Person1 implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;

    public Person1() {
    }

    public Person1(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
    }
   
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




}

