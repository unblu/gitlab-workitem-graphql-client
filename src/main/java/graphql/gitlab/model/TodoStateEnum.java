package graphql.gitlab.model;

import org.eclipse.microprofile.graphql.Name;

@Name("TodoStateEnum")
public enum TodoStateEnum {

    /**
     * State of the todo is pending.
     */
    pending,
    /**
     * State of the todo is done.
     */
    done;

}
