package ua.dp.rundot.voting.model;

import javax.persistence.*;

/**
 * Base Entity for holding global sequence
 *
 * @author Yevhen Maksymovych
 * @version 1.0
 */

@MappedSuperclass
public abstract class AbstractBaseEntity {

    public final static int START_SEQ = 100_000;

    @Id
    @SequenceGenerator(name = "global_seq", sequenceName = "global_seq", initialValue = START_SEQ, allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "global_seq")
    protected Integer id;

    protected AbstractBaseEntity() {
    }

    protected AbstractBaseEntity(Integer id) {
        this.id = id;
    }

    public boolean isNew() { return id == null; }

}
