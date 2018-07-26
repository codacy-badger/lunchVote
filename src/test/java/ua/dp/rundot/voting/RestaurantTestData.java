package ua.dp.rundot.voting;

import ua.dp.rundot.voting.model.Restaurant;

import static ua.dp.rundot.voting.model.AbstractBaseEntity.START_SEQ;

/**
 * Test data for {@link }
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

class RestaurantTestData {

    private static final int START_ID = START_SEQ + 2;

    static final Restaurant RESTAURANT1 = new Restaurant(START_ID, "Кафе ДЕПО");
    static final Restaurant RESTAURANT2 = new Restaurant(START_ID, "Ресторан БИРХАУЗ");

}
