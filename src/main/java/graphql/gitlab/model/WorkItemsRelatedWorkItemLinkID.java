package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `WorkItemsRelatedWorkItemLinkID` is a global ID. It is encoded as a string.
 *
 * An example `WorkItemsRelatedWorkItemLinkID` is: `"gid://gitlab/WorkItems::RelatedWorkItemLink/1"`.
 */
@Name("WorkItemsRelatedWorkItemLinkID")
public class WorkItemsRelatedWorkItemLinkID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public WorkItemsRelatedWorkItemLinkID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static WorkItemsRelatedWorkItemLinkID valueOf(String value) {
        return new WorkItemsRelatedWorkItemLinkID(value);
    }

    @Override
    @JsonValue
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemsRelatedWorkItemLinkID other = (WorkItemsRelatedWorkItemLinkID) obj;
        return Objects.equals(value, other.value);
    }
}
