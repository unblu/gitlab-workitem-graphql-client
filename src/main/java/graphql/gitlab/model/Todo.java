package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Representing a to-do entry
 */
@Name("Todo")
public class Todo {

    /**
     * Action of the to-do item.
     */
    private TodoActionEnum action;

    /**
     * Body of the to-do item.
     */
    private String body;

    /**
     * Timestamp the to-do item was created.
     */
    private Time createdAt;

    /**
     * Group the to-do item is associated with.
     */
    private GroupRef group;

    /**
     * ID of the to-do item.
     */
    private TodoID id;

    /**
     * Access type of access request to-do items.
     */
    private String memberAccessType;

    /**
     * Note which created the to-do item.
     */
    private Note note;

    /**
     * Project the to-do item is associated with.
     */
    private ProjectRef project;

    /**
     * Time until when the todo is snoozed.
     */
    private Time snoozedUntil;

    /**
     * State of the to-do item.
     */
    private TodoStateEnum state;

    public TodoActionEnum getAction() {
        return action;
    }

    public Todo setAction(TodoActionEnum action) {
        this.action = action;
        return this;
    }

    public String getBody() {
        return body;
    }

    public Todo setBody(String body) {
        this.body = body;
        return this;
    }

    public Time getCreatedAt() {
        return createdAt;
    }

    public Todo setCreatedAt(Time createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public GroupRef getGroup() {
        return group;
    }

    public Todo setGroup(GroupRef group) {
        this.group = group;
        return this;
    }

    public TodoID getId() {
        return id;
    }

    public Todo setId(TodoID id) {
        this.id = id;
        return this;
    }

    public String getMemberAccessType() {
        return memberAccessType;
    }

    public Todo setMemberAccessType(String memberAccessType) {
        this.memberAccessType = memberAccessType;
        return this;
    }

    public Note getNote() {
        return note;
    }

    public Todo setNote(Note note) {
        this.note = note;
        return this;
    }

    public ProjectRef getProject() {
        return project;
    }

    public Todo setProject(ProjectRef project) {
        this.project = project;
        return this;
    }

    public Time getSnoozedUntil() {
        return snoozedUntil;
    }

    public Todo setSnoozedUntil(Time snoozedUntil) {
        this.snoozedUntil = snoozedUntil;
        return this;
    }

    public TodoStateEnum getState() {
        return state;
    }

    public Todo setState(TodoStateEnum state) {
        this.state = state;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, body, createdAt, group, id, memberAccessType, note, project, snoozedUntil, state);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Todo other = (Todo) obj;
        return Objects.equals(action, other.action) && Objects.equals(body, other.body) && Objects.equals(createdAt, other.createdAt) && Objects.equals(group, other.group) && Objects.equals(id, other.id) && Objects.equals(memberAccessType, other.memberAccessType) && Objects.equals(note, other.note) && Objects.equals(project, other.project) && Objects.equals(snoozedUntil, other.snoozedUntil) && Objects.equals(state, other.state);
    }

    @Override
    public String toString() {
        return "Todo [action=" + action + ", body=" + body + ", createdAt=" + createdAt + ", group=" + group + ", id=" + id + ", memberAccessType=" + memberAccessType + ", note=" + note + ", project=" + project + ", snoozedUntil=" + snoozedUntil + ", state=" + state + "]";
    }

}
