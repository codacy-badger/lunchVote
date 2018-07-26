package ua.dp.rundot.voting.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import ua.dp.rundot.voting.model.Dish;

/**
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public class DishServiceImplTest extends AbstractServiceTest {

    @Autowired
    DishService dishService;

    @Test
    public void create() {
        //TODO: add method body
    }

    @Test
    public void update() {
        //TODO: add method body
    }

    @Test
    public void delete() {
        //TODO: add method body
    }

    @Test
    public void find() {
        //TODO: add method body
    }

    @Test
    public void findAll() {
        Iterable<Dish> dishes = dishService.findAll();
        dishes.forEach(d -> log.debug(d.toString()));
    }
}