package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

/**
 * Represents an epic board list
 */
@Name("EpicList")
public class EpicList {

    /**
     * Indicates if this list is collapsed for this user.
     */
    private Boolean collapsed;

    /**
     * Global ID of the board list.
     */
    private BoardsEpicListID id;

    /**
     * Label of the list.
     */
    private Label label;

    /**
     * Type of the list.
     */
    private String listType;

    /**
     * Position of the list within the board.
     */
    private Integer position;

    /**
     * Title of the list.
     */
    private String title;

    public Boolean getCollapsed() {
        return collapsed;
    }

    public EpicList setCollapsed(Boolean collapsed) {
        this.collapsed = collapsed;
        return this;
    }

    public BoardsEpicListID getId() {
        return id;
    }

    public EpicList setId(BoardsEpicListID id) {
        this.id = id;
        return this;
    }

    public Label getLabel() {
        return label;
    }

    public EpicList setLabel(Label label) {
        this.label = label;
        return this;
    }

    public String getListType() {
        return listType;
    }

    public EpicList setListType(String listType) {
        this.listType = listType;
        return this;
    }

    public Integer getPosition() {
        return position;
    }

    public EpicList setPosition(Integer position) {
        this.position = position;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public EpicList setTitle(String title) {
        this.title = title;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(collapsed, id, label, listType, position, title);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EpicList other = (EpicList) obj;
        return Objects.equals(collapsed, other.collapsed) && Objects.equals(id, other.id) && Objects.equals(label, other.label) && Objects.equals(listType, other.listType) && Objects.equals(position, other.position) && Objects.equals(title, other.title);
    }

    @Override
    public String toString() {
        return "EpicList [collapsed=" + collapsed + ", id=" + id + ", label=" + label + ", listType=" + listType + ", position=" + position + ", title=" + title + "]";
    }

}
