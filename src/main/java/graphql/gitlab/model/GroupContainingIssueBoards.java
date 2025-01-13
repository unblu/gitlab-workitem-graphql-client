package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("GroupContainingIssueBoards")
public class GroupContainingIssueBoards {

    /**
     * Boards of the group.
     */
    private BoardConnection boards;

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

    public BoardConnection getBoards() {
        return boards;
    }

    public GroupContainingIssueBoards setBoards(BoardConnection boards) {
        this.boards = boards;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GroupContainingIssueBoards setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public GroupContainingIssueBoards setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public GroupContainingIssueBoards setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupContainingIssueBoards setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GroupContainingIssueBoards setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boards, fullName, fullPath, id, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupContainingIssueBoards other = (GroupContainingIssueBoards) obj;
        return Objects.equals(boards, other.boards) && Objects.equals(fullName, other.fullName) && Objects.equals(fullPath, other.fullPath) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "GroupContainingIssueBoards [boards=" + boards + ", fullName=" + fullName + ", fullPath=" + fullPath + ", id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
