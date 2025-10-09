package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("WorkItem")
public class WorkItem implements Todoable {

    /**
     * Timestamp of when the work item was closed.
     */
    private Time closedAt;

    /**
     * Timestamp of when the work item was created.
     */
    private Time createdAt;

    /**
     * URL of the work item that the work item is marked as a duplicate of.
     */
    private String duplicatedToWorkItemUrl;

    /**
     * Global ID of the work item.
     */
    private WorkItemID id;

    /**
     * Internal ID of the work item.
     */
    private String iid;

    /**
     * URL of the work item that the work item was moved to.
     */
    private String movedToWorkItemUrl;

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
     * Timestamp of when the work item was last updated.
     */
    private Time updatedAt;

    /**
     * URL of the object.
     */
    private String webUrl;

    /**
     * Collection of widgets that belong to the work item.
     */
    private List<WorkItemWidget> widgets;

    /**
     * Type assigned to the work item.
     */
    private WorkItemType workItemType;

    public Time getClosedAt() {
        return closedAt;
    }

    public WorkItem setClosedAt(Time closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public WorkItem setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public String getDuplicatedToWorkItemUrl() {
        return duplicatedToWorkItemUrl;
    }

    public WorkItem setDuplicatedToWorkItemUrl(String duplicatedToWorkItemUrl) {
        this.duplicatedToWorkItemUrl = duplicatedToWorkItemUrl;
        return this;
    }

    public WorkItemID getId() {
        return id;
    }

    public WorkItem setId(WorkItemID id) {
        this.id = id;
        return this;
    }

    public String getIid() {
        return iid;
    }

    public WorkItem setIid(String iid) {
        this.iid = iid;
        return this;
    }

    public String getMovedToWorkItemUrl() {
        return movedToWorkItemUrl;
    }

    public WorkItem setMovedToWorkItemUrl(String movedToWorkItemUrl) {
        this.movedToWorkItemUrl = movedToWorkItemUrl;
        return this;
    }

    public Namespace getNamespace() {
        return namespace;
    }

    public WorkItem setNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getReference() {
        return reference;
    }

    public WorkItem setReference(String reference) {
        this.reference = reference;
        return this;
    }

    public WorkItemState getState() {
        return state;
    }

    public WorkItem setState(WorkItemState state) {
        this.state = state;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public WorkItem setTitle(String title) {
        this.title = title;
        return this;
    }

    public Time getUpdatedAt() {
        return updatedAt;
    }

    public WorkItem setUpdatedAt(Time updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public WorkItem setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    public List<WorkItemWidget> getWidgets() {
        return widgets;
    }

    public WorkItem setWidgets(List<WorkItemWidget> widgets) {
        this.widgets = widgets;
        return this;
    }

    public WorkItemType getWorkItemType() {
        return workItemType;
    }

    public WorkItem setWorkItemType(WorkItemType workItemType) {
        this.workItemType = workItemType;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(closedAt, createdAt, duplicatedToWorkItemUrl, id, iid, movedToWorkItemUrl, namespace, reference, state, title, updatedAt, webUrl, widgets, workItemType);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItem other = (WorkItem) obj;
        return Objects.equals(closedAt, other.closedAt) && Objects.equals(createdAt, other.createdAt) && Objects.equals(duplicatedToWorkItemUrl, other.duplicatedToWorkItemUrl) && Objects.equals(id, other.id) && Objects.equals(iid, other.iid) && Objects.equals(movedToWorkItemUrl, other.movedToWorkItemUrl) && Objects.equals(namespace, other.namespace) && Objects.equals(reference, other.reference) && Objects.equals(state, other.state) && Objects.equals(title, other.title) && Objects.equals(updatedAt, other.updatedAt) && Objects.equals(webUrl, other.webUrl) && Objects.equals(widgets, other.widgets) && Objects.equals(workItemType, other.workItemType);
    }

    @Override
    public String toString() {
        return "WorkItem [closedAt=" + closedAt + ", createdAt=" + createdAt + ", duplicatedToWorkItemUrl=" + duplicatedToWorkItemUrl + ", id=" + id + ", iid=" + iid + ", movedToWorkItemUrl=" + movedToWorkItemUrl + ", namespace=" + namespace + ", reference=" + reference + ", state=" + state + ", title=" + title + ", updatedAt=" + updatedAt + ", webUrl=" + webUrl + ", widgets=" + widgets + ", workItemType=" + workItemType + "]";
    }

}
