package io.github.imtilab.university;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UniversityService {
	
	@Autowired
	private UniversityRepository universityRepository;
	
	public List<University> getAllUniversities(){
		List<University> universities = new ArrayList<>();
		
		universityRepository.findAll().forEach(universities::add);
		return universities;
	}

	public University getUniversity(String universityId) {
		return universityRepository.findOne(universityId);
	}

	public void addUniversity(University university) {
		universityRepository.save(university);
	}

	public void updateUniversity(University university) {
		universityRepository.save(university);
	}

	public void deleteUniversity(String universityId) {
		universityRepository.delete(universityId);
	}
}
