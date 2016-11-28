package shj.industry.core;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

@SuppressWarnings("serial")
public class ObjectMapper extends com.fasterxml.jackson.databind.ObjectMapper {
	private static ObjectMapper instance;
	
	public ObjectMapper() {
		super();
		this.getSerializerProvider().setNullValueSerializer(new JsonSerializer<Object>() {
			@Override
			public void serialize(Object value, JsonGenerator jg, SerializerProvider sp) throws IOException, JsonProcessingException {
				jg.writeString("");
			}
		});
	}

	public static ObjectMapper getInstance() {
		if (instance == null) {
			instance = new ObjectMapper();
		}
		return instance;
	}
}
