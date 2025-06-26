package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import io.smallrye.graphql.api.Union;
import jakarta.json.bind.annotation.JsonbSubtype;
import jakarta.json.bind.annotation.JsonbTypeInfo;

@Union
@JsonbTypeInfo(key = "__typename", value = {
        @JsonbSubtype(alias = "CurrentUser", type = CurrentUser.class),
        @JsonbSubtype(alias = "Group", type = Group.class),
        @JsonbSubtype(alias = "Namespace", type = Namespace.class),
        @JsonbSubtype(alias = "Project", type = Project.class),
        @JsonbSubtype(alias = "UserCore", type = UserCore.class),
        @JsonbSubtype(alias = "WorkItem", type = WorkItem.class)
})
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "__typename")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "CurrentUser", value = CurrentUser.class),
        @JsonSubTypes.Type(name = "Group", value = Group.class),
        @JsonSubTypes.Type(name = "Namespace", value = Namespace.class),
        @JsonSubTypes.Type(name = "Project", value = Project.class),
        @JsonSubTypes.Type(name = "UserCore", value = UserCore.class),
        @JsonSubTypes.Type(name = "WorkItem", value = WorkItem.class)
})
@Name("Todoable")
public interface Todoable {
}
