package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Autogenerated return type of DestroyBoardList.
 */
@Name("DestroyBoardListPayload")
public class DestroyBoardListPayload {

    /**
     * Errors encountered during execution of the mutation.
     */
    private List<String> errors;

    /**
     * List after mutation.
     */
    private BoardList list;

    public List<String> getErrors() {
        return errors;
    }

    public DestroyBoardListPayload setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public BoardList getList() {
        return list;
    }

    public DestroyBoardListPayload setList(BoardList list) {
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
        DestroyBoardListPayload other = (DestroyBoardListPayload) obj;
        return Objects.equals(errors, other.errors) && Objects.equals(list, other.list);
    }

    @Override
    public String toString() {
        return "DestroyBoardListPayload [errors=" + errors + ", list=" + list + "]";
    }

}