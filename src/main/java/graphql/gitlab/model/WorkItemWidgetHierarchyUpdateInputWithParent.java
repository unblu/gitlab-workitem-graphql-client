package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import jakarta.json.bind.annotation.JsonbProperty;

@Name("WorkItemWidgetHierarchyUpdateInput")
public class WorkItemWidgetHierarchyUpdateInputWithParent implements WorkItemWidgetHierarchyUpdateInput {

    /**
     * Global ID of the parent work item. Use `null` to remove the association.
     */
    @JsonbProperty(value = "parentId", nillable = true)
    private WorkItemID parentId;

    public WorkItemID getParentId() {
        return parentId;
    }

    public WorkItemWidgetHierarchyUpdateInputWithParent setParentId(WorkItemID parentId) {
        this.parentId = parentId;
        return this;
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
        WorkItemWidgetHierarchyUpdateInputWithParent other = (WorkItemWidgetHierarchyUpdateInputWithParent) obj;
        return Objects.equals(parentId, other.parentId);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetHierarchyUpdateInputWithParent [parentId=" + parentId + "]";
    }

}
