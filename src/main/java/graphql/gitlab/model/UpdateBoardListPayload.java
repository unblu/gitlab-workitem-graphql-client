package graphql.gitlab.model;

import java.util.List;
import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import graphql.gitlab.GitLabPayloadResponse;

/**
 * Autogenerated return type of UpdateBoardList.
 */
@Name("UpdateBoardListPayload")
public class UpdateBoardListPayload implements GitLabPayloadResponse {

    /**
     * A unique identifier for the client performing the mutation.
     */
    private String clientMutationId;

    /**
     * Errors encountered during the mutation.
     */
    private List<String> errors;

    /**
     * Mutated list.
     */
    private BoardList list;

    public String getClientMutationId() {
        return clientMutationId;
    }

    public UpdateBoardListPayload setClientMutationId(String clientMutationId) {
        this.clientMutationId = clientMutationId;
        return this;
    }

    public List<String> getErrors() {
        return errors;
    }

    public UpdateBoardListPayload setErrors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public BoardList getList() {
        return list;
    }

    public UpdateBoardListPayload setList(BoardList list) {
        this.list = list;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientMutationId, errors, list);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UpdateBoardListPayload other = (UpdateBoardListPayload) obj;
        return Objects.equals(clientMutationId, other.clientMutationId) && Objects.equals(errors, other.errors) && Objects.equals(list, other.list);
    }

    @Override
    public String toString() {
        return "UpdateBoardListPayload [clientMutationId=" + clientMutationId + ", errors=" + errors + ", list=" + list + "]";
    }

}
