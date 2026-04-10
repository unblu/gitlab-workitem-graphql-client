package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a weight widget
 */
@Name("WorkItemWidgetWeight")
public class WorkItemWidgetWeight implements WorkItemWidget {

    /**
     * Weight of the work item.
     */
    private Integer weight;

    /**
     * Total weight of the work item and its descendants.
     */
    private Integer rolledUpWeight;

    public Integer getWeight() {
        return weight;
    }

    public WorkItemWidgetWeight setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public Integer getRolledUpWeight() {
        return rolledUpWeight;
    }

    public WorkItemWidgetWeight setRolledUpWeight(Integer rolledUpWeight) {
        this.rolledUpWeight = rolledUpWeight;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, rolledUpWeight);
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
        return Objects.equals(weight, other.weight) && Objects.equals(rolledUpWeight, other.rolledUpWeight);
    }

    @Override
    public String toString() {
        return "WorkItemWidgetWeight [weight=" + weight + ", rolledUpWeight=" + rolledUpWeight + "]";
    }

}
