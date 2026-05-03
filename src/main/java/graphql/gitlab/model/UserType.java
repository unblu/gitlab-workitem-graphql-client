package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

/**
 * Possible types of user
 */
@Name("UserType")
public enum UserType {

    /**
     * Human
     */
    HUMAN,
    /**
     * Support bot
     */
    SUPPORT_BOT,
    /**
     * Alert bot
     */
    ALERT_BOT,
    /**
     * Visual review bot
     */
    VISUAL_REVIEW_BOT,
    /**
     * Service user
     */
    SERVICE_USER,
    /**
     * Ghost
     */
    GHOST,
    /**
     * Project bot
     */
    PROJECT_BOT,
    /**
     * Security bot
     */
    SECURITY_BOT,
    /**
     * Automation bot
     */
    AUTOMATION_BOT,
    /**
     * Security policy bot
     */
    SECURITY_POLICY_BOT,
    /**
     * Admin bot
     */
    ADMIN_BOT,
    /**
     * Service account
     */
    SERVICE_ACCOUNT,
    /**
     * Placeholder
     */
    PLACEHOLDER,
    /**
     * Duo code review bot
     */
    DUO_CODE_REVIEW_BOT,
    /**
     * Import user
     */
    IMPORT_USER;

}
