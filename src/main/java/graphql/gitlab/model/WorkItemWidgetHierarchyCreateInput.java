package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

@Name("WorkItemWidgetHierarchyCreateInput")
public class WorkItemWidgetHierarchyCreateInput {

    /**
     * Global ID of the parent work item.
     */
    private WorkItemID parentId;

    public WorkItemID getParentId() {
        return parentId;
    }

    public WorkItemWidgetHierarchyCreateInput setParentId(WorkItemID parentId) {
        this.parentId = parentId;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetHierarchyCreateInput";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetHierarchyCreateInput".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetHierarchyCreateInput other = (WorkItemWidgetHierarchyCreateInput) obj;
        return Objects.equals(parentId, other.parentId);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetHierarchyCreateInput [parentId=" + parentId + "]";
    }

}
