package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a participants widget
 */
@Name("WorkItemWidgetParticipants")
public class WorkItemWidgetParticipants implements WorkItemWidget {

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetParticipants";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetParticipants".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }


}
