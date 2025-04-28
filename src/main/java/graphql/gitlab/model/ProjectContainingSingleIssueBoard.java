package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("ProjectContainingSingleIssueBoard")
public class ProjectContainingSingleIssueBoard implements Todoable {

    /**
     * A single board of the project.
     */
    private Board board;

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

    public Board getBoard() {
        return board;
    }

    public ProjectContainingSingleIssueBoard setBoard(Board board) {
        this.board = board;
        return this;
    }

    public String getId() {
        return id;
    }

    public ProjectContainingSingleIssueBoard setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectContainingSingleIssueBoard setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public ProjectContainingSingleIssueBoard setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public Namespace getNamespace() {
        return namespace;
    }

    public ProjectContainingSingleIssueBoard setNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ProjectContainingSingleIssueBoard setPath(String path) {
        this.path = path;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public ProjectContainingSingleIssueBoard setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(board, id, name, nameWithNamespace, namespace, path, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjectContainingSingleIssueBoard other = (ProjectContainingSingleIssueBoard) obj;
        return Objects.equals(board, other.board) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(nameWithNamespace, other.nameWithNamespace) && Objects.equals(namespace, other.namespace) && Objects.equals(path, other.path) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "ProjectContainingSingleIssueBoard [board=" + board + ", id=" + id + ", name=" + name + ", nameWithNamespace=" + nameWithNamespace + ", namespace=" + namespace + ", path=" + path + ", webUrl=" + webUrl + "]";
    }

}
