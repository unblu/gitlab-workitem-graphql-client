package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("WorkItemWidgetHierarchyUpdateInput")
public class WorkItemWidgetHierarchyUpdateInputWithChildren implements WorkItemWidgetHierarchyUpdateInput {

    /**
     * Global IDs of children work items.
     */
    private List<WorkItemID> childrenIds;

    public List<WorkItemID> getChildrenIds() {
        return childrenIds;
    }

    public WorkItemWidgetHierarchyUpdateInput setChildrenIds(List<WorkItemID> childrenIds) {
        this.childrenIds = childrenIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(childrenIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetHierarchyUpdateInputWithChildren other = (WorkItemWidgetHierarchyUpdateInputWithChildren) obj;
        return Objects.equals(childrenIds, other.childrenIds);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetHierarchyUpdateInputWithChildren [childrenIds=" + childrenIds + "]";
    }

}
