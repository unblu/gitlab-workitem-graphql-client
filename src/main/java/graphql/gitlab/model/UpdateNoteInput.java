package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Autogenerated input type of UpdateNote
 */
@Name("UpdateNoteInput")
public class UpdateNoteInput {

    /**
     * Global ID of the note to update.
     */
    private NoteID id;
    /**
     * Content of the note.
     */
    private String body;

    public NoteID getId() {
        return id;
    }

    public UpdateNoteInput setId(NoteID id) {
        this.id = id;
        return this;
    }

    public String getBody() {
        return body;
    }

    public UpdateNoteInput setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, body);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        UpdateNoteInput other = (UpdateNoteInput) obj;
        return Objects.equals(id, other.id) && Objects.equals(body, other.body);
    }

    @Override
    public String toString() {
        return "UpdateNoteInput [id=" + id + ", body=" + body + "]";
    }

}