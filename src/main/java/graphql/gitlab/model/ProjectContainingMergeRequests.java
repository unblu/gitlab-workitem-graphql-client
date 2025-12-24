package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("ProjectContainingMergeRequests")
public class ProjectContainingMergeRequests implements Todoable {

    /**
     * ID of the project.
     */
    private String id;

    /**
     * Merge requests of the project.
     */
    private MergeRequestConnection mergeRequests;

    /**
     * Name of the project without the namespace.
     */
    private String name;

    /**
     * Name of the project including the namespace.
     */
    private String nameWithNamespace;

    /**
     * Web URL of the project.
     */
    private String webUrl;

    public String getId() {
        return id;
    }

    public ProjectContainingMergeRequests setId(String id) {
        this.id = id;
        return this;
    }

    public MergeRequestConnection getMergeRequests() {
        return mergeRequests;
    }

    public ProjectContainingMergeRequests setMergeRequests(MergeRequestConnection mergeRequests) {
        this.mergeRequests = mergeRequests;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectContainingMergeRequests setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public ProjectContainingMergeRequests setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public ProjectContainingMergeRequests setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mergeRequests, name, nameWithNamespace, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjectContainingMergeRequests other = (ProjectContainingMergeRequests) obj;
        return Objects.equals(id, other.id) && Objects.equals(mergeRequests, other.mergeRequests) && Objects.equals(name, other.name) && Objects.equals(nameWithNamespace, other.nameWithNamespace) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "ProjectContainingMergeRequests [id=" + id + ", mergeRequests=" + mergeRequests + ", name=" + name + ", nameWithNamespace=" + nameWithNamespace + ", webUrl=" + webUrl + "]";
    }

}
