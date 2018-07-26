package ua.dp.rundot.voting;

import ua.dp.rundot.voting.model.Vote;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static ua.dp.rundot.voting.RestaurantTestData.RESTAURANT1;
import static ua.dp.rundot.voting.RestaurantTestData.RESTAURANT2;
import static ua.dp.rundot.voting.UserTestData.ADMIN;
import static ua.dp.rundot.voting.UserTestData.USER;
import static ua.dp.rundot.voting.model.AbstractBaseEntity.START_SEQ;

/**
 * Test data for {@link }
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public class VoteTestData {

    private static final int START_ID = START_SEQ + 12;

    public static final Vote VOTE1 = new Vote(START_ID, ADMIN, RESTAURANT1, LocalDateTime.of(2018, 7, 26, 9, 0, 0), LocalDate.of(2018, 7, 26));
    public static final Vote VOTE2 = new Vote(START_ID + 1, USER, RESTAURANT2, LocalDateTime.of(2018, 7, 26, 10, 30, 0), LocalDate.of(2018, 7, 26));

}
