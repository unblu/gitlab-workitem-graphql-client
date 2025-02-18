package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * A `BoardsEpicBoardID` is a global ID. It is encoded as a string.
 *
 * An example `BoardsEpicBoardID` is: `"gid://gitlab/Boards::EpicBoard/1"`.
 */
@Name("BoardsEpicBoardID")
public class BoardsEpicBoardID {

    private String value;

    public BoardsEpicBoardID(String value) {
        this.value = value;
    }

    public static BoardsEpicBoardID valueOf(String value) {
        return new BoardsEpicBoardID(value);
    }

    @Override
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
