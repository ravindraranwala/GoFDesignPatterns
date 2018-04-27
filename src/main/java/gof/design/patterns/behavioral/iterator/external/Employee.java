package gof.design.patterns.behavioral.iterator.external;

public class Employee {
	private final String name;
	private final int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void print() {
		System.out.println("Employee [name=" + name + ", age=" + age + "]");
	}
}
