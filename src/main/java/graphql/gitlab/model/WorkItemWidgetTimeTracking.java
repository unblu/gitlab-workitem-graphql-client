package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a time tracking widget
 */
@Name("WorkItemWidgetTimeTracking")
public class WorkItemWidgetTimeTracking implements WorkItemWidget {

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetTimeTracking";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetTimeTracking".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }


}
