package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * A `MergeRequestID` is a global ID. It is encoded as a string.
 *
 * An example `MergeRequestID` is: `"gid://gitlab/MergeRequest/1"`.
 */
@Name("MergeRequestID")
public class MergeRequestID {

    private String value;

    public MergeRequestID(String value) {
        this.value = value;
    }

    public static MergeRequestID valueOf(String value) {
        return new MergeRequestID(value);
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
        MergeRequestID other = (MergeRequestID) obj;
        return Objects.equals(value, other.value);
    }
}
