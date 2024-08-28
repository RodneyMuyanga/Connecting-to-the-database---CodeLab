package org.example.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import org.example.entities.Student;
import org.example.persistence.HibernateConfig;

import java.util.Set;

public class StudentDAO implements IDAO<Student> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    public void create(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        }
    }

    @Override
    public Student getById(Integer id) {
        return null;
    }

    @Override
    public Set<Student> getAll() {
        return Set.of();
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(Student student) {

    }
}
