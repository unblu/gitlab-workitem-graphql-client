package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

@Name("WorkItemWidgetLabelsUpdateInput")
public class WorkItemWidgetLabelsUpdateInput {

    /**
     * Global IDs of labels to be added to the work item.
     */
    private List<LabelID> addLabelIds;

    /**
     * Global IDs of labels to be removed from the work item.
     */
    private List<LabelID> removeLabelIds;

    public List<LabelID> getAddLabelIds() {
        return addLabelIds;
    }

    public WorkItemWidgetLabelsUpdateInput setAddLabelIds(List<LabelID> addLabelIds) {
        this.addLabelIds = addLabelIds;
        return this;
    }

    public List<LabelID> getRemoveLabelIds() {
        return removeLabelIds;
    }

    public WorkItemWidgetLabelsUpdateInput setRemoveLabelIds(List<LabelID> removeLabelIds) {
        this.removeLabelIds = removeLabelIds;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "WorkItemWidgetLabelsUpdateInput";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"WorkItemWidgetLabelsUpdateInput".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(addLabelIds, removeLabelIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetLabelsUpdateInput other = (WorkItemWidgetLabelsUpdateInput) obj;
        return Objects.equals(addLabelIds, other.addLabelIds) && Objects.equals(removeLabelIds, other.removeLabelIds);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetLabelsUpdateInput [addLabelIds=" + addLabelIds + ", removeLabelIds=" + removeLabelIds + "]";
    }

}
