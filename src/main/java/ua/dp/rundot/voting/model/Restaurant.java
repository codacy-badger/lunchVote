package ua.dp.rundot.voting.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Simple Entity representing Restaurant
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Entity
@Table(name = "restaurants", uniqueConstraints =
    @UniqueConstraint(name = "restaurants_unique_name_idx", columnNames = "name")
)
public class Restaurant extends AbstractBaseEntity {

    @Column(name = "name", nullable = false)
    private String name;

    public Restaurant() {}

    public Restaurant(Integer id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
