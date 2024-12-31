package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

/**
 * List limit metric setting
 */
@Name("ListLimitMetric")
public enum ListLimitMetric {

    /**
     * Limit list by number and total weight of issues.
     */
    all_metrics,
    /**
     * Limit list by number of issues.
     */
    issue_count,
    /**
     * Limit list by total weight of issues.
     */
    issue_weights;

}
