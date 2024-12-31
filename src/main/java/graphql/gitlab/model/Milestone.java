package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a milestone
 */
@Name("Milestone")
public class Milestone {

    /**
     * Timestamp of milestone creation.
     */
    private Time createdAt;

    /**
     * Description of the milestone.
     */
    private String description;

    /**
     * Timestamp of the milestone due date.
     */
    private Time dueDate;

    /**
     * Expired state of the milestone (a milestone is expired when the due date is past the current date). Defaults to `false` when due date has not been set.
     */
    private Boolean expired;

    /**
     * ID of the milestone.
     */
    private String id;

    /**
     * Timestamp of the milestone start date.
     */
    private Time startDate;

    /**
     * State of the milestone.
     */
    private MilestoneStateEnum state;

    /**
     * Title of the milestone.
     */
    private String title;

    /**
     * Upcoming state of the milestone (a milestone is upcoming when the start date is in the future). Defaults to `false` when start date has not been set.
     */
    private Boolean upcoming;

    /**
     * Timestamp of last milestone update.
     */
    private Time updatedAt;

    /**
     * Web path of the milestone.
     */
    private String webPath;

    public Time getCreatedAt() {
        return createdAt;
    }

    public Milestone setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Milestone setDescription(String description) {
        this.description = description;
        return this;
    }

    public Time getDueDate() {
        return dueDate;
    }

    public Milestone setDueDate(Time dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Boolean getExpired() {
        return expired;
    }

    public Milestone setExpired(Boolean expired) {
        this.expired = expired;
        return this;
    }

    public String getId() {
        return id;
    }

    public Milestone setId(String id) {
        this.id = id;
        return this;
    }

    public Time getStartDate() {
        return startDate;
    }

    public Milestone setStartDate(Time startDate) {
        this.startDate = startDate;
        return this;
    }

    public MilestoneStateEnum getState() {
        return state;
    }

    public Milestone setState(MilestoneStateEnum state) {
        this.state = state;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Milestone setTitle(String title) {
        this.title = title;
        return this;
    }

    public Boolean getUpcoming() {
        return upcoming;
    }

    public Milestone setUpcoming(Boolean upcoming) {
        this.upcoming = upcoming;
        return this;
    }

    public Time getUpdatedAt() {
        return updatedAt;
    }

    public Milestone setUpdatedAt(Time updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getWebPath() {
        return webPath;
    }

    public Milestone setWebPath(String webPath) {
        this.webPath = webPath;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, description, dueDate, expired, id, startDate, state, title, upcoming, updatedAt, webPath);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Milestone other = (Milestone) obj;
        return Objects.equals(createdAt, other.createdAt) && Objects.equals(description, other.description) && Objects.equals(dueDate, other.dueDate) && Objects.equals(expired, other.expired) && Objects.equals(id, other.id) && Objects.equals(startDate, other.startDate) && Objects.equals(state, other.state) && Objects.equals(title, other.title) && Objects.equals(upcoming, other.upcoming) && Objects.equals(updatedAt, other.updatedAt) && Objects.equals(webPath, other.webPath);
    }

    @Override
    public String toString() {
        return "Milestone [createdAt=" + createdAt + ", description=" + description + ", dueDate=" + dueDate + ", expired=" + expired + ", id=" + id + ", startDate=" + startDate + ", state=" + state + ", title=" + title + ", upcoming=" + upcoming + ", updatedAt=" + updatedAt + ", webPath=" + webPath + "]";
    }

}
