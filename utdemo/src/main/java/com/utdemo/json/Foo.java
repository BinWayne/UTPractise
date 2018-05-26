package com.utdemo.json;

import org.springframework.stereotype.Component;

@Component
public class Foo {

	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Foo(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public Foo() {
		
	}
	@Override
	  public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;

	    Foo foo = (Foo) o;

	    if (age != foo.age) return false;
	    return name != null ? name.equals(foo.name) : foo.name == null;
	  }

	  @Override
	  public int hashCode() {
	    int result = name != null ? name.hashCode() : 0;
	    result = 31 * result + age;
	    return result;
	  }
}
