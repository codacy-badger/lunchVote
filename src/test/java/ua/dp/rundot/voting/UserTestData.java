package ua.dp.rundot.voting;

import ua.dp.rundot.voting.model.User;

import static ua.dp.rundot.voting.model.AbstractBaseEntity.START_SEQ;
import static ua.dp.rundot.voting.model.Role.ROLE_ADMIN;
import static ua.dp.rundot.voting.model.Role.ROLE_USER;

/**
 * Test data for {@link }
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public class UserTestData {

    private static final int START_ID = START_SEQ;

    public static final User ADMIN = new User(START_ID, "admin", "adminpassword", ROLE_USER, ROLE_ADMIN);
    static final User USER = new User(START_ID + 1,"user", "userpassword", ROLE_USER);

}
