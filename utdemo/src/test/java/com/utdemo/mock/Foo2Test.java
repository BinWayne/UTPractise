package com.utdemo.mock;

import static org.mockito.Mockito.when;
import static org.testng.Assert.assertEquals;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockitoTestExecutionListener;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
//@ContextConfiguration(classes = Foo2.class)
@SpringBootTest(classes = Foo2.class)
@TestExecutionListeners(listeners = MockitoTestExecutionListener.class)
public class Foo2Test extends AbstractTestNGSpringContextTests{

	@MockBean
	private Bar bar;
	 @Autowired
	  private Foo2 loo;
	
  @Test
  public void getMessage() {
	 
   when(bar.getAllCodes()).thenReturn(Collections.singleton("123"));
   assertEquals(loo.checkCodeDuplicate("123"), true);
  }
}
