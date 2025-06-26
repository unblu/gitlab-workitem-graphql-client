package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a test reports widget
 */
@Name("WorkItemWidgetTestReports")
public class WorkItemWidgetTestReports implements WorkItemWidget {

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetTestReports";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetTestReports".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }


}
