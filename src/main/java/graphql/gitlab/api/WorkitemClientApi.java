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
import graphql.gitlab.model.BoardID;
import graphql.gitlab.model.BoardList;
import graphql.gitlab.model.BoardListCreateInput;
import graphql.gitlab.model.BoardListCreatePayload;
import graphql.gitlab.model.BoardsEpicBoardID;
import graphql.gitlab.model.BoardsEpicListID;
import graphql.gitlab.model.CreateBoardInput;
import graphql.gitlab.model.CreateBoardPayload;
import graphql.gitlab.model.CreateNoteInput;
import graphql.gitlab.model.CreateNotePayload;
import graphql.gitlab.model.CurrentUser;
import graphql.gitlab.model.DestroyBoardInput;
import graphql.gitlab.model.DestroyBoardListInput;
import graphql.gitlab.model.DestroyBoardListPayload;
import graphql.gitlab.model.DestroyBoardPayload;
import graphql.gitlab.model.DestroyEpicBoardInput;
import graphql.gitlab.model.DestroyEpicBoardPayload;
import graphql.gitlab.model.DestroyNoteInput;
import graphql.gitlab.model.DestroyNotePayload;
import graphql.gitlab.model.EpicBoardCreateInput;
import graphql.gitlab.model.EpicBoardCreatePayload;
import graphql.gitlab.model.EpicBoardListCreateInput;
import graphql.gitlab.model.EpicBoardListCreatePayload;
import graphql.gitlab.model.EpicBoardListDestroyInput;
import graphql.gitlab.model.EpicBoardListDestroyPayload;
import graphql.gitlab.model.EpicBoardUpdateInput;
import graphql.gitlab.model.EpicBoardUpdatePayload;
import graphql.gitlab.model.EpicList;
import graphql.gitlab.model.Group;
import graphql.gitlab.model.GroupContainingEpicBoards;
import graphql.gitlab.model.GroupContainingIssueBoards;
import graphql.gitlab.model.GroupContainingSingleEpicBoard;
import graphql.gitlab.model.GroupContainingSingleIssueBoard;
import graphql.gitlab.model.ListID;
import graphql.gitlab.model.MergeRequest;
import graphql.gitlab.model.MergeRequestID;
import graphql.gitlab.model.Namespace;
import graphql.gitlab.model.NotesFilterType;
import graphql.gitlab.model.Project;
import graphql.gitlab.model.ProjectContainingIssueBoards;
import graphql.gitlab.model.ProjectContainingSingleIssueBoard;
import graphql.gitlab.model.TodoMarkDoneInput;
import graphql.gitlab.model.TodoMarkDonePayload;
import graphql.gitlab.model.UpdateBoardInput;
import graphql.gitlab.model.UpdateBoardListInput;
import graphql.gitlab.model.UpdateBoardListPayload;
import graphql.gitlab.model.UpdateBoardPayload;
import graphql.gitlab.model.UpdateEpicBoardListInput;
import graphql.gitlab.model.UpdateEpicBoardListPayload;
import graphql.gitlab.model.UpdateNoteInput;
import graphql.gitlab.model.UpdateNotePayload;
import graphql.gitlab.model.WorkItem;
import graphql.gitlab.model.WorkItemAddLinkedItemsInput;
import graphql.gitlab.model.WorkItemAddLinkedItemsPayload;
import graphql.gitlab.model.WorkItemConnection;
import graphql.gitlab.model.WorkItemCreateInput;
import graphql.gitlab.model.WorkItemCreatePayload;
import graphql.gitlab.model.WorkItemDeleteInput;
import graphql.gitlab.model.WorkItemDeletePayload;
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
     * Find an issue board list.
     */
    @Query("boardList")
    BoardList getIssueBoardList(@Name("id") @NonNull ListID id);

    /**
     * Get information about current user.
     */
    @Query("currentUser")
    CurrentUser getCurrentUserTodos(@NestedParameter("todos") @Name("after") String todosAfter);

    @Query("epicBoardList")
    EpicList getEpicBoardList(@Name("id") @NonNull BoardsEpicListID id);

    /**
     * Find a group.
     */
    @Query("group")
    Group group(@Name("fullPath") @NonNull @Id String fullPath, @NestedParameter("labels") @Name("includeAncestorGroups") boolean labelsIncludeAncestorGroups, @NestedParameter("labels") @Name("includeDescendantGroups") boolean labelsIncludeDescendantGroups, @NestedParameter("labels") @Name("onlyGroupLabels") boolean labelsOnlyGroupLabels, @NestedParameter("labels") @Name("after") String labelsAfter);

    @Query("group")
    GroupContainingSingleIssueBoard getIssueBoardInGroup(@Name("fullPath") @NonNull @Id String fullPath, @NestedParameter("board") @Name("id") @NonNull BoardID boardId);

    @Query("group")
    GroupContainingSingleEpicBoard getEpicBoardInGroup(@Name("fullPath") @NonNull @Id String fullPath, @NestedParameter("epicBoard") @Name("id") @NonNull BoardsEpicBoardID boardId);

    @Query("group")
    GroupContainingIssueBoards getIssueBoardsInGroup(@Name("fullPath") @NonNull @Id String fullPath);

    @Query("group")
    GroupContainingEpicBoards getEpicBoardsInGroup(@Name("fullPath") @NonNull @Id String fullPath);

    /**
     * Find a merge request.
     */
    @Query("mergeRequest")
    MergeRequest getMergeRequest(@Name("id") @NonNull MergeRequestID id);

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

    @Query("project")
    ProjectContainingSingleIssueBoard getIssueBoardInProject(@Name("fullPath") @NonNull @Id String fullPath, @NestedParameter("board") @Name("id") @NonNull BoardID boardId);

    @Query("project")
    ProjectContainingIssueBoards getIssueBoardsInProject(@Name("fullPath") @NonNull @Id String fullPath);

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

    @Mutation("boardListCreate")
    BoardListCreatePayload createIssueBoardList(@Name("input") @NonNull @Source BoardListCreateInput input);

    @Mutation("createBoard")
    CreateBoardPayload createIssueBoard(@Name("input") @NonNull @Source CreateBoardInput input);

    /**
     * Creates a Note.<br>
     * If the body of the Note contains only quick actions,<br>
     * the Note will be destroyed during an update, and no Note will be<br>
     * returned.
     */
    @Mutation("createNote")
    CreateNotePayload createNote(@Name("input") @NonNull @Source CreateNoteInput input);

    @Mutation("destroyBoard")
    DestroyBoardPayload deleteIssueBoard(@Name("input") @NonNull @Source DestroyBoardInput input);

    @Mutation("destroyBoardList")
    DestroyBoardListPayload deleteIssueBoardList(@Name("input") @NonNull @Source DestroyBoardListInput input);

    @Mutation("destroyEpicBoard")
    DestroyEpicBoardPayload deleteEpicBoard(@Name("input") @NonNull @Source DestroyEpicBoardInput input);

    @Mutation("destroyNote")
    DestroyNotePayload destroyNote(@Name("input") @NonNull @Source DestroyNoteInput input);

    @Mutation("epicBoardCreate")
    EpicBoardCreatePayload createEpicBoard(@Name("input") @NonNull @Source EpicBoardCreateInput input);

    @Mutation("epicBoardListCreate")
    EpicBoardListCreatePayload createEpicBoardList(@Name("input") @NonNull @Source EpicBoardListCreateInput input);

    /**
     * Destroys an epic board list. Deprecated in GitLab 17.5: Replaced by WorkItem type.
     */
    @Mutation("epicBoardListDestroy")
    EpicBoardListDestroyPayload deleteEpicBoardList(@Name("input") @NonNull @Source EpicBoardListDestroyInput input);

    @Mutation("epicBoardUpdate")
    EpicBoardUpdatePayload updateEpicBoard(@Name("input") @NonNull @Source EpicBoardUpdateInput input);

    @Mutation("todoMarkDone")
    TodoMarkDonePayload todoMarkDone(@Name("input") @NonNull @Source TodoMarkDoneInput input);

    @Mutation("updateBoard")
    UpdateBoardPayload updateIssueBoard(@Name("input") @NonNull @Source UpdateBoardInput input);

    @Mutation("updateBoardList")
    UpdateBoardListPayload updateIssueBoardList(@Name("input") @NonNull @Source UpdateBoardListInput input);

    @Mutation("updateEpicBoardList")
    UpdateEpicBoardListPayload updateEpicBoardList(@Name("input") @NonNull @Source UpdateEpicBoardListInput input);

    /**
     * Updates a Note.<br>
     * If the body of the Note contains only quick actions,<br>
     * the Note will be destroyed during an update, and no Note will be<br>
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
     * Deletes a work item. Introduced in GitLab 15.1: **Status**: Experiment.
     */
    @Mutation("workItemDelete")
    WorkItemDeletePayload workItemDelete(@Name("input") @NonNull @Source WorkItemDeleteInput input);

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
