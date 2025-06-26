package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a description widget
 */
@Name("WorkItemWidgetDescription")
public class WorkItemWidgetDescription implements WorkItemWidget {

    /**
     * Description of the work item.
     */
    private String description;

    public String getDescription() {
        return description;
    }

    public WorkItemWidgetDescription setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetDescription";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetDescription".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(description);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetDescription other = (WorkItemWidgetDescription) obj;
        return Objects.equals(description, other.description);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetDescription [description=" + description + "]";
    }

}
