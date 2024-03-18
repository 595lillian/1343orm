package pojo;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class SystemUser {
    @EmbeddedId
    private PK pk;
    private String name;
}
