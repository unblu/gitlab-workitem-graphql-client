package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an epic board
 */
@Name("EpicBoardRef")
public class EpicBoardRef {

    /**
     * Global ID of the epic board.
     */
    private BoardsEpicBoardID id;

    /**
     * Name of the epic board.
     */
    private String name;

    /**
     * Web URL of the epic board.
     */
    private String webUrl;

    public BoardsEpicBoardID getId() {
        return id;
    }

    public EpicBoardRef setId(BoardsEpicBoardID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public EpicBoardRef setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public EpicBoardRef setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "EpicBoardRef";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"EpicBoardRef".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
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
        EpicBoardRef other = (EpicBoardRef) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "EpicBoardRef [id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
