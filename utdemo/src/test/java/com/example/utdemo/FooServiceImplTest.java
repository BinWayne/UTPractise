package com.example.utdemo;

import static org.junit.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration(classes = FooServiceImpl.class)
//@SpringBootTest(classes = FooServiceImpl.class)
public class FooServiceImplTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private FooServiceImpl foo;

	
	@Test
	public void test() {
		assertEquals(foo.getCount(), 0);
		foo.plusCount();
		assertEquals(foo.getCount(), 1);
	}

}
