package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the linked items widget
 */
@Name("WorkItemWidgetLinkedItems")
public class WorkItemWidgetLinkedItems implements WorkItemWidget {

    /**
     * Linked items for the work item. Introduced in GitLab 16.3: **Status**: Experiment.
     */
    private LinkedWorkItemTypeConnection linkedItems;

    public LinkedWorkItemTypeConnection getLinkedItems() {
        return linkedItems;
    }

    public WorkItemWidgetLinkedItems setLinkedItems(LinkedWorkItemTypeConnection linkedItems) {
        this.linkedItems = linkedItems;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetLinkedItems";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetLinkedItems".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(linkedItems);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetLinkedItems other = (WorkItemWidgetLinkedItems) obj;
        return Objects.equals(linkedItems, other.linkedItems);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetLinkedItems [linkedItems=" + linkedItems + "]";
    }

}
