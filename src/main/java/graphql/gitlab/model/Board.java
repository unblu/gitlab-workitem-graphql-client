package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a project or group issue board
 */
@Name("Board")
public class Board {

    /**
     * ID (global ID) of the board.
     */
    private BoardID id;

    /**
     * Lists of the board.
     */
    private BoardListConnection lists;

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

    public Board setId(BoardID id) {
        this.id = id;
        return this;
    }

    public BoardListConnection getLists() {
        return lists;
    }

    public Board setLists(BoardListConnection lists) {
        this.lists = lists;
        return this;
    }

    public String getName() {
        return name;
    }

    public Board setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public Board setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, lists, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Board other = (Board) obj;
        return Objects.equals(id, other.id) && Objects.equals(lists, other.lists) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "Board [id=" + id + ", lists=" + lists + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
