package graphql.gitlab;

import java.util.List;

public interface GitLabPayloadResponse {
    /**
     * Errors encountered during execution of the mutation.
     */
    List<String> getErrors();
}
