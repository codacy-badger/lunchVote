package ua.dp.rundot.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dp.rundot.voting.model.User;

/**
 * Spring Data-Jpa repository for {@link User}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public interface UserRepository extends JpaRepository<User, Integer> {
}
