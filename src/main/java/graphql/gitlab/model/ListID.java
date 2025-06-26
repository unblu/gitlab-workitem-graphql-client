package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `ListID` is a global ID. It is encoded as a string.
 *
 * An example `ListID` is: `"gid://gitlab/List/1"`.
 */
@Name("ListID")
public class ListID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public ListID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static ListID valueOf(String value) {
        return new ListID(value);
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
        ListID other = (ListID) obj;
        return Objects.equals(value, other.value);
    }
}
