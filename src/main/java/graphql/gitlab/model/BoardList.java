package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents a list for an issue board
 */
@Name("BoardList")
public class BoardList {

    /**
     * ID (global ID) of the list.
     */
    private ListID id;

    /**
     * Label of the list.
     */
    private Label label;

    /**
     * Type of the list.
     */
    private String listType;

    /**
     * Position of list within the board.
     */
    private Integer position;

    /**
     * Title of the list.
     */
    private String title;

    public ListID getId() {
        return id;
    }

    public BoardList setId(ListID id) {
        this.id = id;
        return this;
    }

    public Label getLabel() {
        return label;
    }

    public BoardList setLabel(Label label) {
        this.label = label;
        return this;
    }

    public String getListType() {
        return listType;
    }

    public BoardList setListType(String listType) {
        this.listType = listType;
        return this;
    }

    public Integer getPosition() {
        return position;
    }

    public BoardList setPosition(Integer position) {
        this.position = position;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public BoardList setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, label, listType, position, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BoardList other = (BoardList) obj;
        return Objects.equals(id, other.id) && Objects.equals(label, other.label) && Objects.equals(listType, other.listType) && Objects.equals(position, other.position) && Objects.equals(title, other.title);
    }

    @Override
    public String toString() {
        return "BoardList [id=" + id + ", label=" + label + ", listType=" + listType + ", position=" + position + ", title=" + title + "]";
    }

}
