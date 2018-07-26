package ua.dp.rundot.voting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

/**
 * Test class for experimenting with Spring Context initialization
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@ContextConfiguration({
        "classpath:spring/spring-app.xml"
})
public class SpringCtxTest {

    private static final Logger log = LoggerFactory.getLogger(SpringCtxTest.class);

    @Autowired
    ApplicationContext ctx;

    @Test
    public void ctxInitTest() {
        log.debug(Arrays.toString(ctx.getBeanDefinitionNames()));
    }

}
