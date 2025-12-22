package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("MergeRequest")
public class MergeRequest implements Todoable {

    /**
     * ID of the merge request.
     */
    private String id;

    /**
     * Title of the merge request.
     */
    private String title;

    /**
     * Web URL of the merge request.
     */
    private String webUrl;

    public String getId() {
        return id;
    }

    public MergeRequest setId(String id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public MergeRequest setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public MergeRequest setWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, webUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        MergeRequest other = (MergeRequest) obj;
        return Objects.equals(id, other.id) && Objects.equals(title, other.title) && Objects.equals(webUrl, other.webUrl);
    }

    @Override
    public String toString() {
        return "MergeRequest [id=" + id + ", title=" + title + ", webUrl=" + webUrl + "]";
    }

}
