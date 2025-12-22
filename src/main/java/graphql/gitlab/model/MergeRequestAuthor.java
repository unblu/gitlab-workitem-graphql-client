package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The author of the merge request.
 */
@Name("MergeRequestAuthor")
public class MergeRequestAuthor implements Todoable {

    /**
     * Global ID of the user.
     */
    private UserID id;

    /**
     * Type of the user.
     */
    private UserType type;

    /**
     * Username of the user. Unique within the instance of GitLab.
     */
    private String username;

    public UserID getId() {
        return id;
    }

    public MergeRequestAuthor setId(UserID id) {
        this.id = id;
        return this;
    }

    public UserType getType() {
        return type;
    }

    public MergeRequestAuthor setType(UserType type) {
        this.type = type;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MergeRequestAuthor setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, type, username);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MergeRequestAuthor other = (MergeRequestAuthor) obj;
        return Objects.equals(id, other.id) && Objects.equals(type, other.type) && Objects.equals(username, other.username);
    }

    @Override
    public String toString() {
        return "MergeRequestAuthor [id=" + id + ", type=" + type + ", username=" + username + "]";
    }

}
