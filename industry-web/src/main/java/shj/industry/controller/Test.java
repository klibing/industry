package shj.industry.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, JsonProcessingException {
		/*Method method = Test.class.getMethod("main", String[].class);
		for(final Parameter parameter : method.getParameters()) {
			System.out.println(parameter.isNamePresent());
			System.out.println("paramerName:" + parameter.getName());
			Clock clock = Clock.systemDefaultZone();
			System.out.println(clock.instant());
		}
		Function<String, Integer> f = (s) -> Integer.parseInt(s);
		System.out.println(f.apply("12"));*/
		UserModel um = new UserModel("libing", "李冰", "18600780461");
		ObjectMapper om = new ObjectMapper();
		System.out.println(om.writeValueAsString(um));
		
	}
	
}
