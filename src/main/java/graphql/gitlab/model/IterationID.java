package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * A `IterationID` is a global ID. It is encoded as a string.
 *
 * An example `IterationID` is: `"gid://gitlab/Iteration/1"`.
 * The older format `"gid://gitlab/EEIteration/1"` was deprecated in 13.3.
 */
@Name("IterationID")
public class IterationID {

    private String value;

    public IterationID(String value) {
        this.value = value;
    }

    public static IterationID valueOf(String value) {
        return new IterationID(value);
    }

    @Override
    public String toString() {
        return value;
    }

    public String getValue() {
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
        IterationID other = (IterationID) obj;
        return Objects.equals(value, other.value);
    }
}
