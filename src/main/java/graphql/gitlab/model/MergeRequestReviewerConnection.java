package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for MergeRequestReviewer.
 */
@Name("MergeRequestReviewerConnection")
public class MergeRequestReviewerConnection {

    /**
     * A list of nodes.
     */
    private List<MergeRequestReviewer> nodes;

    public List<MergeRequestReviewer> getNodes() {
        return nodes;
    }

    public MergeRequestReviewerConnection setNodes(List<MergeRequestReviewer> nodes) {
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
        MergeRequestReviewerConnection other = (MergeRequestReviewerConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "MergeRequestReviewerConnection [nodes=" + nodes + "]";
    }

}
