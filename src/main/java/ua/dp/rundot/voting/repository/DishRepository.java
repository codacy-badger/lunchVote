package ua.dp.rundot.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dp.rundot.voting.model.Dish;

/**
 * Spring Data-Jpa repository for {@link Dish}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public interface DishRepository extends JpaRepository<Dish, Integer> {
}
