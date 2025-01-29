package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents an assignees widget
 */
@Name("WorkItemWidgetAssignees")
public class WorkItemWidgetAssignees implements WorkItemWidget {

    /**
     * Assignees of the work item.
     */
    private UserCoreConnection assignees;

    public UserCoreConnection getAssignees() {
        return assignees;
    }

    public WorkItemWidgetAssignees setAssignees(UserCoreConnection assignees) {
        this.assignees = assignees;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignees);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetAssignees other = (WorkItemWidgetAssignees) obj;
        return Objects.equals(assignees, other.assignees);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetAssignees [assignees=" + assignees + "]";
    }

}
