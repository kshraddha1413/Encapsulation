package Employee;

public class Employee {
	private String fName;
	private String lName;
	private int age;
	private String departmentType;
	private String skill;

	public Employee(String fName, String lName, int age, String departmentType, String skill) {

		this.fName = fName;
		this.lName = lName;
		this.age = age;
		this.departmentType = departmentType;
		this.skill = skill;

	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setDepartmentType(String departmentType) {
		this.departmentType = departmentType;
	}

	public void setSkill(String skill) {
		if (skill.equalsIgnoreCase("computer")) {
			this.skill = skill;
		} else {
			System.out.println("employee skills not mathed");
		}
	}

}
