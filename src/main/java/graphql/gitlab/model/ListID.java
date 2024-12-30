package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * A `ListID` is a global ID. It is encoded as a string.
 *
 * An example `ListID` is: `"gid://gitlab/List/1"`.
 */
@Name("ListID")
public class ListID {

    private String value;

    public ListID(String value) {
        this.value = value;
    }

    public static ListID valueOf(String value) {
        return new ListID(value);
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
        ListID other = (ListID) obj;
        return Objects.equals(value, other.value);
    }
}
