package ua.dp.rundot.voting.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static ua.dp.rundot.voting.UserTestData.ADMIN;

/**
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public class UserServiceImplTest extends AbstractServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void create() {
        userService.create(ADMIN);
        log.debug(userService.findAll().toString());
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
        //TODO: add method body
    }
}