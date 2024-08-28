package org.example.DAO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.example.entities.Person;
import org.example.persistence.HibernateConfig;

public class PersonDAO
{

    private EntityManagerFactory emf = HibernateConfig.getEntityManagerFactory();

    public void cretePerson(Person person)
    {
        try (EntityManager em = emf.createEntityManager())
        {
            em.getTransaction().begin();
            em.persist(person);
            em.getTransaction().commit();
        }
    }


}