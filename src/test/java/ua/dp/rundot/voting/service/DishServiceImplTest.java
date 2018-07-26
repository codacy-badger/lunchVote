package ua.dp.rundot.voting.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;
import ua.dp.rundot.voting.model.Dish;

import java.util.Set;

import static org.junit.Assert.*;

/**
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/spring-app.xml")
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
public class DishServiceImplTest {

    @Autowired
    DishService dishService;

    private static final Logger log = LoggerFactory.getLogger(DishServiceImplTest.class);

    @Test
    public void create() {
    }

    @Test
    public void update() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void find() {
    }

    @Test
    public void findAll() {
        Iterable<Dish> dishes = dishService.findAll();
        dishes.forEach(d -> log.debug(d.toString()));
    }
}