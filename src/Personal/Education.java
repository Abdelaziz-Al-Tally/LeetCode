package Personal;

import java.util.Date;

public class Education {
	private String name;
	private String degree;
	private Date graduationDate;
	private String grade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Date getGraduationDate() {
		return graduationDate;
	}

	public void setGraduationDate(Date graduationDate) {
		this.graduationDate = graduationDate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Education{" +
				"name='" + name + '\'' +
				", degree='" + degree + '\'' +
				", graduationDate=" + graduationDate +
				", grade='" + grade + '\'' +
				'}';
	}
}
