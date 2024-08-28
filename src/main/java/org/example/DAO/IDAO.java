package org.example.DAO;

import java.util.Set;

public interface IDAO<T> {
    T getStudentById(Integer id);

    T getCourseById(Integer id);

    Set<T> getAll();

    void create(T t);

    void Update(T t);

    void delete(T t);
}
