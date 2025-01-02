package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a list for an issue board
 */
@Name("BoardListRef")
public class BoardListRef {

    /**
     * ID (global ID) of the list.
     */
    private ListID id;

    public ListID getId() {
        return id;
    }

    public BoardListRef setId(ListID id) {
        this.id = id;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BoardListRef other = (BoardListRef) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "BoardListRef [id=" + id + "]";
    }

}
