package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection type for EpicBoard.
 */
@Name("EpicBoardConnection")
public class EpicBoardConnection {

    /**
     * A list of nodes.
     */
    private List<EpicBoardRef> nodes;

    public List<EpicBoardRef> getNodes() {
        return nodes;
    }

    public EpicBoardConnection setNodes(List<EpicBoardRef> nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "EpicBoardConnection";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"EpicBoardConnection".equals(type)) {
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
        EpicBoardConnection other = (EpicBoardConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "EpicBoardConnection [nodes=" + nodes + "]";
    }

}
