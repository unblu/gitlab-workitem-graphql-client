package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `NoteableID` is a global ID. It is encoded as a string.
 *
 * An example `NoteableID` is: `"gid://gitlab/Noteable/1"`.
 */
@Name("NoteableID")
public class NoteableID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public NoteableID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static NoteableID valueOf(String value) {
        return new NoteableID(value);
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
        NoteableID other = (NoteableID) obj;
        return Objects.equals(value, other.value);
    }
}
