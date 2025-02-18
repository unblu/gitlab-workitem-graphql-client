package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a release
 */
@Name("Release")
public class Release {

    /**
     * Timestamp of when the release was created.
     */
    private Time createdAt;

    /**
     * Description (also known as "release notes") of the release.
     */
    private String description;

    /**
     * Global ID of the release.
     */
    private ReleaseID id;

    /**
     * Links of the release.
     */
    private ReleaseLinks links;

    /**
     * Milestones associated to the release.
     */
    private MilestoneConnectionRef milestones;

    /**
     * Name of the release.
     */
    private String name;

    /**
     * Name of the tag associated with the release.
     */
    private String tagName;

    /**
     * Indicates the release is an upcoming release.
     */
    private Boolean upcomingRelease;

    public Time getCreatedAt() {
        return createdAt;
    }

    public Release setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Release setDescription(String description) {
        this.description = description;
        return this;
    }

    public ReleaseID getId() {
        return id;
    }

    public Release setId(ReleaseID id) {
        this.id = id;
        return this;
    }

    public ReleaseLinks getLinks() {
        return links;
    }

    public Release setLinks(ReleaseLinks links) {
        this.links = links;
        return this;
    }

    public MilestoneConnectionRef getMilestones() {
        return milestones;
    }

    public Release setMilestones(MilestoneConnectionRef milestones) {
        this.milestones = milestones;
        return this;
    }

    public String getName() {
        return name;
    }

    public Release setName(String name) {
        this.name = name;
        return this;
    }

    public String getTagName() {
        return tagName;
    }

    public Release setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }

    public Boolean getUpcomingRelease() {
        return upcomingRelease;
    }

    public Release setUpcomingRelease(Boolean upcomingRelease) {
        this.upcomingRelease = upcomingRelease;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt, description, id, links, milestones, name, tagName, upcomingRelease);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Release other = (Release) obj;
        return Objects.equals(createdAt, other.createdAt) && Objects.equals(description, other.description) && Objects.equals(id, other.id) && Objects.equals(links, other.links) && Objects.equals(milestones, other.milestones) && Objects.equals(name, other.name) && Objects.equals(tagName, other.tagName) && Objects.equals(upcomingRelease, other.upcomingRelease);
    }

    @Override
    public String toString() {
        return "Release [createdAt=" + createdAt + ", description=" + description + ", id=" + id + ", links=" + links + ", milestones=" + milestones + ", name=" + name + ", tagName=" + tagName + ", upcomingRelease=" + upcomingRelease + "]";
    }

}
