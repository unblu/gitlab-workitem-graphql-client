package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import io.smallrye.graphql.api.Union;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

@Union
@JsonbTypeInfo(key = "__typename", value = {
        @JsonbSubtype(alias = "CurrentUser", type = CurrentUser.class),
        @JsonbSubtype(alias = "Group", type = Group.class),
        @JsonbSubtype(alias = "MergeRequest", type = MergeRequest.class),
        @JsonbSubtype(alias = "Namespace", type = Namespace.class),
        @JsonbSubtype(alias = "Project", type = Project.class),
        @JsonbSubtype(alias = "UserCore", type = UserCore.class),
        @JsonbSubtype(alias = "WorkItem", type = WorkItem.class)
})
@Name("Todoable")
public interface Todoable {
}
