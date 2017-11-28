package io.github.imtilab.university;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UniversityController {
	
	@Autowired
	private UniversityService universityService;
	
	@RequestMapping("/universities")
	public List<University> getAllUniversities() {
		return universityService.getAllUniversities();
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/universities/{universityId}")
	public University getUniversity(@PathVariable String universityId) {
		return universityService.getUniversity(universityId);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/universities")
	public void addUniversity(@RequestBody University university) {
		universityService.addUniversity(university);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/universities/{universityId}")
	public void updateUniversity(@RequestBody University university, @PathVariable String universityId) {
		universityService.updateUniversity(university);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/universities/{universityId}")
	public void deleteUniversity(@PathVariable String universityId) {
		universityService.deleteUniversity(universityId);
	}
}
