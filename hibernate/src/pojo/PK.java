package pojo;

import java.io.Serializable;
import java.util.Objects;

public class PK implements Serializable {
    private String subSystem;
    private String user;

    public PK(String subSystem, String user) {
        this.subSystem = subSystem;
        this.user = user;
    }

    public PK() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        PK pk = (PK) o;
        return Objects.equals(subSystem, pk.subSystem) && Objects.equals(user, pk.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subSystem, user);
    }

    public String getSubSystem() {
        return subSystem;
    }

    public void setSubSystem(String subSystem) {
        this.subSystem = subSystem;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
