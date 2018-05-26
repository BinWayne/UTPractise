package com.example.utdemo;

import static org.testng.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

@SpringBootTest(classes = GenericService.class)
public class GenericServiceTest extends AbstractTestNGSpringContextTests{

	@Autowired
	private GenericService genericService;
  @Test
  public void getMessage() {
   assertEquals(genericService.getMessage(), "Hello JavaChen-dev");
  }
}
