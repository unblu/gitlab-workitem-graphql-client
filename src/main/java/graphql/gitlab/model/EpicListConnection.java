package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for EpicList.
 */
@Name("EpicListConnection")
public class EpicListConnection {

    /**
     * A list of nodes.
     */
    private List<EpicList> nodes;

    public List<EpicList> getNodes() {
        return nodes;
    }

    public EpicListConnection setNodes(List<EpicList> nodes) {
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
        EpicListConnection other = (EpicListConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "EpicListConnection [nodes=" + nodes + "]";
    }

}
