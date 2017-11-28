package io.github.imtilab.department;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.github.imtilab.university.University;

@Entity
public class Department {
	
	@Id
	private String departmentName;
	private int numberOfStudents;
	private int numberOfFacultyMembers;
	
	@ManyToOne
	private University university;
	
	public Department() {
	}
	
	public Department(String departmentName, int numberOfStudents, int numberOfFacultyMembers, String universityId) {
		super();
		this.departmentName = departmentName;
		this.numberOfStudents = numberOfStudents;
		this.numberOfFacultyMembers = numberOfFacultyMembers;
		this.university = new University(universityId, "", "","");
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}
	public int getNumberOfFacultyMembers() {
		return numberOfFacultyMembers;
	}
	public void setNumberOfFacultyMembers(int numberOfFacultyMembers) {
		this.numberOfFacultyMembers = numberOfFacultyMembers;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}
	
}
