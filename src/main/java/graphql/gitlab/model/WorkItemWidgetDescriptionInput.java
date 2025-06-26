package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

@Name("WorkItemWidgetDescriptionInput")
public class WorkItemWidgetDescriptionInput {

    /**
     * Description of the work item.
     */
    private String description;

    public String getDescription() {
        return description;
    }

    public WorkItemWidgetDescriptionInput setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetDescriptionInput";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetDescriptionInput".equals(type)) {
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
        WorkItemWidgetDescriptionInput other = (WorkItemWidgetDescriptionInput) obj;
        return Objects.equals(description, other.description);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetDescriptionInput [description=" + description + "]";
    }

}
