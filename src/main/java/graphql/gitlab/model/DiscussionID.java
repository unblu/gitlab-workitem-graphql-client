package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `DiscussionID` is a global ID. It is encoded as a string.
 *
 * An example `DiscussionID` is: `"gid://gitlab/Discussion/1"`.
 */
@Name("DiscussionID")
public class DiscussionID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public DiscussionID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static DiscussionID valueOf(String value) {
        return new DiscussionID(value);
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
        DiscussionID other = (DiscussionID) obj;
        return Objects.equals(value, other.value);
    }
}
