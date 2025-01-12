package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("GroupContainingSingleEpicBoard")
public class GroupContainingSingleEpicBoard {

    /**
     * Find a single epic board. Deprecated in GitLab 17.5: Replaced by WorkItem type.
     */
    private EpicBoard epicBoard;

    /**
     * Full name of the namespace.
     */
    private String fullName;

    /**
     * Full path of the namespace.
     */
    private String fullPath;

    /**
     * ID of the namespace.
     */
    private String id;

    /**
     * Name of the namespace.
     */
    private String name;

    /**
     * Web URL of the group.
     */
    private String webUrl;

    public EpicBoard getEpicBoard() {
        return epicBoard;
    }

    public GroupContainingSingleEpicBoard setEpicBoard(EpicBoard epicBoard) {
        this.epicBoard = epicBoard;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public GroupContainingSingleEpicBoard setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getFullPath() {
        return fullPath;
    }

    public GroupContainingSingleEpicBoard setFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public GroupContainingSingleEpicBoard setId(String id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public GroupContainingSingleEpicBoard setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public GroupContainingSingleEpicBoard setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(epicBoard, fullName, fullPath, id, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GroupContainingSingleEpicBoard other = (GroupContainingSingleEpicBoard) obj;
        return Objects.equals(epicBoard, other.epicBoard) && Objects.equals(fullName, other.fullName) && Objects.equals(fullPath, other.fullPath) && Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "GroupContainingSingleEpicBoard [epicBoard=" + epicBoard + ", fullName=" + fullName + ", fullPath=" + fullPath + ", id=" + id + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
