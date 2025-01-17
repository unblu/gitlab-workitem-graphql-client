package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents the rolledup dates widget
 */
@Name("WorkItemWidgetRolledupDates")
public class WorkItemWidgetRolledupDates implements WorkItemWidget {

    /**
     * Widget type.
     */
    private WorkItemWidgetType type;

    public WorkItemWidgetType getType() {
        return type;
    }

    public WorkItemWidgetRolledupDates setType(WorkItemWidgetType type) {
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
        WorkItemWidgetRolledupDates other = (WorkItemWidgetRolledupDates) obj;
        return Objects.equals(type, other.type);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetRolledupDates [type=" + type + "]";
    }

}
