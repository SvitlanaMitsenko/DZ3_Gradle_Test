package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setAge(3);
        animal.setName("Mursik");
       // animal.setId(1);
        animal.setTail(true);

        Animal animal2 = new Animal();
        animal2.setAge(8);
        animal2.setName("Bella");
       // animal2.setId(2);
        animal2.setTail(false);

        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        session.beginTransaction();
        session.save(animal);
        session.save(animal2);
        session.getTransaction().commit();
        session.close();

        //SessionFactory factory = ( new Configuration()).configure().buildSessionFactory();
        System.out.println("Hello world!");

    }
}