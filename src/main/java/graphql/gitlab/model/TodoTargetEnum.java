package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

@Name("TodoTargetEnum")
public enum TodoTargetEnum {

    /**
     * Commit.
     */
    COMMIT,
    /**
     * Issue.
     */
    ISSUE,
    /**
     * Work item.
     */
    WORKITEM,
    /**
     * Merge request.
     */
    MERGEREQUEST,
    /**
     * Design.
     */
    DESIGN,
    /**
     * Alert.
     */
    ALERT,
    /**
     * Project.
     */
    PROJECT,
    /**
     * Namespace.
     */
    NAMESPACE,
    /**
     * SSH key.
     */
    KEY,
    /**
     * Wiki page.
     */
    WIKIPAGEMETA,
    /**
     * An Epic.
     */
    EPIC,
    /**
     * User.
     */
    USER,
    /**
     * Vulnerability.
     */
    VULNERABILITY,
    /**
     * Project Compliance Violation.
     */
    COMPLIANCE_VIOLATION;

}
