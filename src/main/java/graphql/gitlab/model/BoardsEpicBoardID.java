package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `BoardsEpicBoardID` is a global ID. It is encoded as a string.
 *
 * An example `BoardsEpicBoardID` is: `"gid://gitlab/Boards::EpicBoard/1"`.
 */
@Name("BoardsEpicBoardID")
public class BoardsEpicBoardID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public BoardsEpicBoardID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static BoardsEpicBoardID valueOf(String value) {
        return new BoardsEpicBoardID(value);
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
        BoardsEpicBoardID other = (BoardsEpicBoardID) obj;
        return Objects.equals(value, other.value);
    }
}
