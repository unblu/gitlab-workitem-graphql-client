package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for BoardList.
 */
@Name("BoardListConnection")
public class BoardListConnection {

    /**
     * A list of nodes.
     */
    private List<BoardListRef> nodes;

    public List<BoardListRef> getNodes() {
        return nodes;
    }

    public BoardListConnection setNodes(List<BoardListRef> nodes) {
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
        BoardListConnection other = (BoardListConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "BoardListConnection [nodes=" + nodes + "]";
    }

}
