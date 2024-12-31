package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents an epic board list
 */
@Name("EpicListRef")
public class EpicListRef {

    /**
     * Global ID of the board list.
     */
    private BoardsEpicListID id;

    public BoardsEpicListID getId() {
        return id;
    }

    public EpicListRef setId(BoardsEpicListID id) {
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
        EpicListRef other = (EpicListRef) obj;
        return Objects.equals(id, other.id);
    }

    @Override
    public String toString() {
        return "EpicListRef [id=" + id + "]";
    }

}
