package ua.dp.rundot.voting.model;

import javax.persistence.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple Entity representing User
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@Entity
@Table(name = "users", uniqueConstraints =
        @UniqueConstraint(name = "users_unique_username_idx", columnNames = "username")
)
public class User extends AbstractBaseEntity {

    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "role")
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.ORDINAL)
    private Set<Role> roles;

    public User() { }

    private User(Integer id, String username, String password, Set<Role> roles) {
        super(id);
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    public User(Integer id, String username, String password, Role ... roles) {
        this(id, username, password, new HashSet<>(Arrays.asList(roles)));
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                '}';
    }

}
