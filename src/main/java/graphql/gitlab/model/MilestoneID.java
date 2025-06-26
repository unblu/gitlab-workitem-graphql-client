package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `MilestoneID` is a global ID. It is encoded as a string.
 *
 * An example `MilestoneID` is: `"gid://gitlab/Milestone/1"`.
 */
@Name("MilestoneID")
public class MilestoneID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public MilestoneID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static MilestoneID valueOf(String value) {
        return new MilestoneID(value);
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
        MilestoneID other = (MilestoneID) obj;
        return Objects.equals(value, other.value);
    }
}
