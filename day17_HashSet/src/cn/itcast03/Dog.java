package cn.itcast03;

public class Dog {
	private String name;
	private String coloe;
	private int age;
	private String sex;
	public Dog(String name, String coloe, int age, String sex) {
		super();
		this.name = name;
		this.coloe = coloe;
		this.age = age;
		this.sex = sex;
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColoe() {
		return coloe;
	}
	public void setColoe(String coloe) {
		this.coloe = coloe;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((coloe == null) ? 0 : coloe.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sex == null) ? 0 : sex.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (age != other.age)
			return false;
		if (coloe == null) {
			if (other.coloe != null)
				return false;
		} else if (!coloe.equals(other.coloe))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sex == null) {
			if (other.sex != null)
				return false;
		} else if (!sex.equals(other.sex))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", coloe=" + coloe + ", age=" + age + ", sex=" + sex + "]";
	}	
}
