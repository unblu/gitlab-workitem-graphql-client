package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a release
 */
@Name("ReleaseRef")
public class ReleaseRef {

    /**
     * Global ID of the release.
     */
    private ReleaseID id;

    /**
     * Name of the release.
     */
    private String name;

    /**
     * Name of the tag associated with the release.
     */
    private String tagName;

    public ReleaseID getId() {
        return id;
    }

    public ReleaseRef setId(ReleaseID id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ReleaseRef setName(String name) {
        this.name = name;
        return this;
    }

    public String getTagName() {
        return tagName;
    }

    public ReleaseRef setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, tagName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReleaseRef other = (ReleaseRef) obj;
        return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(tagName, other.tagName);
    }

    @Override
    public String toString() {
        return "ReleaseRef [id=" + id + ", name=" + name + ", tagName=" + tagName + "]";
    }

}
