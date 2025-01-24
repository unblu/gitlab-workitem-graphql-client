package graphql.gitlab;

import java.util.List;

public interface GitLabPayloadResponse {

    /**
     * A unique identifier for the client performing the mutation.
     */
     String getClientMutationId();

    /**
     * Errors encountered during execution of the mutation.
     */
    List<String> getErrors();
}
