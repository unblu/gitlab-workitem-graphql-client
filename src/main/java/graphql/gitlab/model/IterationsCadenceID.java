package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * A `IterationsCadenceID` is a global ID. It is encoded as a string.
 *
 * An example `IterationsCadenceID` is: `"gid://gitlab/Iterations::Cadence/1"`.
 */
@Name("IterationsCadenceID")
public class IterationsCadenceID {

    private String value;

    public IterationsCadenceID(String value) {
        this.value = value;
    }

    public static IterationsCadenceID valueOf(String value) {
        return new IterationsCadenceID(value);
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
        IterationsCadenceID other = (IterationsCadenceID) obj;
        return Objects.equals(value, other.value);
    }
}
