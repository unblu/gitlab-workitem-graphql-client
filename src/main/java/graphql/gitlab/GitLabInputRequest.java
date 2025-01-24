package graphql.gitlab;

public interface GitLabInputRequest {
    /**
     * A unique identifier for the client performing the mutation.
     */
     String getClientMutationId();

     Object setClientMutationId(String clientMutationId);
}
