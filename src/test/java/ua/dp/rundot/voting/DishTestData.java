package ua.dp.rundot.voting;

import ua.dp.rundot.voting.model.Dish;

import static ua.dp.rundot.voting.MenuTestData.MENU1;
import static ua.dp.rundot.voting.MenuTestData.MENU2;
import static ua.dp.rundot.voting.model.AbstractBaseEntity.START_SEQ;

/**
 * Test data for {@link }
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

class DishTestData {

    private static final int START_ID = START_SEQ + 6;

    static final Dish DISH1 = new Dish(START_ID, "Греческий салат", 40, MENU1);
    static final Dish DISH2 = new Dish(START_ID + 1, "Куриный бульон", 34, MENU1);
    static final Dish DISH3 = new Dish(START_ID + 2, "Бифштекс из телятины", 48, MENU1);
    static final Dish DISH4 = new Dish(START_ID + 3, "Помидоры с грилированными кабачками", 35, MENU2);
    static final Dish DISH5 = new Dish(START_SEQ + 4, "Суп гороховый", 30, MENU2);
    static final Dish DISH6 = new Dish(START_SEQ + 5, "Куриное филе по-французски", 43, MENU2);

}
