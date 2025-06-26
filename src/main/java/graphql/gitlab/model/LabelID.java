package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `LabelID` is a global ID. It is encoded as a string.
 *
 * An example `LabelID` is: `"gid://gitlab/Label/1"`.
 */
@Name("LabelID")
public class LabelID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public LabelID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static LabelID valueOf(String value) {
        return new LabelID(value);
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
        LabelID other = (LabelID) obj;
        return Objects.equals(value, other.value);
    }
}
