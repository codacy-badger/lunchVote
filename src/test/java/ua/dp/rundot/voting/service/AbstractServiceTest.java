package ua.dp.rundot.voting.service;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Parent class to hold Spring ctx while testing
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@RunWith(SpringRunner.class)
@ContextConfiguration("classpath:spring/spring-app.xml")
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
public abstract class AbstractServiceTest {

    protected static final Logger log = LoggerFactory.getLogger(AbstractServiceTest.class);

}
