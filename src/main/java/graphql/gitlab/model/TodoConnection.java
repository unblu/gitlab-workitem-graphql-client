package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection type for Todo.
 */
@Name("TodoConnection")
public class TodoConnection {

    /**
     * A list of nodes.
     */
    private List<Todo> nodes;

    /**
     * Information to aid in pagination.
     */
    private PageInfo pageInfo;

    public List<Todo> getNodes() {
        return nodes;
    }

    public TodoConnection setNodes(List<Todo> nodes) {
        this.nodes = nodes;
        return this;
    }

    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public TodoConnection setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "TodoConnection";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"TodoConnection".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
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
        TodoConnection other = (TodoConnection) obj;
        return Objects.equals(nodes, other.nodes) && Objects.equals(pageInfo, other.pageInfo);
    }

    @Override
    public String toString() {
        return "TodoConnection [nodes=" + nodes + ", pageInfo=" + pageInfo + "]";
    }

}
