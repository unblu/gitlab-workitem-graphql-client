package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for Board.
 */
@Name("BoardConnection")
public class BoardConnection {

    /**
     * A list of nodes.
     */
    private List<BoardRef> nodes;

    public List<BoardRef> getNodes() {
        return nodes;
    }

    public BoardConnection setNodes(List<BoardRef> nodes) {
        this.nodes = nodes;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BoardConnection other = (BoardConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "BoardConnection [nodes=" + nodes + "]";
    }

}
