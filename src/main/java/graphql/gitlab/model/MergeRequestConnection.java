package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for MergeRequest.
 */
@Name("MergeRequestConnection")
public class MergeRequestConnection {

    /**
     * A list of nodes.
     */
    private List<MergeRequest> nodes;

    public List<MergeRequest> getNodes() {
        return nodes;
    }

    public MergeRequestConnection setNodes(List<MergeRequest> nodes) {
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
        MergeRequestConnection other = (MergeRequestConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "MergeRequestConnection [nodes=" + nodes + "]";
    }

}
