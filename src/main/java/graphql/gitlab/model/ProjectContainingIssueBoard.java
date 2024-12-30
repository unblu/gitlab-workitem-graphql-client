package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("Project")
public class ProjectContainingIssueBoard {

    /**
     * Boards of the project.
     */
    private BoardConnection boards;

    /**
     * ID of the project.
     */
    private String id;

    /**
     * Name of the project (without namespace).
     */
    private String name;

    /**
     * Full name of the project with its namespace.
     */
    private String nameWithNamespace;

    /**
     * Path of the project.
     */
    private String path;

    /**
     * Web URL of the project.
     */
    private String webUrl;


    public BoardConnection getBoards() {
        return boards;
    }

    public ProjectContainingIssueBoard setBoards(BoardConnection boards) {
        this.boards = boards;
        return this;
    }

    public String getId() {
        return id;
    }

    public ProjectContainingIssueBoard setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectContainingIssueBoard setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public ProjectContainingIssueBoard setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ProjectContainingIssueBoard setPath(String path) {
        this.path = path;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public ProjectContainingIssueBoard setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boards, id, name, nameWithNamespace, path, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjectContainingIssueBoard other = (ProjectContainingIssueBoard) obj;
        return Objects.equals(boards, other.boards) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(nameWithNamespace, other.nameWithNamespace) && Objects.equals(path, other.path) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "Project [boards=" + boards + ", id=" + id + ", name=" + name + ", nameWithNamespace=" + nameWithNamespace + ", path=" + path + ", webUrl=" + webUrl + "]";
    }

}
