package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents designs widget
 */
@Name("WorkItemWidgetDesigns")
public class WorkItemWidgetDesigns implements WorkItemWidget {

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetDesigns";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetDesigns".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }


}
