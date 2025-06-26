package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.smallrye.graphql.api.Union;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

@Union
@JsonbTypeInfo(key = "__typename", value = {
        @JsonbSubtype(alias = "WorkItemWidgetAssignees", type = WorkItemWidgetAssignees.class),
        @JsonbSubtype(alias = "WorkItemWidgetAwardEmoji", type = WorkItemWidgetAwardEmoji.class),
        @JsonbSubtype(alias = "WorkItemWidgetColor", type = WorkItemWidgetColor.class),
        @JsonbSubtype(alias = "WorkItemWidgetCrmContacts", type = WorkItemWidgetCrmContacts.class),
        @JsonbSubtype(alias = "WorkItemWidgetCurrentUserTodos", type = WorkItemWidgetCurrentUserTodos.class),
        @JsonbSubtype(alias = "WorkItemWidgetCustomFields", type = WorkItemWidgetCustomFields.class),
        @JsonbSubtype(alias = "WorkItemWidgetDescription", type = WorkItemWidgetDescription.class),
        @JsonbSubtype(alias = "WorkItemWidgetDesigns", type = WorkItemWidgetDesigns.class),
        @JsonbSubtype(alias = "WorkItemWidgetDevelopment", type = WorkItemWidgetDevelopment.class),
        @JsonbSubtype(alias = "WorkItemWidgetEmailParticipants", type = WorkItemWidgetEmailParticipants.class),
        @JsonbSubtype(alias = "WorkItemWidgetErrorTracking", type = WorkItemWidgetErrorTracking.class),
        @JsonbSubtype(alias = "WorkItemWidgetHealthStatus", type = WorkItemWidgetHealthStatus.class),
        @JsonbSubtype(alias = "WorkItemWidgetHierarchy", type = WorkItemWidgetHierarchy.class),
        @JsonbSubtype(alias = "WorkItemWidgetIteration", type = WorkItemWidgetIteration.class),
        @JsonbSubtype(alias = "WorkItemWidgetLabels", type = WorkItemWidgetLabels.class),
        @JsonbSubtype(alias = "WorkItemWidgetLinkedItems", type = WorkItemWidgetLinkedItems.class),
        @JsonbSubtype(alias = "WorkItemWidgetLinkedResources", type = WorkItemWidgetLinkedResources.class),
        @JsonbSubtype(alias = "WorkItemWidgetMilestone", type = WorkItemWidgetMilestone.class),
        @JsonbSubtype(alias = "WorkItemWidgetNotes", type = WorkItemWidgetNotes.class),
        @JsonbSubtype(alias = "WorkItemWidgetNotifications", type = WorkItemWidgetNotifications.class),
        @JsonbSubtype(alias = "WorkItemWidgetParticipants", type = WorkItemWidgetParticipants.class),
        @JsonbSubtype(alias = "WorkItemWidgetProgress", type = WorkItemWidgetProgress.class),
        @JsonbSubtype(alias = "WorkItemWidgetRequirementLegacy", type = WorkItemWidgetRequirementLegacy.class),
        @JsonbSubtype(alias = "WorkItemWidgetStartAndDueDate", type = WorkItemWidgetStartAndDueDate.class),
        @JsonbSubtype(alias = "WorkItemWidgetStatus", type = WorkItemWidgetStatus.class),
        @JsonbSubtype(alias = "WorkItemWidgetTestReports", type = WorkItemWidgetTestReports.class),
        @JsonbSubtype(alias = "WorkItemWidgetTimeTracking", type = WorkItemWidgetTimeTracking.class),
        @JsonbSubtype(alias = "WorkItemWidgetVerificationStatus", type = WorkItemWidgetVerificationStatus.class),
        @JsonbSubtype(alias = "WorkItemWidgetVulnerabilities", type = WorkItemWidgetVulnerabilities.class),
        @JsonbSubtype(alias = "WorkItemWidgetWeight", type = WorkItemWidgetWeight.class)
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__typename")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "WorkItemWidgetAssignees", value = WorkItemWidgetAssignees.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetAwardEmoji", value = WorkItemWidgetAwardEmoji.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetColor", value = WorkItemWidgetColor.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetCrmContacts", value = WorkItemWidgetCrmContacts.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetCurrentUserTodos", value = WorkItemWidgetCurrentUserTodos.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetCustomFields", value = WorkItemWidgetCustomFields.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetDescription", value = WorkItemWidgetDescription.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetDesigns", value = WorkItemWidgetDesigns.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetDevelopment", value = WorkItemWidgetDevelopment.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetEmailParticipants", value = WorkItemWidgetEmailParticipants.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetErrorTracking", value = WorkItemWidgetErrorTracking.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetHealthStatus", value = WorkItemWidgetHealthStatus.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetHierarchy", value = WorkItemWidgetHierarchy.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetIteration", value = WorkItemWidgetIteration.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetLabels", value = WorkItemWidgetLabels.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetLinkedItems", value = WorkItemWidgetLinkedItems.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetLinkedResources", value = WorkItemWidgetLinkedResources.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetMilestone", value = WorkItemWidgetMilestone.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetNotes", value = WorkItemWidgetNotes.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetNotifications", value = WorkItemWidgetNotifications.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetParticipants", value = WorkItemWidgetParticipants.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetProgress", value = WorkItemWidgetProgress.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetRequirementLegacy", value = WorkItemWidgetRequirementLegacy.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetStartAndDueDate", value = WorkItemWidgetStartAndDueDate.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetStatus", value = WorkItemWidgetStatus.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetTestReports", value = WorkItemWidgetTestReports.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetTimeTracking", value = WorkItemWidgetTimeTracking.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetVerificationStatus", value = WorkItemWidgetVerificationStatus.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetVulnerabilities", value = WorkItemWidgetVulnerabilities.class),
        @JsonSubTypes.Type(name = "WorkItemWidgetWeight", value = WorkItemWidgetWeight.class)
})
@Name("WorkItemWidget")
public interface WorkItemWidget {
}
