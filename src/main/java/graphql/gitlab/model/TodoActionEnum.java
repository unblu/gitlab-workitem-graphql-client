package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

@Name("TodoActionEnum")
public enum TodoActionEnum {

    /**
     * Todo action name for assigned.
     */
    assigned,
    /**
     * Todo action name for review_requested.
     */
    review_requested,
    /**
     * Todo action name for mentioned.
     */
    mentioned,
    /**
     * Todo action name for build_failed.
     */
    build_failed,
    /**
     * Todo action name for marked.
     */
    marked,
    /**
     * Todo action name for approval_required.
     */
    approval_required,
    /**
     * Todo action name for unmergeable.
     */
    unmergeable,
    /**
     * Todo action name for directly_addressed.
     */
    directly_addressed,
    /**
     * Todo action name for member_access_requested.
     */
    member_access_requested,
    /**
     * Todo action name for review_submitted.
     */
    review_submitted,
    /**
     * Todo action name for ssh_key_expired.
     */
    ssh_key_expired,
    /**
     * Todo action name for ssh_key_expiring_soon.
     */
    ssh_key_expiring_soon,
    /**
     * Todo action name for merge_train_removed.
     */
    merge_train_removed,
    /**
     * Todo action name for okr_checkin_requested.
     */
    okr_checkin_requested,
    /**
     * Todo action name for added_approver.
     */
    added_approver,
    /**
     * Todo action name for duo_pro_access_granted.
     */
    duo_pro_access_granted,
    /**
     * Todo action name for duo_enterprise_access_granted.
     */
    duo_enterprise_access_granted,
    /**
     * Todo action name for duo_core_access_granted.
     */
    duo_core_access_granted;

}
