package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents an epic board
 */
@Name("EpicBoard")
public class EpicBoard {

    /**
     * Whether or not display epic colors.
     */
    private Boolean displayColors;

    /**
     * Whether or not backlog list is hidden.
     */
    private Boolean hideBacklogList;

    /**
     * Whether or not closed list is hidden.
     */
    private Boolean hideClosedList;

    /**
     * Global ID of the epic board.
     */
    private BoardsEpicBoardID id;

    /**
     * Labels of the board.
     */
    private LabelConnection labels;

    /**
     * Epic board lists.
     */
    private EpicListConnection lists;

    /**
     * Name of the epic board.
     */
    private String name;

    /**
     * Web URL of the epic board.
     */
    private String webUrl;

    public Boolean getDisplayColors() {
        return displayColors;
    }

    public EpicBoard setDisplayColors(Boolean displayColors) {
        this.displayColors = displayColors;
        return this;
    }

    public Boolean getHideBacklogList() {
        return hideBacklogList;
    }

    public EpicBoard setHideBacklogList(Boolean hideBacklogList) {
        this.hideBacklogList = hideBacklogList;
        return this;
    }

    public Boolean getHideClosedList() {
        return hideClosedList;
    }

    public EpicBoard setHideClosedList(Boolean hideClosedList) {
        this.hideClosedList = hideClosedList;
        return this;
    }

    public BoardsEpicBoardID getId() {
        return id;
    }

    public EpicBoard setId(BoardsEpicBoardID id) {
        this.id = id;
        return this;
    }

    public LabelConnection getLabels() {
        return labels;
    }

    public EpicBoard setLabels(LabelConnection labels) {
        this.labels = labels;
        return this;
    }

    public EpicListConnection getLists() {
        return lists;
    }

    public EpicBoard setLists(EpicListConnection lists) {
        this.lists = lists;
        return this;
    }

    public String getName() {
        return name;
    }

    public EpicBoard setName(String name) {
        this.name = name;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public EpicBoard setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "EpicBoard";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"EpicBoard".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(displayColors, hideBacklogList, hideClosedList, id, labels, lists, name, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EpicBoard other = (EpicBoard) obj;
        return Objects.equals(displayColors, other.displayColors) && Objects.equals(hideBacklogList, other.hideBacklogList) && Objects.equals(hideClosedList, other.hideClosedList) && Objects.equals(id, other.id) && Objects.equals(labels, other.labels) && Objects.equals(lists, other.lists) && Objects.equals(name, other.name) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "EpicBoard [displayColors=" + displayColors + ", hideBacklogList=" + hideBacklogList + ", hideClosedList=" + hideClosedList + ", id=" + id + ", labels=" + labels + ", lists=" + lists + ", name=" + name + ", webUrl=" + webUrl + "]";
    }

}
