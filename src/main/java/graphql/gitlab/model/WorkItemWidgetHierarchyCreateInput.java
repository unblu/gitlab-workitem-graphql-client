package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

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
