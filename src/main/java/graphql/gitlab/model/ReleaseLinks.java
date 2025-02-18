package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

@Name("ReleaseLinks")
public class ReleaseLinks {

    /**
     * HTTP URL of the release.
     */
    private String selfUrl;

    public String getSelfUrl() {
        return selfUrl;
    }

    public ReleaseLinks setSelfUrl(String selfUrl) {
        this.selfUrl = selfUrl;
        return this;
    }

    @Override
    public int hashCode() {
        return Objects.hash(selfUrl);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        ReleaseLinks other = (ReleaseLinks) obj;
        return Objects.equals(selfUrl, other.selfUrl);
    }

    @Override
    public String toString() {
        return "ReleaseLinks [selfUrl=" + selfUrl + "]";
    }

}
