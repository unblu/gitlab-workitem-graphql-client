package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the labels widget
 */
@Name("WorkItemWidgetLabels")
public class WorkItemWidgetLabels implements WorkItemWidget {

    /**
     * Labels assigned to the work item.
     */
    private LabelConnection labels;

    public LabelConnection getLabels() {
        return labels;
    }

    public WorkItemWidgetLabels setLabels(LabelConnection labels) {
        this.labels = labels;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetLabels";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetLabels".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetLabels other = (WorkItemWidgetLabels) obj;
        return Objects.equals(labels, other.labels);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetLabels [labels=" + labels + "]";
    }

}
