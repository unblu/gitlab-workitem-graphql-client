package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `NoteID` is a global ID. It is encoded as a string.
 *
 * An example `NoteID` is: `"gid://gitlab/Note/1"`.
 */
@Name("NoteID")
public class NoteID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public NoteID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static NoteID valueOf(String value) {
        return new NoteID(value);
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
        NoteID other = (NoteID) obj;
        return Objects.equals(value, other.value);
    }
}
