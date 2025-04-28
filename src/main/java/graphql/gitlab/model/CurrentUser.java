package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * The currently authenticated GitLab user.
 */
@Name("CurrentUser")
public class CurrentUser implements Todoable {

    /**
     * Global ID of the user.
     */
    private UserID id;

    /**
     * To-do items of the user.
     */
    private TodoConnection todos;

    /**
     * Username of the user. Unique within the instance of GitLab.
     */
    private String username;

    public UserID getId() {
        return id;
    }

    public CurrentUser setId(UserID id) {
        this.id = id;
        return this;
    }

    public TodoConnection getTodos() {
        return todos;
    }

    public CurrentUser setTodos(TodoConnection todos) {
        this.todos = todos;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public CurrentUser setUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, todos, username);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CurrentUser other = (CurrentUser) obj;
        return Objects.equals(id, other.id) && Objects.equals(todos, other.todos) && Objects.equals(username, other.username);
    }

    @Override
    public String toString() {
        return "CurrentUser [id=" + id + ", todos=" + todos + ", username=" + username + "]";
    }

}
