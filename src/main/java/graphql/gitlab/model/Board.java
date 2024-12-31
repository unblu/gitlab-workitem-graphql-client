package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a project or group issue board
 */
@Name("Board")
public class Board {

    /**
     * Board assignee.
     */
    private UserCore assignee;

    /**
     * Timestamp of when the board was created.
     */
    private Time createdAt;

    /**
     * Whether or not backlog list is hidden.
     */
    private Boolean hideBacklogList;

    /**
     * Whether or not closed list is hidden.
     */
    private Boolean hideClosedList;

    /**
     * ID (global ID) of the board.
     */
    private String id;

    /**
     * Board iteration.
     */
    private Iteration iteration;

    /**
     * Board iteration cadence.
     */
    private IterationCadence iterationCadence;

    /**
     * Labels of the board.
     */
    private LabelConnection labels;

    /**
     * Lists of the board.
     */
    private BoardListConnection lists;

    /**
     * Board milestone.
     */
    private Milestone milestone;

    /**
     * Name of the board.
     */
    private String name;

    /**
     * Timestamp of when the board was last updated.
     */
    private Time updatedAt;

    /**
     * Web URL of the board.
     */
    private String webUrl;

    /**
     * Weight of the board.
     */
    private Integer weight;

    public UserCore getAssignee() {
        return assignee;
    }

    public Board setAssignee(UserCore assignee) {
        this.assignee = assignee;
        return this;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public Board setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public Boolean getHideBacklogList() {
        return hideBacklogList;
    }

    public Board setHideBacklogList(Boolean hideBacklogList) {
        this.hideBacklogList = hideBacklogList;
        return this;
    }

    public Boolean getHideClosedList() {
        return hideClosedList;
    }

    public Board setHideClosedList(Boolean hideClosedList) {
        this.hideClosedList = hideClosedList;
        return this;
    }

    public String getId() {
        return id;
    }

    public Board setId(String id) {
        this.id = id;
        return this;
    }

    public Iteration getIteration() {
        return iteration;
    }

    public Board setIteration(Iteration iteration) {
        this.iteration = iteration;
        return this;
    }

    public IterationCadence getIterationCadence() {
        return iterationCadence;
    }

    public Board setIterationCadence(IterationCadence iterationCadence) {
        this.iterationCadence = iterationCadence;
        return this;
    }

    public LabelConnection getLabels() {
        return labels;
    }

    public Board setLabels(LabelConnection labels) {
        this.labels = labels;
        return this;
    }

    public BoardListConnection getLists() {
        return lists;
    }

    public Board setLists(BoardListConnection lists) {
        this.lists = lists;
        return this;
    }

    public Milestone getMilestone() {
        return milestone;
    }

    public Board setMilestone(Milestone milestone) {
        this.milestone = milestone;
        return this;
    }

    public String getName() {
        return name;
    }

    public Board setName(String name) {
        this.name = name;
        return this;
    }

    public Time getUpdatedAt() {
        return updatedAt;
    }

    public Board setUpdatedAt(Time updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public Board setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    public Integer getWeight() {
        return weight;
    }

    public Board setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(assignee, createdAt, hideBacklogList, hideClosedList, id, iteration, iterationCadence, labels, lists, milestone, name, updatedAt, webUrl, weight);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Board other = (Board) obj;
        return Objects.equals(assignee, other.assignee) && Objects.equals(createdAt, other.createdAt) && Objects.equals(hideBacklogList, other.hideBacklogList) && Objects.equals(hideClosedList, other.hideClosedList) && Objects.equals(id, other.id) && Objects.equals(iteration, other.iteration) && Objects.equals(iterationCadence, other.iterationCadence) && Objects.equals(labels, other.labels) && Objects.equals(lists, other.lists) && Objects.equals(milestone, other.milestone) && Objects.equals(name, other.name) && Objects.equals(updatedAt, other.updatedAt) && Objects.equals(webUrl, other.webUrl) && Objects.equals(weight, other.weight);
    }

    @Override
    public String toString() {
        return "Board [assignee=" + assignee + ", createdAt=" + createdAt + ", hideBacklogList=" + hideBacklogList + ", hideClosedList=" + hideClosedList + ", id=" + id + ", iteration=" + iteration + ", iterationCadence=" + iterationCadence + ", labels=" + labels + ", lists=" + lists + ", milestone=" + milestone + ", name=" + name + ", updatedAt=" + updatedAt + ", webUrl=" + webUrl + ", weight=" + weight + "]";
    }

}
