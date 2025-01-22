package graphql;

import java.lang.reflect.Type;

import jakarta.json.JsonValue;
import jakarta.json.bind.serializer.DeserializationContext;
import jakarta.json.bind.serializer.JsonbDeserializer;
import jakarta.json.stream.JsonParser;

public class NullablePropertyDeserializer<T> implements JsonbDeserializer<NullableProperty<T>> {

    @Override
    public NullableProperty<T> deserialize(JsonParser parser, DeserializationContext ctx, Type rtType) {
        JsonValue value = parser.getValue();
        if (value == JsonValue.NULL) {
            return NullableProperty.empty();
        } else {
            T deserializedValue = ctx.deserialize(rtType, parser);
            return NullableProperty.of(deserializedValue);
        }
    }
}
