package ua.dp.rundot.voting;

import ua.dp.rundot.voting.model.Menu;

import java.time.LocalDate;

import static ua.dp.rundot.voting.DishTestData.*;
import static ua.dp.rundot.voting.RestaurantTestData.RESTAURANT1;
import static ua.dp.rundot.voting.RestaurantTestData.RESTAURANT2;
import static ua.dp.rundot.voting.model.AbstractBaseEntity.START_SEQ;

/**
 * Test data for {@link}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

class MenuTestData {

    private static final int START_ID = START_SEQ + 4;

    static final Menu MENU1 = new Menu(START_ID, LocalDate.of(2018, 7, 26), RESTAURANT1, DISH1, DISH2, DISH3);
    static final Menu MENU2 = new Menu(START_ID + 1, LocalDate.of(2018, 7, 26), RESTAURANT2, DISH4, DISH5, DISH6);

}
