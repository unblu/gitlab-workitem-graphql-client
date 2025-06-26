package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection type for Discussion.
 */
@Name("DiscussionConnection")
public class DiscussionConnection {

    /**
     * A list of nodes.
     */
    private List<Discussion> nodes;

    public List<Discussion> getNodes() {
        return nodes;
    }

    public DiscussionConnection setNodes(List<Discussion> nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "DiscussionConnection";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"DiscussionConnection".equals(type)) {
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
        DiscussionConnection other = (DiscussionConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "DiscussionConnection [nodes=" + nodes + "]";
    }

}
