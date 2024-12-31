package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents an iteration object
 */
@Name("Iteration")
public class Iteration {

    /**
     * Timestamp of iteration creation.
     */
    private Time createdAt;

    /**
     * Description of the iteration.
     */
    private String description;

    /**
     * Timestamp of the iteration due date.
     */
    private Time dueDate;

    /**
     * ID of the iteration.
     */
    private String id;

    /**
     * Cadence of the iteration.
     */
    private IterationCadence iterationCadence;

    /**
     * Web path of the iteration, scoped to the query parent. Only valid for Project parents. Returns null in other contexts.
     */
    private String scopedPath;

    /**
     * Web URL of the iteration, scoped to the query parent. Only valid for Project parents. Returns null in other contexts.
     */
    private String scopedUrl;

    /**
     * Sequence number for the iteration when you sort the containing cadence's iterations by the start and end date. The earliest starting and ending iteration is assigned 1.
     */
    private Integer sequence;

    /**
     * Timestamp of the iteration start date.
     */
    private Time startDate;

    /**
     * State of the iteration.
     */
    private IterationState state;

    /**
     * Title of the iteration.
     */
    private String title;

    /**
     * Timestamp of last iteration update.
     */
    private Time updatedAt;

    /**
     * Web path of the iteration.
     */
    private String webPath;

    /**
     * Web URL of the iteration.
     */
    private String webUrl;

    public Time getCreatedAt() {
        return createdAt;
    }

    public Iteration setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Iteration setDescription(String description) {
        this.description = description;
        return this;
    }

    public Time getDueDate() {
        return dueDate;
    }

    public Iteration setDueDate(Time dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public String getId() {
        return id;
    }

    public Iteration setId(String id) {
        this.id = id;
        return this;
    }

    public IterationCadence getIterationCadence() {
        return iterationCadence;
    }

    public Iteration setIterationCadence(IterationCadence iterationCadence) {
        this.iterationCadence = iterationCadence;
        return this;
    }

    public String getScopedPath() {
        return scopedPath;
    }

    public Iteration setScopedPath(String scopedPath) {
        this.scopedPath = scopedPath;
        return this;
    }

    public String getScopedUrl() {
        return scopedUrl;
    }

    public Iteration setScopedUrl(String scopedUrl) {
        this.scopedUrl = scopedUrl;
        return this;
    }

    public Integer getSequence() {
        return sequence;
    }

    public Iteration setSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    public Time getStartDate() {
        return startDate;
    }

    public Iteration setStartDate(Time startDate) {
        this.startDate = startDate;
        return this;
    }

    public IterationState getState() {
        return state;
    }

    public Iteration setState(IterationState state) {
        this.state = state;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Iteration setTitle(String title) {
        this.title = title;
        return this;
    }

    public Time getUpdatedAt() {
        return updatedAt;
    }

    public Iteration setUpdatedAt(Time updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getWebPath() {
        return webPath;
    }

    public Iteration setWebPath(String webPath) {
        this.webPath = webPath;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public Iteration setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, description, dueDate, id, iterationCadence, scopedPath, scopedUrl, sequence, startDate, state, title, updatedAt, webPath, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Iteration other = (Iteration) obj;
        return Objects.equals(createdAt, other.createdAt) && Objects.equals(description, other.description) && Objects.equals(dueDate, other.dueDate) && Objects.equals(id, other.id) && Objects.equals(iterationCadence, other.iterationCadence) && Objects.equals(scopedPath, other.scopedPath) && Objects.equals(scopedUrl, other.scopedUrl) && Objects.equals(sequence, other.sequence) && Objects.equals(startDate, other.startDate) && Objects.equals(state, other.state) && Objects.equals(title, other.title) && Objects.equals(updatedAt, other.updatedAt) && Objects.equals(webPath, other.webPath) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "Iteration [createdAt=" + createdAt + ", description=" + description + ", dueDate=" + dueDate + ", id=" + id + ", iterationCadence=" + iterationCadence + ", scopedPath=" + scopedPath + ", scopedUrl=" + scopedUrl + ", sequence=" + sequence + ", startDate=" + startDate + ", state=" + state + ", title=" + title + ", updatedAt=" + updatedAt + ", webPath=" + webPath + ", webUrl=" + webUrl + "]";
    }

}
