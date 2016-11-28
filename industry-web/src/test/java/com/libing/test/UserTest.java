package com.libing.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.springframework.web.client.RestTemplate;

import junit.framework.Assert;

public class UserTest {

	private static final RestTemplate template = new RestTemplate();
	private static final String url = "http://localhost:8080/industry-web/v1/user/{id}";
	
	@Test
	public void testToJson() {
		Map<String, Object> map = new HashMap<>();
		map.put("id", 8);
		String user = template.getForObject(url, String.class, map);
		System.out.println(user);
		Assert.assertNotNull(user);
	}

}
