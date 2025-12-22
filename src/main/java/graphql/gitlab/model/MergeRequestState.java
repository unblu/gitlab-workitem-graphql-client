package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

/**
 * State of a GitLab merge request
 */
@Name("MergeRequestState")
public enum MergeRequestState {

    /**
     * Merge request has been merged.
     */
    merged,
    /**
     * Opened merge request.
     */
    opened,
    /**
     * In closed state.
     */
    closed,
    /**
     * Discussion has been locked.
     */
    locked,
    /**
     * All available.
     */
    all;

}
