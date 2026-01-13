package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

/**
 * Different toggles for changing mutator behavior
 */
@Name("MutationOperationMode")
public enum MutationOperationMode {

    /**
     * Performs a replace operation.
     */
    REPLACE,
    /**
     * Performs an append operation.
     */
    APPEND,
    /**
     * Performs a removal operation.
     */
    REMOVE;

}
