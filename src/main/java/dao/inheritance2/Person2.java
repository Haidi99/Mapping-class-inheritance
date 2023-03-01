// default package
// Generated Jan 10, 2023, 12:51:06 AM by Hibernate Tools 6.0.0.Alpha2
package dao.inheritance2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;
import jakarta.persistence.TableGenerator;
import jakarta.persistence.InheritanceType;

/**
 * Person generated by hbm2java
 */
@Entity
@Table(name="person"
    ,catalog="inheritance2"
)
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public abstract class Person2  implements java.io.Serializable {


     private Integer id;
     private String firstName;
     private String lastName;

    public Person2() {
    }

    public Person2(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
    }
   
     @Id @GeneratedValue(strategy=GenerationType.TABLE) ///didn't work lma kont 3mlaha IDENTITY??////

     @TableGenerator(table ="my_sequences",name="testGenerator") ///?? oracle related configrations.
    

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


