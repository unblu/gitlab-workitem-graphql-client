package graphql.gitlab.model;

import java.util.Objects;

import org.eclipse.microprofile.graphql.Name;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Time represented in ISO 8601.
 *
 * For example: "2021-03-09T14:58:50+00:00".
 *
 * See `https://www.iso.org/iso-8601-date-and-time-format.html`.
 */
@Name("Time")
public class Time {

    private String value;

    @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
    public Time(@JsonProperty("value") String value) {
        this.value = value;
    }

    public static Time valueOf(String value) {
        return new Time(value);
    }

    @Override
    @JsonValue
    public String toString() {
        return value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Time other = (Time) obj;
        return Objects.equals(value, other.value);
    }
}
