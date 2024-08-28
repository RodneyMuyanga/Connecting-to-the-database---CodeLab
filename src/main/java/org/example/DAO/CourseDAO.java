package org.example.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import org.example.entities.Course;
import org.example.persistence.HibernateConfig;

import java.time.LocalTime;
import java.util.Set;
import java.util.stream.Collectors;

public class CourseDAO implements IDAO<Course> {

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    @Override
    public Course getById(Integer id) {
        try (EntityManager em = emf.createEntityManager()) {
            return em.find(Course.class, id);
        }
    }

    @Override
    public Set<Course> getAll() {
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Course> query = em.createQuery("SELECT c FROM Course c", Course.class);
            return query.getResultList().stream().collect(Collectors.toSet());
        }
    }

    @Override
    public void create(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.persist(course);
            em.getTransaction().commit();
        }
    }

    @Override
    public void update(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.merge(course);
            em.getTransaction().commit();
        }
    }

    @Override
    public void delete(Course course) {
        try (EntityManager em = emf.createEntityManager()) {
            em.getTransaction().begin();
            em.remove(course);
            em.getTransaction().commit();
        }
    }

    public static void main(String[] args) {
        CourseDAO courseDAO = new CourseDAO();

        /*courseDAO.create(Course.builder()
                .teacher("Signe")
                .semester(2)
                .classroom("3.C 9")
                .timeOfCourse(LocalTime.of(12, 0))
                .build());*/

        // System.out.println(courseDAO.getById(2));

        /*Course course1 = courseDAO.getById(1);
        course1.setTeacher("Thomas");

        courseDAO.update(course1);

        courseDAO.delete(course1);*/

        // courseDAO.getAll().forEach(System.out::println);
    }
}
