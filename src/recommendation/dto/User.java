package recommendation.dto;

import java.util.List;

public class User {

	String name;
	int age;
	String gender;
	List<String> intrest;

	public User(String name, int age, String gender, List<String> intrest) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.intrest = intrest;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getIntrest() {
		return intrest;
	}

	public void setIntrest(List<String> intrest) {
		this.intrest = intrest;
	}

	// This method is not required implemented to get good logs and check debugging.
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", gender=" + gender + ", intrest=" + intrest + "]";
	}

//	// overriding hascode to get correct result from hashmap.
//	@Override
//	public int hashCode() {
//		// generally age and name same then user could be same.
//		return (this.age * 32) + this.getName().hashCode();
//	}
//
	@Override
	public boolean equals(Object obj) {
		User toCompare = (User) obj;
		return this.age == toCompare.getAge() &&
				this.name == toCompare.getName() &&
				this.gender ==  toCompare.getGender();
	}

}
