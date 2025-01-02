package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

/**
 * State of a GitLab iteration
 */
@Name("IterationState")
public enum IterationState {

    /**
     * Upcoming iteration.
     */
    upcoming,
    /**
     * Current iteration.
     */
    current,
    /**
     * Open iteration.
     */
    opened,
    /**
     * Closed iteration.
     */
    closed,
    /**
     * Any iteration.
     */
    all;

}
