package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Duplicate of `WorkItem` to avoid SRGQLDC035008: Field recursion found
 */
@Name("WorkItemRef")
public class WorkItemRef implements Todoable {

    /**
     * Whether the work item belongs to an archived project. Always false for group level work items. Introduced in GitLab 16.5: **Status**: Experiment.
     */
    private Boolean archived;

    /**
     * Indicates the work item is confidential.
     */
    private Boolean confidential;

    /**
     * Timestamp of when the work item was created.
     */
    private Time createdAt;

    /**
     * Global ID of the work item.
     */
    private WorkItemID id;

    /**
     * Internal ID of the work item.
     */
    private String iid;

    /**
     * Namespace the work item belongs to. Introduced in GitLab 15.10: **Status**: Experiment.
     */
    private Namespace namespace;

    /**
     * Internal reference of the work item. Returned in shortened format by default.
     */
    private String reference;

    /**
     * State of the work item.
     */
    private WorkItemState state;

    /**
     * Title of the work item.
     */
    private String title;

    /**
     * URL of this object.
     */
    private String webUrl;

    /**
     * Type assigned to the work item.
     */
    private WorkItemType workItemType;

    public Boolean getArchived() {
        return archived;
    }

    public WorkItemRef setArchived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    public Boolean getConfidential() {
        return confidential;
    }

    public WorkItemRef setConfidential(Boolean confidential) {
        this.confidential = confidential;
        return this;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public WorkItemRef setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public WorkItemID getId() {
        return id;
    }

    public WorkItemRef setId(WorkItemID id) {
        this.id = id;
        return this;
    }

    public String getIid() {
        return iid;
    }

    public WorkItemRef setIid(String iid) {
        this.iid = iid;
        return this;
    }

    public Namespace getNamespace() {
        return namespace;
    }

    public WorkItemRef setNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getReference() {
        return reference;
    }

    public WorkItemRef setReference(String reference) {
        this.reference = reference;
        return this;
    }

    public WorkItemState getState() {
        return state;
    }

    public WorkItemRef setState(WorkItemState state) {
        this.state = state;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public WorkItemRef setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public WorkItemRef setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    public WorkItemType getWorkItemType() {
        return workItemType;
    }

    public WorkItemRef setWorkItemType(WorkItemType workItemType) {
        this.workItemType = workItemType;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(archived, confidential, createdAt, id, iid, namespace, reference, state, title, webUrl, workItemType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemRef other = (WorkItemRef) obj;
        return Objects.equals(archived, other.archived) && Objects.equals(confidential, other.confidential) && Objects.equals(createdAt, other.createdAt) && Objects.equals(id, other.id) && Objects.equals(iid, other.iid) && Objects.equals(namespace, other.namespace) && Objects.equals(reference, other.reference) && Objects.equals(state, other.state) && Objects.equals(title, other.title) && Objects.equals(webUrl, other.webUrl) && Objects.equals(workItemType, other.workItemType);
    }

    @Override
    public String toString() {
        return "WorkItemRef [archived=" + archived + ", confidential=" + confidential + ", createdAt=" + createdAt + ", id=" + id + ", iid=" + iid + ", namespace=" + namespace + ", reference=" + reference + ", state=" + state + ", title=" + title + ", webUrl=" + webUrl + ", workItemType=" + workItemType + "]";
    }

}
