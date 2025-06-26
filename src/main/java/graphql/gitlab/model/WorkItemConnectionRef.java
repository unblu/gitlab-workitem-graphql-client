package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Duplicate of `WorkItemConnection` to avoid SRGQLDC035008: Field recursion found
 */
@Name("WorkItemConnectionRef")
public class WorkItemConnectionRef {

    /**
     * Total count of collection.
     */
    private Integer count;

    /**
     * A list of nodes.
     */
    private List<WorkItemRef> nodes;

    public Integer getCount() {
        return count;
    }

    public WorkItemConnectionRef setCount(Integer count) {
        this.count = count;
        return this;
    }

    public List<WorkItemRef> getNodes() {
        return nodes;
    }

    public WorkItemConnectionRef setNodes(List<WorkItemRef> nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemConnectionRef";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemConnectionRef".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, nodes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemConnectionRef other = (WorkItemConnectionRef) obj;
        return Objects.equals(count, other.count) && Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "WorkItemConnectionRef [count=" + count + ", nodes=" + nodes + "]";
    }

}
