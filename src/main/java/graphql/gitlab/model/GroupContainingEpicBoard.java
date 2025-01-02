package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("GroupContainingEpicBoard")
public class GroupContainingEpicBoard {

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

    public GroupContainingEpicBoard setEpicBoards(EpicBoardConnection epicBoards) {
        this.epicBoards = epicBoards;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GroupContainingEpicBoard setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public GroupContainingEpicBoard setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public GroupContainingEpicBoard setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupContainingEpicBoard setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GroupContainingEpicBoard setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
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
        GroupContainingEpicBoard other = (GroupContainingEpicBoard) obj;
        return Objects.equals(epicBoards, other.epicBoards) && Objects.equals(fullName, other.fullName) && Objects.equals(fullPath, other.fullPath) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "GroupContainingEpicBoard [epicBoards=" + epicBoards + ", fullName=" + fullName + ", fullPath=" + fullPath + ", id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
