package utils.indexed.pojo.model;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

public class IndexedPojoTypeAdapterFactory implements TypeAdapterFactory {
    public IndexedPojoTypeAdapterFactory() { }
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {

        if (!IndexedPojo.class.isAssignableFrom(type.getRawType())) {
            return null;
        }


        @SuppressWarnings("unchecked")
        TypeAdapter<IndexedPojo> delegate = (TypeAdapter<IndexedPojo>) gson.getDelegateAdapter(this, type);

        @SuppressWarnings("unchecked")
        TypeAdapter<T> adapter = (TypeAdapter<T>) new TypeAdapter<IndexedPojo>() {
            @Override
            public void write(JsonWriter out, IndexedPojo value) throws IOException {
                delegate.write(out, value);
            }

            @Override
            public IndexedPojo read(JsonReader in) throws IOException {

                JsonObject jsonObject = JsonParser.parseReader(in).getAsJsonObject();

                IndexedPojo value = delegate.fromJsonTree(jsonObject);
                value.setKeySet(jsonObject);
                return value;
            }
        };

        return adapter;
    }
}
