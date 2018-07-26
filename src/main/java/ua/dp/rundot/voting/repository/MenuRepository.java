package ua.dp.rundot.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dp.rundot.voting.model.Menu;

/**
 * Spring Data-Jpa repository for {@link Menu}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
