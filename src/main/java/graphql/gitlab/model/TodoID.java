package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `TodoID` is a global ID. It is encoded as a string.
 *
 * An example `TodoID` is: `"gid://gitlab/Todo/1"`.
 */
@Name("TodoID")
public class TodoID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public TodoID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static TodoID valueOf(String value) {
        return new TodoID(value);
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
        TodoID other = (TodoID) obj;
        return Objects.equals(value, other.value);
    }
}
