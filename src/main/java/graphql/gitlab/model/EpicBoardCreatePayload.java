package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Autogenerated return type of EpicBoardCreate.
 */
@Name("EpicBoardCreatePayload")
public class EpicBoardCreatePayload {

    /**
     * Created epic board.
     */
    private EpicBoard epicBoard;

    /**
     * Errors encountered during execution of the mutation.
     */
    private List<String> errors;

    public EpicBoard getEpicBoard() {
        return epicBoard;
    }

    public EpicBoardCreatePayload setEpicBoard(EpicBoard epicBoard) {
        this.epicBoard = epicBoard;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public EpicBoardCreatePayload setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(epicBoard, errors);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EpicBoardCreatePayload other = (EpicBoardCreatePayload) obj;
        return Objects.equals(epicBoard, other.epicBoard) && Objects.equals(errors, other.errors);
    }

    @Override
    public String toString() {
        return "EpicBoardCreatePayload [epicBoard=" + epicBoard + ", errors=" + errors + "]";
    }

}