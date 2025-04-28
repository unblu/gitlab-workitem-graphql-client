package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("GroupContainingSingleIssueBoard")
public class GroupContainingSingleIssueBoard implements Todoable {

    /**
     * A single board of the group.
     */
    private Board board;

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

    public Board getBoard() {
        return board;
    }

    public GroupContainingSingleIssueBoard setBoard(Board board) {
        this.board = board;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GroupContainingSingleIssueBoard setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public GroupContainingSingleIssueBoard setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public GroupContainingSingleIssueBoard setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupContainingSingleIssueBoard setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GroupContainingSingleIssueBoard setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(board, fullName, fullPath, id, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupContainingSingleIssueBoard other = (GroupContainingSingleIssueBoard) obj;
        return Objects.equals(board, other.board) && Objects.equals(fullName, other.fullName) && Objects.equals(fullPath, other.fullPath) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "GroupContainingSingleIssueBoard [board=" + board + ", fullName=" + fullName + ", fullPath=" + fullPath + ", id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
