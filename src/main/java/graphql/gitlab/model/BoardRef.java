package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a project or group issue board
 */
@Name("BoardRef")
public class BoardRef {

    /**
     * ID (global ID) of the board.
     */
    private BoardID id;

    /**
     * Name of the board.
     */
    private String name;

    /**
     * Web URL of the board.
     */
    private String webUrl;

    public BoardID getId() {
        return id;
    }

    public BoardRef setId(BoardID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public BoardRef setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public BoardRef setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BoardRef other = (BoardRef) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "BoardRef [id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
