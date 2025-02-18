package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("ProjectContainingReleases")
public class ProjectContainingReleases {

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
     * Releases of the project.
     */
    private ReleaseConnection releases;

    /**
     * Web URL of the project.
     */
    private String webUrl;

    public String getId() {
        return id;
    }

    public ProjectContainingReleases setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectContainingReleases setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public ProjectContainingReleases setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ProjectContainingReleases setPath(String path) {
        this.path = path;
        return this;
    }

    public ReleaseConnection getReleases() {
        return releases;
    }

    public ProjectContainingReleases setReleases(ReleaseConnection releases) {
        this.releases = releases;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public ProjectContainingReleases setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, nameWithNamespace, path, releases, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjectContainingReleases other = (ProjectContainingReleases) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(nameWithNamespace, other.nameWithNamespace) && Objects.equals(path, other.path) && Objects.equals(releases, other.releases) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "ProjectContainingReleases [id=" + id + ", name=" + name + ", nameWithNamespace=" + nameWithNamespace + ", path=" + path + ", releases=" + releases + ", webUrl=" + webUrl + "]";
    }

}
