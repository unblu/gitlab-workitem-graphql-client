package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The connection type for BoardList.
 */
@Name("BoardListConnection")
public class BoardListConnection {

    /**
     * A list of nodes.
     */
    private List<BoardList> nodes;

    public List<BoardList> getNodes() {
        return nodes;
    }

    public BoardListConnection setNodes(List<BoardList> nodes) {
        this.nodes = nodes;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "BoardListConnection";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"BoardListConnection".equals(type)) {
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
        BoardListConnection other = (BoardListConnection) obj;
        return Objects.equals(nodes, other.nodes);
    }

    @Override
    public String toString() {
        return "BoardListConnection [nodes=" + nodes + "]";
    }

}
