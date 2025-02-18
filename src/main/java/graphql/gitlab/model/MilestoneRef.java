package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a milestone
 */
@Name("MilestoneRef")
public class MilestoneRef {

    /**
     * ID of the milestone.
     */
    private String id;

    /**
     * Title of the milestone.
     */
    private String title;

    /**
     * Web path of the milestone.
     */
    private String webPath;

    public String getId() {
        return id;
    }

    public MilestoneRef setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MilestoneRef setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getWebPath() {
        return webPath;
    }

    public MilestoneRef setWebPath(String webPath) {
        this.webPath = webPath;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, webPath);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MilestoneRef other = (MilestoneRef) obj;
        return Objects.equals(id, other.id) && Objects.equals(title, other.title) && Objects.equals(webPath, other.webPath);
    }

    @Override
    public String toString() {
        return "MilestoneRef [id=" + id + ", title=" + title + ", webPath=" + webPath + "]";
    }

}
