package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a notes widget
 */
@Name("WorkItemWidgetNotes")
public class WorkItemWidgetNotes implements WorkItemWidget {

    /**
     * Notes on this work item.
     */
    private DiscussionConnection discussions;

    public DiscussionConnection getDiscussions() {
        return discussions;
    }

    public WorkItemWidgetNotes setDiscussions(DiscussionConnection discussions) {
        this.discussions = discussions;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetNotes";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetNotes".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(discussions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetNotes other = (WorkItemWidgetNotes) obj;
        return Objects.equals(discussions, other.discussions);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetNotes [discussions=" + discussions + "]";
    }

}
