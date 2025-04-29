package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("Namespace")
public class Namespace implements Todoable {

    /**
     * Full path of the namespace.
     */
    private String fullPath;

    /**
     * ID of the namespace.
     */
    private String id;

    /**
     * Visibility of the namespace.
     */
    private String visibility;

    public String getFullPath() {
        return fullPath;
    }

    public Namespace setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public Namespace setId(String id) {
        this.id = id;
        return this;
    }

    public String getVisibility() {
        return visibility;
    }

    public Namespace setVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullPath, id, visibility);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Namespace other = (Namespace) obj;
        return Objects.equals(fullPath, other.fullPath) && Objects.equals(id, other.id) && Objects.equals(visibility, other.visibility);
    }

    @Override
    public String toString() {
        return "Namespace [fullPath=" + fullPath + ", id=" + id + ", visibility=" + visibility + "]";
    }

}
