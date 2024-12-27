package com.yuns.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeatherApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void assertTest() {
		assertEquals(1, 1);
		assertNull(null);
		assertTrue(1 == 1);
	}

}
