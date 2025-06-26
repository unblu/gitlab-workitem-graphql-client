package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an iteration cadence
 */
@Name("IterationCadence")
public class IterationCadence {

    /**
     * Whether the iteration cadence is active.
     */
    private Boolean active;

    /**
     * Whether the iteration cadence should automatically generate upcoming iterations.
     */
    private Boolean automatic;

    /**
     * Description of the iteration cadence. Maximum length is 5000 characters.
     */
    private String description;

    /**
     * Duration in weeks of the iterations within the cadence.
     */
    private Integer durationInWeeks;

    /**
     * Global ID of the iteration cadence.
     */
    private IterationsCadenceID id;

    /**
     * Upcoming iterations to be created when iteration cadence is set to automatic.
     */
    private Integer iterationsInAdvance;

    /**
     * Whether the iteration cadence should roll over issues to the next iteration or not.
     */
    private Boolean rollOver;

    /**
     * Timestamp of the automation start date.
     */
    private Time startDate;

    /**
     * Title of the iteration cadence.
     */
    private String title;

    public Boolean getActive() {
        return active;
    }

    public IterationCadence setActive(Boolean active) {
        this.active = active;
        return this;
    }

    public Boolean getAutomatic() {
        return automatic;
    }

    public IterationCadence setAutomatic(Boolean automatic) {
        this.automatic = automatic;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public IterationCadence setDescription(String description) {
        this.description = description;
        return this;
    }

    public Integer getDurationInWeeks() {
        return durationInWeeks;
    }

    public IterationCadence setDurationInWeeks(Integer durationInWeeks) {
        this.durationInWeeks = durationInWeeks;
        return this;
    }

    public IterationsCadenceID getId() {
        return id;
    }

    public IterationCadence setId(IterationsCadenceID id) {
        this.id = id;
        return this;
    }

    public Integer getIterationsInAdvance() {
        return iterationsInAdvance;
    }

    public IterationCadence setIterationsInAdvance(Integer iterationsInAdvance) {
        this.iterationsInAdvance = iterationsInAdvance;
        return this;
    }

    public Boolean getRollOver() {
        return rollOver;
    }

    public IterationCadence setRollOver(Boolean rollOver) {
        this.rollOver = rollOver;
        return this;
    }

    public Time getStartDate() {
        return startDate;
    }

    public IterationCadence setStartDate(Time startDate) {
        this.startDate = startDate;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public IterationCadence setTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "IterationCadence";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"IterationCadence".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(active, automatic, description, durationInWeeks, id, iterationsInAdvance, rollOver, startDate, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        IterationCadence other = (IterationCadence) obj;
        return Objects.equals(active, other.active) && Objects.equals(automatic, other.automatic) && Objects.equals(description, other.description) && Objects.equals(durationInWeeks, other.durationInWeeks) && Objects.equals(id, other.id) && Objects.equals(iterationsInAdvance, other.iterationsInAdvance) && Objects.equals(rollOver, other.rollOver) && Objects.equals(startDate, other.startDate) && Objects.equals(title, other.title);
    }

    @Override
    public String toString() {
        return "IterationCadence [active=" + active + ", automatic=" + automatic + ", description=" + description + ", durationInWeeks=" + durationInWeeks + ", id=" + id + ", iterationsInAdvance=" + iterationsInAdvance + ", rollOver=" + rollOver + ", startDate=" + startDate + ", title=" + title + "]";
    }

}
