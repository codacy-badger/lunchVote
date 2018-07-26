package ua.dp.rundot.voting.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;

/**
 * Simple Entity representing Dish item of {@link Menu}
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Entity
@Table(name = "dishes")
public class Dish extends AbstractBaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "menu_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Menu menu;

    public Dish() { }

    public Dish(Integer id, String name, double price, Menu menu) {
        super(id);
        this.name = name;
        this.price = price;
        this.menu = menu;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", menu=" + menu.id +
                '}';
    }
}
