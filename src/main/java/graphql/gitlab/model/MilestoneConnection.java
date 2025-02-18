package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for Milestone.
 */
@Name("MilestoneConnection")
public class MilestoneConnection {

    /**
     * A list of nodes.
     */
    private List<Milestone> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public List<Milestone> getNodes() {
        return nodes;
    }

    public MilestoneConnection setNodes(List<Milestone> nodes) {
        this.nodes = nodes;
        return this;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public MilestoneConnection setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodes, pageInfo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MilestoneConnection other = (MilestoneConnection) obj;
        return Objects.equals(nodes, other.nodes) && Objects.equals(pageInfo, other.pageInfo);
    }

    @Override
    public String toString() {
        return "MilestoneConnection [nodes=" + nodes + ", pageInfo=" + pageInfo + "]";
    }

}
