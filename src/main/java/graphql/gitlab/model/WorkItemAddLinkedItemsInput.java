package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import graphql.gitlab.GitLabInputRequest;

/**
 * Autogenerated input type of WorkItemAddLinkedItems
 */
@Name("WorkItemAddLinkedItemsInput")
public class WorkItemAddLinkedItemsInput implements GitLabInputRequest {

    /**
     * A unique identifier for the client performing the mutation.
     */
    private String clientMutationId;

    /**
     * Global ID of the work item.
     */
    private WorkItemID id;

    /**
     * Type of link. Defaults to `RELATED`.
     */
    private WorkItemRelatedLinkType linkType;

    /**
     * Global IDs of the items to link. Maximum number of IDs you can provide: 10.
     */
    private List<WorkItemID> workItemsIds;

    public String getClientMutationId() {
        return clientMutationId;
    }

    public WorkItemAddLinkedItemsInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
        return this;
    }

    public WorkItemID getId() {
        return id;
    }

    public WorkItemAddLinkedItemsInput setId(WorkItemID id) {
        this.id = id;
        return this;
    }

    public WorkItemRelatedLinkType getLinkType() {
        return linkType;
    }

    public WorkItemAddLinkedItemsInput setLinkType(WorkItemRelatedLinkType linkType) {
        this.linkType = linkType;
        return this;
    }

    public List<WorkItemID> getWorkItemsIds() {
        return workItemsIds;
    }

    public WorkItemAddLinkedItemsInput setWorkItemsIds(List<WorkItemID> workItemsIds) {
        this.workItemsIds = workItemsIds;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, id, linkType, workItemsIds);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        WorkItemAddLinkedItemsInput other = (WorkItemAddLinkedItemsInput) obj;
        return Objects.equals(clientMutationId, other.clientMutationId) && Objects.equals(id, other.id) && Objects.equals(linkType, other.linkType) && Objects.equals(workItemsIds, other.workItemsIds);
    }

    @Override
    public String toString() {
        return "WorkItemAddLinkedItemsInput [clientMutationId=" + clientMutationId + ", id=" + id + ", linkType=" + linkType + ", workItemsIds=" + workItemsIds + "]";
    }

}
