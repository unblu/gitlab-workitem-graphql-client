package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import graphql.gitlab.GitLabInputRequest;

/**
 * Autogenerated input type of UpdateBoard
 */
@Name("UpdateBoardInput")
public class UpdateBoardInput implements GitLabInputRequest {

    /**
     * A unique identifier for the client performing the mutation.
     */
    private String clientMutationId;

    /**
     * Board name.
     */
    private String name;

    /**
     * Whether or not backlog list is hidden.
     */
    private Boolean hideBacklogList;

    /**
     * Whether or not closed list is hidden.
     */
    private Boolean hideClosedList;

    /**
     * Board global ID.
     */
    private BoardID id;

    /**
     * ID of user to be assigned to the board.
     */
    private UserID assigneeId;

    /**
     * ID of milestone to be assigned to the board.
     */
    private MilestoneID milestoneId;

    /**
     * ID of iteration to be assigned to the board.
     */
    private IterationID iterationId;

    /**
     * ID of iteration cadence to be assigned to the board.
     */
    private IterationsCadenceID iterationCadenceId;

    /**
     * Weight value to be assigned to the board.
     */
    private Integer weight;

    /**
     * IDs of labels to be added to the board.
     */
    private List<LabelID> labelIds;

    public String getClientMutationId() {
        return clientMutationId;
    }

    public UpdateBoardInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
        return this;
    }

    public String getName() {
        return name;
    }

    public UpdateBoardInput setName(String name) {
        this.name = name;
        return this;
    }

    public Boolean getHideBacklogList() {
        return hideBacklogList;
    }

    public UpdateBoardInput setHideBacklogList(Boolean hideBacklogList) {
        this.hideBacklogList = hideBacklogList;
        return this;
    }

    public Boolean getHideClosedList() {
        return hideClosedList;
    }

    public UpdateBoardInput setHideClosedList(Boolean hideClosedList) {
        this.hideClosedList = hideClosedList;
        return this;
    }

    public BoardID getId() {
        return id;
    }

    public UpdateBoardInput setId(BoardID id) {
        this.id = id;
        return this;
    }

    public UserID getAssigneeId() {
        return assigneeId;
    }

    public UpdateBoardInput setAssigneeId(UserID assigneeId) {
        this.assigneeId = assigneeId;
        return this;
    }

    public MilestoneID getMilestoneId() {
        return milestoneId;
    }

    public UpdateBoardInput setMilestoneId(MilestoneID milestoneId) {
        this.milestoneId = milestoneId;
        return this;
    }

    public IterationID getIterationId() {
        return iterationId;
    }

    public UpdateBoardInput setIterationId(IterationID iterationId) {
        this.iterationId = iterationId;
        return this;
    }

    public IterationsCadenceID getIterationCadenceId() {
        return iterationCadenceId;
    }

    public UpdateBoardInput setIterationCadenceId(IterationsCadenceID iterationCadenceId) {
        this.iterationCadenceId = iterationCadenceId;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public UpdateBoardInput setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    public List<LabelID> getLabelIds() {
        return labelIds;
    }

    public UpdateBoardInput setLabelIds(List<LabelID> labelIds) {
        this.labelIds = labelIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, name, hideBacklogList, hideClosedList, id, assigneeId, milestoneId, iterationId, iterationCadenceId, weight, labelIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UpdateBoardInput other = (UpdateBoardInput) obj;
        return Objects.equals(clientMutationId, other.clientMutationId) && Objects.equals(name, other.name) && Objects.equals(hideBacklogList, other.hideBacklogList) && Objects.equals(hideClosedList, other.hideClosedList) && Objects.equals(id, other.id) && Objects.equals(assigneeId, other.assigneeId) && Objects.equals(milestoneId, other.milestoneId) && Objects.equals(iterationId, other.iterationId) && Objects.equals(iterationCadenceId, other.iterationCadenceId) && Objects.equals(weight, other.weight) && Objects.equals(labelIds, other.labelIds);
    }

    @Override
    public String toString() {
        return "UpdateBoardInput [clientMutationId=" + clientMutationId + ", name=" + name + ", hideBacklogList=" + hideBacklogList + ", hideClosedList=" + hideClosedList + ", id=" + id + ", assigneeId=" + assigneeId + ", milestoneId=" + milestoneId + ", iterationId=" + iterationId + ", iterationCadenceId=" + iterationCadenceId + ", weight=" + weight + ", labelIds=" + labelIds + "]";
    }

}
