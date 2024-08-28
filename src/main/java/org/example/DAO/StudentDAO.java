package org.example.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

import org.example.entities.Student;
import org.example.persistence.HibernateConfig;

import java.util.Set;

public class StudentDAO implements IDAO {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    public void creteStudent(Student student) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(student);
            em.getTransaction().commit();
        }
    }

    @Override
    public Object getStudentById(Integer id) {
        return null;
    }

    @Override
    public Object getCourseById(Integer id) {
        return null;
    }

    @Override
    public Set getAll() {
        return Set.of();
    }

    @Override
    public void create(Object o) {

    }

    @Override
    public void Update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }
}
