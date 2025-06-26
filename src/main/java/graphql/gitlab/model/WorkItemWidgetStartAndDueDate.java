package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a start and due date widget
 */
@Name("WorkItemWidgetStartAndDueDate")
public class WorkItemWidgetStartAndDueDate implements WorkItemWidget {

    /**
     * Due date of the work item.
     */
    private Date dueDate;

    /**
     * Start date of the work item.
     */
    private Date startDate;

    public Date getDueDate() {
        return dueDate;
    }

    public WorkItemWidgetStartAndDueDate setDueDate(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Date getStartDate() {
        return startDate;
    }

    public WorkItemWidgetStartAndDueDate setStartDate(Date startDate) {
        this.startDate = startDate;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetStartAndDueDate";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetStartAndDueDate".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(dueDate, startDate);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetStartAndDueDate other = (WorkItemWidgetStartAndDueDate) obj;
        return Objects.equals(dueDate, other.dueDate) && Objects.equals(startDate, other.startDate);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetStartAndDueDate [dueDate=" + dueDate + ", startDate=" + startDate + "]";
    }

}
