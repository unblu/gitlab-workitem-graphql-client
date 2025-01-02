package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for EpicBoard.
 */
@Name("EpicBoardConnection")
public class EpicBoardConnection {

    /**
     * A list of nodes.
     */
    private List<EpicBoard> nodes;

    public List<EpicBoard> getNodes() {
        return nodes;
    }

    public EpicBoardConnection setNodes(List<EpicBoard> nodes) {
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
        EpicBoardConnection other = (EpicBoardConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "EpicBoardConnection [nodes=" + nodes + "]";
    }

}
