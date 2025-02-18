package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * A `ReleaseID` is a global ID. It is encoded as a string.
 *
 * An example `ReleaseID` is: `"gid://gitlab/Release/1"`.
 */
@Name("ReleaseID")
public class ReleaseID {

    private String value;

    public ReleaseID(String value) {
        this.value = value;
    }

    public static ReleaseID valueOf(String value) {
        return new ReleaseID(value);
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReleaseID other = (ReleaseID) obj;
        return Objects.equals(value, other.value);
    }
}
