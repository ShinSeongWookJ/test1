package day09;
//도메인 객체 (VO-Value Object, DTO-Data Transfer Object)
public class R2_9_Person {
	
	private String name;
	private int age;
	
	public R2_9_Person() {
		this("아무개",1);
	}
	public R2_9_Person(String n, int a) {
		name=n; age=a;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}///////////////////////////////
