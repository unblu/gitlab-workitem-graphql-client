package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

@Name("GroupContainingEpicBoards")
public class GroupContainingEpicBoards implements Todoable {

    /**
     * Find epic boards. Deprecated in GitLab 17.5: Replaced by WorkItem type.
     */
    private EpicBoardConnection epicBoards;

    /**
     * Full name of the namespace.
     */
    private String fullName;

    /**
     * Full path of the namespace.
     */
    private String fullPath;

    /**
     * ID of the namespace.
     */
    private String id;

    /**
     * Name of the namespace.
     */
    private String name;

    /**
     * Web URL of the group.
     */
    private String webUrl;

    public EpicBoardConnection getEpicBoards() {
        return epicBoards;
    }

    public GroupContainingEpicBoards setEpicBoards(EpicBoardConnection epicBoards) {
        this.epicBoards = epicBoards;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GroupContainingEpicBoards setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public GroupContainingEpicBoards setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public GroupContainingEpicBoards setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupContainingEpicBoards setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GroupContainingEpicBoards setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "GroupContainingEpicBoards";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"GroupContainingEpicBoards".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(epicBoards, fullName, fullPath, id, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupContainingEpicBoards other = (GroupContainingEpicBoards) obj;
        return Objects.equals(epicBoards, other.epicBoards) && Objects.equals(fullName, other.fullName) && Objects.equals(fullPath, other.fullPath) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "GroupContainingEpicBoards [epicBoards=" + epicBoards + ", fullName=" + fullName + ", fullPath=" + fullPath + ", id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
