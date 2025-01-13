package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("ProjectContainingIssueBoards")
public class ProjectContainingIssueBoards {

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
     * Namespace of the project.
     */
    private Namespace namespace;

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

    public ProjectContainingIssueBoards setBoards(BoardConnection boards) {
        this.boards = boards;
        return this;
    }

    public String getId() {
        return id;
    }

    public ProjectContainingIssueBoards setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectContainingIssueBoards setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public ProjectContainingIssueBoards setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public Namespace getNamespace() {
        return namespace;
    }

    public ProjectContainingIssueBoards setNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ProjectContainingIssueBoards setPath(String path) {
        this.path = path;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public ProjectContainingIssueBoards setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(boards, id, name, nameWithNamespace, namespace, path, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjectContainingIssueBoards other = (ProjectContainingIssueBoards) obj;
        return Objects.equals(boards, other.boards) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(nameWithNamespace, other.nameWithNamespace) && Objects.equals(namespace, other.namespace) && Objects.equals(path, other.path) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "ProjectContainingIssueBoards [boards=" + boards + ", id=" + id + ", name=" + name + ", nameWithNamespace=" + nameWithNamespace + ", namespace=" + namespace + ", path=" + path + ", webUrl=" + webUrl + "]";
    }

}
