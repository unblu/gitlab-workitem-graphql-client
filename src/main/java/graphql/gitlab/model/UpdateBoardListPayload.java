package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Autogenerated return type of UpdateBoardList.
 */
@Name("UpdateBoardListPayload")
public class UpdateBoardListPayload {

    /**
     * Errors encountered during execution of the mutation.
     */
    private List<String> errors;

    /**
     * Mutated list.
     */
    private BoardList list;

    public List<String> getErrors() {
        return errors;
    }

    public UpdateBoardListPayload setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public BoardList getList() {
        return list;
    }

    public UpdateBoardListPayload setList(BoardList list) {
        this.list = list;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(errors, list);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UpdateBoardListPayload other = (UpdateBoardListPayload) obj;
        return Objects.equals(errors, other.errors) && Objects.equals(list, other.list);
    }

    @Override
    public String toString() {
        return "UpdateBoardListPayload [errors=" + errors + ", list=" + list + "]";
    }

}