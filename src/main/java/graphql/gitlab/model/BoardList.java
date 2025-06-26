package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a list for an issue board
 */
@Name("BoardList")
public class BoardList {

    /**
     * Assignee in the list.
     */
    private UserCore assignee;

    /**
     * Indicates if the list is collapsed for the user.
     */
    private Boolean collapsed;

    /**
     * ID (global ID) of the list.
     */
    private ListID id;

    /**
     * Iteration of the list.
     */
    private Iteration iteration;

    /**
     * Label of the list.
     */
    private Label label;

    /**
     * Current limit metric for the list.
     */
    private ListLimitMetric limitMetric;

    /**
     * Type of the list.
     */
    private String listType;

    /**
     * Maximum number of issues in the list.
     */
    private Integer maxIssueCount;

    /**
     * Maximum weight of issues in the list.
     */
    private Integer maxIssueWeight;

    /**
     * Milestone of the list.
     */
    private Milestone milestone;

    /**
     * Position of list within the board.
     */
    private Integer position;

    /**
     * Title of the list.
     */
    private String title;

    public UserCore getAssignee() {
        return assignee;
    }

    public BoardList setAssignee(UserCore assignee) {
        this.assignee = assignee;
        return this;
    }

    public Boolean getCollapsed() {
        return collapsed;
    }

    public BoardList setCollapsed(Boolean collapsed) {
        this.collapsed = collapsed;
        return this;
    }

    public ListID getId() {
        return id;
    }

    public BoardList setId(ListID id) {
        this.id = id;
        return this;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public BoardList setIteration(Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public Label getLabel() {
        return label;
    }

    public BoardList setLabel(Label label) {
        this.label = label;
        return this;
    }

    public ListLimitMetric getLimitMetric() {
        return limitMetric;
    }

    public BoardList setLimitMetric(ListLimitMetric limitMetric) {
        this.limitMetric = limitMetric;
        return this;
    }

    public String getListType() {
        return listType;
    }

    public BoardList setListType(String listType) {
        this.listType = listType;
        return this;
    }

    public Integer getMaxIssueCount() {
        return maxIssueCount;
    }

    public BoardList setMaxIssueCount(Integer maxIssueCount) {
        this.maxIssueCount = maxIssueCount;
        return this;
    }

    public Integer getMaxIssueWeight() {
        return maxIssueWeight;
    }

    public BoardList setMaxIssueWeight(Integer maxIssueWeight) {
        this.maxIssueWeight = maxIssueWeight;
        return this;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public BoardList setMilestone(Milestone milestone) {
        this.milestone = milestone;
        return this;
    }

    public Integer getPosition() {
        return position;
    }

    public BoardList setPosition(Integer position) {
        this.position = position;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BoardList setTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "BoardList";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"BoardList".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignee, collapsed, id, iteration, label, limitMetric, listType, maxIssueCount, maxIssueWeight, milestone, position, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BoardList other = (BoardList) obj;
        return Objects.equals(assignee, other.assignee) && Objects.equals(collapsed, other.collapsed) && Objects.equals(id, other.id) && Objects.equals(iteration, other.iteration) && Objects.equals(label, other.label) && Objects.equals(limitMetric, other.limitMetric) && Objects.equals(listType, other.listType) && Objects.equals(maxIssueCount, other.maxIssueCount) && Objects.equals(maxIssueWeight, other.maxIssueWeight) && Objects.equals(milestone, other.milestone) && Objects.equals(position, other.position) && Objects.equals(title, other.title);
    }

    @Override
    public String toString() {
        return "BoardList [assignee=" + assignee + ", collapsed=" + collapsed + ", id=" + id + ", iteration=" + iteration + ", label=" + label + ", limitMetric=" + limitMetric + ", listType=" + listType + ", maxIssueCount=" + maxIssueCount + ", maxIssueWeight=" + maxIssueWeight + ", milestone=" + milestone + ", position=" + position + ", title=" + title + "]";
    }

}
