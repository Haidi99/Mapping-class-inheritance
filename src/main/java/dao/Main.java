package dao;

import dao.inheritance1.Student1;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        /* Inheritance #1 */
        EntityManagerFactory entityManagerFactory1 = Persistence.createEntityManagerFactory("inheritance1");
        EntityManager entityManager1 = entityManagerFactory1.createEntityManager();

        dao.inheritance1.Student1 student1 = new dao.inheritance1.Student1();
        student1.setFirstName("test");
        student1.setLastName("test");
        student1.setDepartment("inheritance1");

        entityManager1.getTransaction().begin();
        entityManager1.persist(student1);
        entityManager1.getTransaction().commit();
        entityManager1.clear();
        System.out.println("student Record Successfully Inserted In The Database (using Inheritance 1)");

        /* Inheritance #2 */
        EntityManagerFactory entityManagerFactory2 = Persistence.createEntityManagerFactory("inheritance2");
        EntityManager entityManager2 = entityManagerFactory2.createEntityManager();

        dao.inheritance2.Student2 student2 = new dao.inheritance2.Student2();
        student2.setFirstName("test");
        student2.setLastName("test");
        student2.setDepartment("inheritance2");

        entityManager2.getTransaction().begin();
        entityManager2.persist(student2);
        entityManager2.getTransaction().commit();
        entityManager2.clear();
        System.out.println("student Record Successfully Inserted In The Database (using Inheritance 2)");


        /* Inheritance #3 */
        EntityManagerFactory entityManagerFactory3 = Persistence.createEntityManagerFactory("inheritance3");
        EntityManager entityManager3 = entityManagerFactory3.createEntityManager();

        dao.inheritance3.Student3 student3 = new dao.inheritance3.Student3();
        student3.setFirstName("test");
        student3.setLastName("test");
        student3.setDepartment("inheritance3");

        entityManager3.getTransaction().begin();
        entityManager3.persist(student3);
        entityManager3.getTransaction().commit();
        entityManager3.clear();
        System.out.println("student Record Successfully Inserted In The Database (using Inheritance 3)");


        /* Inheritance #4 */
        EntityManagerFactory entityManagerFactory4 = Persistence.createEntityManagerFactory("inheritance4");
        EntityManager entityManager4 = entityManagerFactory4.createEntityManager();

        dao.inheritance4.Student4 student4 = new dao.inheritance4.Student4();
        student4.setFirstName("test");
        student4.setLastName("test");
        student4.setDepartment("inheritance4");

        entityManager4.getTransaction().begin();
        entityManager4.persist(student4);
        entityManager4.getTransaction().commit();
        entityManager4.clear();
        System.out.println("student Record Successfully Inserted In The Database (using Inheritance 4)");

    }
}