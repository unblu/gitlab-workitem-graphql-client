package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `IterationID` is a global ID. It is encoded as a string.
 *
 * An example `IterationID` is: `"gid://gitlab/Iteration/1"`.<br>
 * The older format `"gid://gitlab/EEIteration/1"` was deprecated in 13.3.
 */
@Name("IterationID")
public class IterationID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public IterationID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static IterationID valueOf(String value) {
        return new IterationID(value);
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
        IterationID other = (IterationID) obj;
        return Objects.equals(value, other.value);
    }
}
