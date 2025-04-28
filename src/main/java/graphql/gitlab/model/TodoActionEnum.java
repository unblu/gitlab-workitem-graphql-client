package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

@Name("TodoActionEnum")
public enum TodoActionEnum {

    /**
     * User was assigned.
     */
    assigned,
    /**
     * User was mentioned.
     */
    mentioned,
    /**
     * Build triggered by the user failed.
     */
    build_failed,
    /**
     * User added a to-do item.
     */
    marked,
    /**
     * User was set as an approver.
     */
    approval_required,
    /**
     * Merge request authored by the user could not be merged.
     */
    unmergeable,
    /**
     * User was directly addressed.
     */
    directly_addressed,
    /**
     * Merge request authored by the user was removed from the merge train.
     */
    merge_train_removed,
    /**
     * Review was requested from the user.
     */
    review_requested,
    /**
     * Group or project access requested from the user.
     */
    member_access_requested,
    /**
     * Merge request authored by the user received a review.
     */
    review_submitted,
    /**
     * An OKR assigned to the user requires an update.
     */
    okr_checkin_requested,
    /**
     * User was added as an approver.
     */
    added_approver,
    /**
     * SSH key of the user has expired.
     */
    ssh_key_expired,
    /**
     * SSH key of the user will expire soon.
     */
    ssh_key_expiring_soon,
    /**
     * Access to Duo Pro has been granted to the user.
     */
    duo_pro_access_granted,
    /**
     * Access to Duo Enterprise has been granted to the user.
     */
    duo_enterprise_access_granted;

}
