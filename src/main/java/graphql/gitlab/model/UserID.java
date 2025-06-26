package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `UserID` is a global ID. It is encoded as a string.
 *
 * An example `UserID` is: `"gid://gitlab/User/1"`.
 */
@Name("UserID")
public class UserID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public UserID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static UserID valueOf(String value) {
        return new UserID(value);
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
        UserID other = (UserID) obj;
        return Objects.equals(value, other.value);
    }
}
