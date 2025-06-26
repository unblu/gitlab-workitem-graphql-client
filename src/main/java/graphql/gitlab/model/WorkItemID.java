package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * A `WorkItemID` is a global ID. It is encoded as a string.
 *
 * An example `WorkItemID` is: `"gid://gitlab/WorkItem/1"`.
 *
 * While we transition from Issues into Work Items this type will temporarily support<br>
 * `IssueID` like: `"gid://gitlab/Issue/1"`. This behavior will be removed without notice in the future.
 */
@Name("WorkItemID")
public class WorkItemID {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public WorkItemID(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static WorkItemID valueOf(String value) {
        return new WorkItemID(value);
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
        WorkItemID other = (WorkItemID) obj;
        return Objects.equals(value, other.value);
    }
}
