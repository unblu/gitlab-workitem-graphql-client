package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection type for AwardEmoji.
 */
@Name("AwardEmojiConnection")
public class AwardEmojiConnection {

    /**
     * A list of nodes.
     */
    private List<AwardEmoji> nodes;

    public List<AwardEmoji> getNodes() {
        return nodes;
    }

    public AwardEmojiConnection setNodes(List<AwardEmoji> nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "AwardEmojiConnection";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"AwardEmojiConnection".equals(type)) {
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
        AwardEmojiConnection other = (AwardEmojiConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "AwardEmojiConnection [nodes=" + nodes + "]";
    }

}
