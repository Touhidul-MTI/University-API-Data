package io.github.imtilab.university;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class University {
	
	@Id
	private String id;
	private String universityName;
	private String universityType;
	private String universityLocation;
	
	public University() {
	}

	public University(String id, String universityName, String universityType, String universityLocation) {
		super();
		this.id = id;
		this.universityName = universityName;
		this.universityType = universityType;
		this.universityLocation = universityLocation;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityType() {
		return universityType;
	}

	public void setUniversityType(String universityType) {
		this.universityType = universityType;
	}

	public String getUniversityLocation() {
		return universityLocation;
	}

	public void setUniversityLocation(String universityLocation) {
		this.universityLocation = universityLocation;
	}
	
	
}
