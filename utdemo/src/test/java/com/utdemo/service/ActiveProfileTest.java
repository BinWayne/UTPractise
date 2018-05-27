package com.utdemo.service;

import static org.testng.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
//@ContextConfiguration(classes = GenericService.class)
@SpringBootTest(classes = GenericService.class)
public class ActiveProfileTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private GenericService genericService;
  @Test
  public void getMessage() {
	  assertEquals(genericService.getMessage(), "Hello abc");
  }
}
