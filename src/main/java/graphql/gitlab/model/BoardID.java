package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `BoardID` is a global ID. It is encoded as a string.
 *
 * An example `BoardID` is: `"gid://gitlab/Board/1"`.
 */
@Name("BoardID")
public class BoardID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public BoardID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static BoardID valueOf(String value) {
        return new BoardID(value);
    }

    @Override
    @JsonValue
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
        BoardID other = (BoardID) obj;
        return Objects.equals(value, other.value);
    }
}
