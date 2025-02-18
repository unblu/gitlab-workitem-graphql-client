package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("ProjectContainingMilestones")
public class ProjectContainingMilestones {

    /**
     * ID of the project.
     */
    private String id;

    /**
     * Milestones of the project.
     */
    private MilestoneConnection milestones;

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

    public String getId() {
        return id;
    }

    public ProjectContainingMilestones setId(String id) {
        this.id = id;
        return this;
    }

    public MilestoneConnection getMilestones() {
        return milestones;
    }

    public ProjectContainingMilestones setMilestones(MilestoneConnection milestones) {
        this.milestones = milestones;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProjectContainingMilestones setName(String name) {
        this.name = name;
        return this;
    }

    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public ProjectContainingMilestones setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    public String getPath() {
        return path;
    }

    public ProjectContainingMilestones setPath(String path) {
        this.path = path;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public ProjectContainingMilestones setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, milestones, name, nameWithNamespace, path, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ProjectContainingMilestones other = (ProjectContainingMilestones) obj;
        return Objects.equals(id, other.id) && Objects.equals(milestones, other.milestones) && Objects.equals(name, other.name) && Objects.equals(nameWithNamespace, other.nameWithNamespace) && Objects.equals(path, other.path) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "ProjectContainingMilestones [id=" + id + ", milestones=" + milestones + ", name=" + name + ", nameWithNamespace=" + nameWithNamespace + ", path=" + path + ", webUrl=" + webUrl + "]";
    }

}
