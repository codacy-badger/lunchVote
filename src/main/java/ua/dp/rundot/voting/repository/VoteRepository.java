package ua.dp.rundot.voting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.dp.rundot.voting.model.Vote;

/**
 * Spring Data-Jpa repository for {@link Vote}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

public interface VoteRepository extends JpaRepository<Vote, Integer> {
}
