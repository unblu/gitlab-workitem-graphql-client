package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a milestone widget
 */
@Name("WorkItemWidgetMilestone")
public class WorkItemWidgetMilestone implements WorkItemWidget {

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetMilestone";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetMilestone".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }


}
