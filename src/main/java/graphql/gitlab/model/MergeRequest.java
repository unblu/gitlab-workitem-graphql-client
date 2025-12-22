package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("MergeRequest")
public class MergeRequest implements Todoable {

    /**
     * Users who approved the merge request.
     */
    private UserCoreConnection approvedBy;

    /**
     * User who created the merge request.
     */
    private MergeRequestAuthor author;

    /**
     * Description of the merge request (Markdown rendered as HTML for caching).
     */
    private String description;

    /**
     * Indicates if the merge request is a draft.
     */
    private Boolean draft;

    /**
     * ID of the merge request.
     */
    private String id;

    /**
     * Labels of the merge request.
     */
    private LabelConnection labels;

    /**
     * Users from whom a review has been requested.
     */
    private MergeRequestReviewerConnection reviewers;

    /**
     * Source branch of the merge request.
     */
    private String sourceBranch;

    /**
     * State of the merge request.
     */
    private MergeRequestState state;

    /**
     * Target branch of the merge request.
     */
    private String targetBranch;

    /**
     * Title of the merge request.
     */
    private String title;

    /**
     * Web URL of the merge request.
     */
    private String webUrl;

    public UserCoreConnection getApprovedBy() {
        return approvedBy;
    }

    public MergeRequest setApprovedBy(UserCoreConnection approvedBy) {
        this.approvedBy = approvedBy;
        return this;
    }

    public MergeRequestAuthor getAuthor() {
        return author;
    }

    public MergeRequest setAuthor(MergeRequestAuthor author) {
        this.author = author;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MergeRequest setDescription(String description) {
        this.description = description;
        return this;
    }

    public Boolean getDraft() {
        return draft;
    }

    public MergeRequest setDraft(Boolean draft) {
        this.draft = draft;
        return this;
    }

    public String getId() {
        return id;
    }

    public MergeRequest setId(String id) {
        this.id = id;
        return this;
    }

    public LabelConnection getLabels() {
        return labels;
    }

    public MergeRequest setLabels(LabelConnection labels) {
        this.labels = labels;
        return this;
    }

    public MergeRequestReviewerConnection getReviewers() {
        return reviewers;
    }

    public MergeRequest setReviewers(MergeRequestReviewerConnection reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public String getSourceBranch() {
        return sourceBranch;
    }

    public MergeRequest setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    public MergeRequestState getState() {
        return state;
    }

    public MergeRequest setState(MergeRequestState state) {
        this.state = state;
        return this;
    }

    public String getTargetBranch() {
        return targetBranch;
    }

    public MergeRequest setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MergeRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public MergeRequest setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(approvedBy, author, description, draft, id, labels, reviewers, sourceBranch, state, targetBranch, title, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MergeRequest other = (MergeRequest) obj;
        return Objects.equals(approvedBy, other.approvedBy) && Objects.equals(author, other.author) && Objects.equals(description, other.description) && Objects.equals(draft, other.draft) && Objects.equals(id, other.id) && Objects.equals(labels, other.labels) && Objects.equals(reviewers, other.reviewers) && Objects.equals(sourceBranch, other.sourceBranch) && Objects.equals(state, other.state) && Objects.equals(targetBranch, other.targetBranch) && Objects.equals(title, other.title) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "MergeRequest [approvedBy=" + approvedBy + ", author=" + author + ", description=" + description + ", draft=" + draft + ", id=" + id + ", labels=" + labels + ", reviewers=" + reviewers + ", sourceBranch=" + sourceBranch + ", state=" + state + ", targetBranch=" + targetBranch + ", title=" + title + ", webUrl=" + webUrl + "]";
    }

}
