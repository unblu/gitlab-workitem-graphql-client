package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a time tracking widget
 */
@Name("WorkItemWidgetTimeTracking")
public class WorkItemWidgetTimeTracking implements WorkItemWidget {

    /**
     * Widget type.
     */
    private WorkItemWidgetType type;

    public WorkItemWidgetType getType() {
        return type;
    }

    public WorkItemWidgetTimeTracking setType(WorkItemWidgetType type) {
        this.type = type;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetTimeTracking other = (WorkItemWidgetTimeTracking) obj;
        return Objects.equals(type, other.type);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetTimeTracking [type=" + type + "]";
    }

}
