package ua.dp.rundot.voting.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Simple Entity representing Vote of {@link User} for {@link Restaurant}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Entity
@Table(name = "votes", uniqueConstraints =
    @UniqueConstraint(name = "votes_unique_user_id_target_date_idx", columnNames = {"user_id", "target_date"})
)
public class Vote extends AbstractBaseEntity {

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private User user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Restaurant restaurant;

    @Column(name = "local_date_time", nullable = false, columnDefinition = "timestamp default now()")
    private LocalDateTime localDateTime;

    @Column(name = "target_date", nullable = false)
    private LocalDate targetDate;

    public Vote() { }

    public Vote(Integer id, User user, Restaurant restaurant, LocalDateTime localDateTime, LocalDate targetDate) {
        super(id);
        this.user = user;
        this.restaurant = restaurant;
        this.localDateTime = localDateTime;
        this.targetDate = targetDate;
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", user=" + user +
                ", restaurant=" + restaurant +
                ", localDateTime=" + localDateTime +
                ", targetDate=" + targetDate +
                '}';
    }

}
