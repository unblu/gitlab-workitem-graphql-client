package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for Release.
 */
@Name("ReleaseConnectionRef")
public class ReleaseConnectionRef {

    /**
     * A list of nodes.
     */
    private List<ReleaseRef> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public List<ReleaseRef> getNodes() {
        return nodes;
    }

    public ReleaseConnectionRef setNodes(List<ReleaseRef> nodes) {
        this.nodes = nodes;
        return this;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public ReleaseConnectionRef setPageInfo(PageInfo pageInfo) {
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
        ReleaseConnectionRef other = (ReleaseConnectionRef) obj;
        return Objects.equals(nodes, other.nodes) && Objects.equals(pageInfo, other.pageInfo);
    }

    @Override
    public String toString() {
        return "ReleaseConnectionRef [nodes=" + nodes + ", pageInfo=" + pageInfo + "]";
    }

}
