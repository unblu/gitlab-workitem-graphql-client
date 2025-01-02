package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * A `BoardID` is a global ID. It is encoded as a string.
 *
 * An example `BoardID` is: `"gid://gitlab/Board/1"`.
 */
@Name("BoardID")
public class BoardID {

    private String value;

    public BoardID(String value) {
        this.value = value;
    }

    public static BoardID valueOf(String value) {
        return new BoardID(value);
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
        BoardID other = (BoardID) obj;
        return Objects.equals(value, other.value);
    }
}
