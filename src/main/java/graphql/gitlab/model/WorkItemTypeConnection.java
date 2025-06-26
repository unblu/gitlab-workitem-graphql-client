package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection type for WorkItemType.
 */
@Name("WorkItemTypeConnection")
public class WorkItemTypeConnection {

    /**
     * A list of nodes.
     */
    private List<WorkItemType> nodes;

    public List<WorkItemType> getNodes() {
        return nodes;
    }

    public WorkItemTypeConnection setNodes(List<WorkItemType> nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemTypeConnection";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemTypeConnection".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
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
        WorkItemTypeConnection other = (WorkItemTypeConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "WorkItemTypeConnection [nodes=" + nodes + "]";
    }

}
