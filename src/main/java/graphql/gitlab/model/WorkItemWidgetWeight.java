package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a weight widget
 */
@Name("WorkItemWidgetWeight")
public class WorkItemWidgetWeight implements WorkItemWidget {

    /**
     * Rolled up weight from descendant work items. Introduced in GitLab 17.2: **Status**: Experiment.
     */
    private Integer rolledUpWeight;

    /**
     * Weight of the work item.
     */
    private Integer weight;

    public Integer getRolledUpWeight() {
        return rolledUpWeight;
    }

    public WorkItemWidgetWeight setRolledUpWeight(Integer rolledUpWeight) {
        this.rolledUpWeight = rolledUpWeight;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public WorkItemWidgetWeight setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rolledUpWeight, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemWidgetWeight other = (WorkItemWidgetWeight) obj;
        return Objects.equals(rolledUpWeight, other.rolledUpWeight) && Objects.equals(weight, other.weight);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetWeight [rolledUpWeight=" + rolledUpWeight + ", weight=" + weight + "]";
    }

}
