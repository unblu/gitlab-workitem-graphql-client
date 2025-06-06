package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import graphql.gitlab.GitLabInputRequest;

/**
 * Autogenerated input type of DestroyBoardList
 */
@Name("DestroyBoardListInput")
public class DestroyBoardListInput implements GitLabInputRequest {

    /**
     * A unique identifier for the client performing the mutation.
     */
    private String clientMutationId;

    /**
     * Global ID of the list to destroy. Only label lists are accepted.
     */
    private ListID listId;

    public String getClientMutationId() {
        return clientMutationId;
    }

    public DestroyBoardListInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
        return this;
    }

    public ListID getListId() {
        return listId;
    }

    public DestroyBoardListInput setListId(ListID listId) {
        this.listId = listId;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, listId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        DestroyBoardListInput other = (DestroyBoardListInput) obj;
        return Objects.equals(clientMutationId, other.clientMutationId) && Objects.equals(listId, other.listId);
    }

    @Override
    public String toString() {
        return "DestroyBoardListInput [clientMutationId=" + clientMutationId + ", listId=" + listId + "]";
    }

}
