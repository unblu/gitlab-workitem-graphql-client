package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `BoardsEpicListID` is a global ID. It is encoded as a string.
 *
 * An example `BoardsEpicListID` is: `"gid://gitlab/Boards::EpicList/1"`.
 */
@Name("BoardsEpicListID")
public class BoardsEpicListID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public BoardsEpicListID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static BoardsEpicListID valueOf(String value) {
        return new BoardsEpicListID(value);
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
        BoardsEpicListID other = (BoardsEpicListID) obj;
        return Objects.equals(value, other.value);
    }
}
