package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

/**
 * Current state of milestone
 */
@Name("MilestoneStateEnum")
public enum MilestoneStateEnum {

    /**
     * Milestone is currently active.
     */
    active,
    /**
     * Milestone is closed.
     */
    closed;

}
