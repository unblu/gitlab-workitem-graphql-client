package graphql;

import java.util.Objects;
import java.util.Optional;

public class NullableProperty<T> {
    private final T value;

    private NullableProperty(T value) {
        this.value = value;
    }

    public static <T> NullableProperty<T> of(T value) {
        if (value == null) {
            throw new IllegalArgumentException("Use NullableProperty.empty() for null values");
        }
        return new NullableProperty<>(value);
    }

    public static <T> NullableProperty<T> ofNullable(T value) {
        return new NullableProperty<>(value);
    }

    public static <T> NullableProperty<T> empty() {
        return new NullableProperty<>(null);
    }

    public Optional<T> getOptional() {
        return Optional.ofNullable(value);
    }

    public T get() {
        return value;
    }

    public boolean isPresent() {
        return value != null;
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
        NullableProperty<?> other = (NullableProperty<?>) obj;
        return Objects.equals(value, other.value);
    }

    @Override
    public String toString() {
        return "NullableProperty [value=" + value + "]";
    }
}
