package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The connection type for Release.
 */
@Name("ReleaseConnection")
public class ReleaseConnection {

    /**
     * A list of nodes.
     */
    private List<Release> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public List<Release> getNodes() {
        return nodes;
    }

    public ReleaseConnection setNodes(List<Release> nodes) {
        this.nodes = nodes;
        return this;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public ReleaseConnection setPageInfo(PageInfo pageInfo) {
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
        ReleaseConnection other = (ReleaseConnection) obj;
        return Objects.equals(nodes, other.nodes) && Objects.equals(pageInfo, other.pageInfo);
    }

    @Override
    public String toString() {
        return "ReleaseConnection [nodes=" + nodes + ", pageInfo=" + pageInfo + "]";
    }

}
