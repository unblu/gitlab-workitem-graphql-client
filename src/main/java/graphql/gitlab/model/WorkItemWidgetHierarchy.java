package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a hierarchy widget
 */
@Name("WorkItemWidgetHierarchy")
public class WorkItemWidgetHierarchy implements WorkItemWidget {

    /**
     * Ancestors (parents) of the work item.
     */
    private WorkItemConnectionRef ancestors;

    /**
     * Child work items.
     */
    private WorkItemConnectionRef children;

    /**
     * Parent work item.
     */
    private WorkItemRef parent;

    public WorkItemConnectionRef getAncestors() {
        return ancestors;
    }

    public WorkItemWidgetHierarchy setAncestors(WorkItemConnectionRef ancestors) {
        this.ancestors = ancestors;
        return this;
    }

    public WorkItemConnectionRef getChildren() {
        return children;
    }

    public WorkItemWidgetHierarchy setChildren(WorkItemConnectionRef children) {
        this.children = children;
        return this;
    }

    public WorkItemRef getParent() {
        return parent;
    }

    public WorkItemWidgetHierarchy setParent(WorkItemRef parent) {
        this.parent = parent;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ancestors, children, parent);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetHierarchy other = (WorkItemWidgetHierarchy) obj;
        return Objects.equals(ancestors, other.ancestors) && Objects.equals(children, other.children) && Objects.equals(parent, other.parent);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetHierarchy [ancestors=" + ancestors + ", children=" + children + ", parent=" + parent + "]";
    }

}
