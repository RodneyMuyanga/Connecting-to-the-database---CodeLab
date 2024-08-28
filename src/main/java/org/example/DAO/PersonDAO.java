package org.example.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Person;

import org.example.persistence.HibernateConfig;

import java.time.LocalDate;
import java.util.Set;

public class PersonDAO implements IDAO<Person> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    public void create(Person person) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Person person) {

    }

    @Override
    public void delete(Person person) {

    }

    @Override
    public Person getById(Integer id) {
        return null;
    }

    @Override
    public Set<Person> getAll() {
        return Set.of();
    }



}