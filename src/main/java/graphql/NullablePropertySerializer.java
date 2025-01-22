package graphql;

import jakarta.json.JsonValue;
import jakarta.json.bind.serializer.JsonbSerializer;
import jakarta.json.bind.serializer.SerializationContext;
import jakarta.json.stream.JsonGenerator;

public class NullablePropertySerializer<T> implements JsonbSerializer<NullableProperty<T>> {
    @Override
    public void serialize(NullableProperty<T> obj, JsonGenerator generator, SerializationContext ctx) {
        if (obj.isPresent()) {
            ctx.serialize(obj.get(), generator);
        } else {
            generator.write(JsonValue.NULL);
        }
    }
}
