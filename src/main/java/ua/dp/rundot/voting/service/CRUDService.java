package ua.dp.rundot.voting.service;

/**
 * Base CRUD interface for all services
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public interface CRUDService<T> {

    T create(T t);
    void update(T t);
    void delete(int id);
    T find(int id);
    Iterable<T> findAll();

}
