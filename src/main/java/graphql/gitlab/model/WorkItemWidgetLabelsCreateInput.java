package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("WorkItemWidgetLabelsCreateInput")
public class WorkItemWidgetLabelsCreateInput {

    /**
     * IDs of labels to be added to the work item.
     */
    private List<LabelID> labelIds;

    public List<LabelID> getLabelIds() {
        return labelIds;
    }

    public WorkItemWidgetLabelsCreateInput setLabelIds(List<LabelID> labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(labelIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetLabelsCreateInput other = (WorkItemWidgetLabelsCreateInput) obj;
        return Objects.equals(labelIds, other.labelIds);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetLabelsCreateInput [labelIds=" + labelIds + "]";
    }

}
