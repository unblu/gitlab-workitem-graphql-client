package graphql.gitlab.api;

import java.util.List;

import org.eclipse.microprofile.graphql.Id;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.NonNull;
import org.eclipse.microprofile.graphql.Query;
import org.eclipse.microprofile.graphql.Source;

import graphql.gitlab.model.AwardEmojiAddInput;
import graphql.gitlab.model.AwardEmojiAddPayload;
import graphql.gitlab.model.CreateNoteInput;
import graphql.gitlab.model.CreateNotePayload;
import graphql.gitlab.model.DestroyNoteInput;
import graphql.gitlab.model.DestroyNotePayload;
import graphql.gitlab.model.Group;
import graphql.gitlab.model.Namespace;
import graphql.gitlab.model.NotesFilterType;
import graphql.gitlab.model.Project;
import graphql.gitlab.model.UpdateNoteInput;
import graphql.gitlab.model.UpdateNotePayload;
import graphql.gitlab.model.WorkItem;
import graphql.gitlab.model.WorkItemAddLinkedItemsInput;
import graphql.gitlab.model.WorkItemAddLinkedItemsPayload;
import graphql.gitlab.model.WorkItemConnection;
import graphql.gitlab.model.WorkItemCreateInput;
import graphql.gitlab.model.WorkItemCreatePayload;
import graphql.gitlab.model.WorkItemID;
import graphql.gitlab.model.WorkItemRemoveLinkedItemsInput;
import graphql.gitlab.model.WorkItemRemoveLinkedItemsPayload;
import graphql.gitlab.model.WorkItemUpdateInput;
import graphql.gitlab.model.WorkItemUpdatePayload;
import io.smallrye.graphql.client.typesafe.api.GraphQLClientApi;
import io.smallrye.graphql.client.typesafe.api.NestedParameter;

@GraphQLClientApi(configKey = "gitlab")
public interface WorkitemClientApi {

    /**
     * Find a group.
     */
    @Query("group")
    Group group(@Name("fullPath") @NonNull @Id String fullPath, @NestedParameter("labels") @Name("includeAncestorGroups") boolean labelsIncludeAncestorGroups, @NestedParameter("labels") @Name("after") String labelsAfter);

    /**
     * Find a namespace.
     */
    @Query("namespace")
    Namespace namespace(@Name("fullPath") @NonNull @Id String fullPath);

    /**
     * Find a project.
     */
    @Query("project")
    Project project(@Name("fullPath") @NonNull @Id String fullPath, @NestedParameter("labels") @Name("includeAncestorGroups") boolean labelsIncludeAncestorGroups, @NestedParameter("labels") @Name("after") String labelsAfter);

    /**
     * Find a work item. Introduced in GitLab 15.1: **Status**: Experiment.
     */
    @Query("workItem")
    WorkItem workItem(@Name("id") @NonNull WorkItemID id);

    /**
     * Find work items by their reference. Introduced in GitLab 16.7: **Status**: Experiment.
     */
    @Query("workItemsByReference")
    WorkItemConnection workItemsByReference(@Name("contextNamespacePath") @Id String contextNamespacePath, @Name("refs") @NonNull List<@NonNull String> refs, @NestedParameter("nodes.widgets.discussions") @Name("filter") NotesFilterType filter);

    @Mutation("awardEmojiAdd")
    AwardEmojiAddPayload awardEmojiAdd(@Name("input") @NonNull @Source AwardEmojiAddInput input);

    /**
     * Creates a Note.
     * If the body of the Note contains only quick actions,
     * the Note will be destroyed during an update, and no Note will be
     * returned.
     */
    @Mutation("createNote")
    CreateNotePayload createNote(@Name("input") @NonNull @Source CreateNoteInput input);

    @Mutation("destroyNote")
    DestroyNotePayload destroyNote(@Name("input") @NonNull @Source DestroyNoteInput input);

    /**
     * Updates a Note.
     * If the body of the Note contains only quick actions,
     * the Note will be destroyed during an update, and no Note will be
     * returned.
     */
    @Mutation("updateNote")
    UpdateNotePayload updateNote(@Name("input") @NonNull @Source UpdateNoteInput input);

    /**
     * Add linked items to the work item. Introduced in GitLab 16.3: **Status**: Experiment.
     */
    @Mutation("workItemAddLinkedItems")
    WorkItemAddLinkedItemsPayload workItemAddLinkedItems(@Name("input") @NonNull @Source WorkItemAddLinkedItemsInput input);

    /**
     * Creates a work item. Introduced in GitLab 15.1: **Status**: Experiment.
     */
    @Mutation("workItemCreate")
    WorkItemCreatePayload workItemCreate(@Name("input") @NonNull @Source WorkItemCreateInput input);

    /**
     * Remove items linked to the work item. Introduced in GitLab 16.3: **Status**: Experiment.
     */
    @Mutation("workItemRemoveLinkedItems")
    WorkItemRemoveLinkedItemsPayload workItemRemoveLinkedItems(@Name("input") @NonNull @Source WorkItemRemoveLinkedItemsInput input);

    /**
     * Updates a work item by Global ID. Introduced in GitLab 15.1: **Status**: Experiment.
     */
    @Mutation("workItemUpdate")
    WorkItemUpdatePayload workItemUpdate(@Name("input") @NonNull @Source WorkItemUpdateInput input);

}
