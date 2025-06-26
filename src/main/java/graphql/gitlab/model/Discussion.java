package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

@Name("Discussion")
public class Discussion {

    /**
     * ID of the discussion.
     */
    private DiscussionID id;

    /**
     * All notes in the discussion.
     */
    private NoteConnection notes;

    public DiscussionID getId() {
        return id;
    }

    public Discussion setId(DiscussionID id) {
        this.id = id;
        return this;
    }

    public NoteConnection getNotes() {
        return notes;
    }

    public Discussion setNotes(NoteConnection notes) {
        this.notes = notes;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "Discussion";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"Discussion".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, notes);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Discussion other = (Discussion) obj;
        return Objects.equals(id, other.id) && Objects.equals(notes, other.notes);
    }

    @Override
    public String toString() {
        return "Discussion [id=" + id + ", notes=" + notes + "]";
    }

}
