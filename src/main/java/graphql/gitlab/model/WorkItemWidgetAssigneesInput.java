package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("WorkItemWidgetAssigneesInput")
public class WorkItemWidgetAssigneesInput {

    /**
     * Global IDs of assignees.
     */
    private List<UserID> assigneeIds;

    public List<UserID> getAssigneeIds() {
        return assigneeIds;
    }

    public WorkItemWidgetAssigneesInput setAssigneeIds(List<UserID> assigneeIds) {
        this.assigneeIds = assigneeIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assigneeIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetAssigneesInput other = (WorkItemWidgetAssigneesInput) obj;
        return Objects.equals(assigneeIds, other.assigneeIds);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetAssigneesInput [assigneeIds=" + assigneeIds + "]";
    }

}
