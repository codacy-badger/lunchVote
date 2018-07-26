package ua.dp.rundot.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dp.rundot.voting.model.Restaurant;

/**
 * Spring Data-Jpa repository for {@link Restaurant}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public interface RestaurantRepository extends JpaRepository<Restaurant, Integer> {
}
