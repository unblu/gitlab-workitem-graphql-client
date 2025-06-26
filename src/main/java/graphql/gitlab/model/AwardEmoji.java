package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An emoji awarded by a user
 */
@Name("AwardEmoji")
public class AwardEmoji {

    /**
     * Emoji name.
     */
    private String name;

    /**
     * Emoji in Unicode.
     */
    private String unicode;

    /**
     * Unicode version for the emoji.
     */
    private String unicodeVersion;

    public String getName() {
        return name;
    }

    public AwardEmoji setName(String name) {
        this.name = name;
        return this;
    }

    public String getUnicode() {
        return unicode;
    }

    public AwardEmoji setUnicode(String unicode) {
        this.unicode = unicode;
        return this;
    }

    public String getUnicodeVersion() {
        return unicodeVersion;
    }

    public AwardEmoji setUnicodeVersion(String unicodeVersion) {
        this.unicodeVersion = unicodeVersion;
        return this;
    }

    @JsonProperty("__typename")
    public String getTypename() {
        return "AwardEmoji";
    }

    @JsonProperty("__typename")
    public void setTypename(String type) {
        //Setter only for Jackson
        if(!"AwardEmoji".equals(type)) {
            throw new IllegalArgumentException("Unexpected '__typename' value: " + type);
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, unicode, unicodeVersion);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AwardEmoji other = (AwardEmoji) obj;
        return Objects.equals(name, other.name) && Objects.equals(unicode, other.unicode) && Objects.equals(unicodeVersion, other.unicodeVersion);
    }

    @Override
    public String toString() {
        return "AwardEmoji [name=" + name + ", unicode=" + unicode + ", unicodeVersion=" + unicodeVersion + "]";
    }

}
