package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `IterationsCadenceID` is a global ID. It is encoded as a string.
 *
 * An example `IterationsCadenceID` is: `"gid://gitlab/Iterations::Cadence/1"`.
 */
@Name("IterationsCadenceID")
public class IterationsCadenceID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public IterationsCadenceID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static IterationsCadenceID valueOf(String value) {
        return new IterationsCadenceID(value);
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
        IterationsCadenceID other = (IterationsCadenceID) obj;
        return Objects.equals(value, other.value);
    }
}
