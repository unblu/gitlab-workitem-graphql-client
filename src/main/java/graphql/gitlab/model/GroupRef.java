package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("GroupRef")
public class GroupRef implements Todoable {

    /**
     * Full name of the group.
     */
    private String fullName;

    /**
     * Full path of the namespace.
     */
    private String fullPath;

    /**
     * ID of the group.
     */
    private String id;

    /**
     * Name of the group.
     */
    private String name;

    /**
     * Web URL of the group.
     */
    private String webUrl;

    public String getFullName() {
        return fullName;
    }

    public GroupRef setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public GroupRef setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public GroupRef setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupRef setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GroupRef setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, fullPath, id, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupRef other = (GroupRef) obj;
        return Objects.equals(fullName, other.fullName) && Objects.equals(fullPath, other.fullPath) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "GroupRef [fullName=" + fullName + ", fullPath=" + fullPath + ", id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
