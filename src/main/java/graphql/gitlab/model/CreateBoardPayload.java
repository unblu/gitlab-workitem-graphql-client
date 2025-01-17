package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Autogenerated return type of CreateBoard.
 */
@Name("CreateBoardPayload")
public class CreateBoardPayload {

    /**
     * Board after mutation.
     */
    private Board board;

    /**
     * Errors encountered during execution of the mutation.
     */
    private List<String> errors;

    public Board getBoard() {
        return board;
    }

    public CreateBoardPayload setBoard(Board board) {
        this.board = board;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public CreateBoardPayload setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(board, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CreateBoardPayload other = (CreateBoardPayload) obj;
        return Objects.equals(board, other.board) && Objects.equals(errors, other.errors);
    }

    @Override
    public String toString() {
        return "CreateBoardPayload [board=" + board + ", errors=" + errors + "]";
    }

}
