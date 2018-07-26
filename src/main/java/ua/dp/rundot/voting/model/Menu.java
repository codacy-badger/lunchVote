package ua.dp.rundot.voting.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple Entity representing Menu for {@link Restaurant}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Entity
@Table(name = "menus", uniqueConstraints =
    @UniqueConstraint(name = "menus_unique_target_date_restaurant_idx", columnNames = {"target_date", "restaurant_id"})
)
public class Menu extends AbstractBaseEntity {

    @Column(name = "target_date", nullable = false)
    private LocalDate targetDate;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurant_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Restaurant restaurant;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "menu")
    private Set<Dish> dishes;

    public Menu() { }

    public Menu(Integer id, LocalDate targetDate, Restaurant restaurant, Set<Dish> dishes) {
        super(id);
        this.targetDate = targetDate;
        this.restaurant = restaurant;
        this.dishes = dishes;
    }

    public Menu(Integer id, LocalDate targetDate, Restaurant restaurant, Dish ... dishes) {
        this(id, targetDate, restaurant, new HashSet<>(Arrays.asList(dishes)));
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id=" + id +
                ", targetDate=" + targetDate +
                ", restaurant=" + restaurant +
                ", dishes=" + dishes +
                '}';
    }
}
