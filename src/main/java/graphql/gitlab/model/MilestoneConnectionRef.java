package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for Milestone.
 */
@Name("MilestoneConnectionRef")
public class MilestoneConnectionRef {

    /**
     * A list of nodes.
     */
    private List<MilestoneRef> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public List<MilestoneRef> getNodes() {
        return nodes;
    }

    public MilestoneConnectionRef setNodes(List<MilestoneRef> nodes) {
        this.nodes = nodes;
        return this;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public MilestoneConnectionRef setPageInfo(PageInfo pageInfo) {
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
        MilestoneConnectionRef other = (MilestoneConnectionRef) obj;
        return Objects.equals(nodes, other.nodes) && Objects.equals(pageInfo, other.pageInfo);
    }

    @Override
    public String toString() {
        return "MilestoneConnectionRef [nodes=" + nodes + ", pageInfo=" + pageInfo + "]";
    }

}
