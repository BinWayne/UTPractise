package com.utdemo.json;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.IOException;
@SpringBootTest(classes = FooTest.class)
@JsonTest
public class FooTest  extends AbstractTestNGSpringContextTests{
	
	@Autowired
 JacksonTester<Foo> json;
	
	
  @Test
  public void f() throws IOException {
	  Foo details = new Foo( 12,"Honda");
	  assertThat(this.json.write(details)).hasJsonPathStringValue("@.name");
	  //assertThat(this.json.write(details)).isEqualToJson("expected.json");
  }
  
  @Test
  public void testDeserialize() throws Exception {
    String content = "{\"name\":\"Ford\",\"age\":13}";
    Foo actual = this.json.parseObject(content);
    assertThat(actual).isEqualTo(new Foo(13, "Ford"));
    assertThat(actual.getName()).isEqualTo("Ford");
    assertThat(actual.getAge()).isEqualTo(13);
 
  }
}
