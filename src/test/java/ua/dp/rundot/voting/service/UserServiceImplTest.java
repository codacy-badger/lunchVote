package ua.dp.rundot.voting.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static ua.dp.rundot.voting.UserTestData.ADMIN;

/**
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-app.xml"
})
public class UserServiceImplTest {

    private static final Logger log = LoggerFactory.getLogger(UserServiceImplTest.class);

    @Autowired
    UserService userService;

    @Test
    public void create() {
        userService.create(ADMIN);
        log.debug(userService.findAll().toString());
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
    }
}