package io.github.imtilab.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.github.imtilab.university.University;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping("/universities/{universityId}/departments")
	public List<Department> getAllDepartments(@PathVariable String universityId){
		return departmentService.getAllDepartments(universityId);
	}
	
	@RequestMapping("/universities/{universityId}/departments/{departmentName}")
	public Department getDepartment(@PathVariable String departmentName) {
		return departmentService.getDepartment(departmentName);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/universities/{universityId}/departments")
	public void addDepartment(@RequestBody Department department, @PathVariable String universityId) {
		
		department.setUniversity(new University(universityId,"","",""));
		
		departmentService.addDepartment(department);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/universities/{universityId}/departments/{departmentName}")
	public void updateDepartment(@RequestBody Department department, @PathVariable String universityId, @PathVariable String departmentName) {
		department.setUniversity(new University(universityId,"","",""));
		departmentService.updateDepartment(department);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/universities/{universityId}/departments/{departmentName}")
	public void deleteDepartment(@PathVariable String departmentName) {
		departmentService.deleteDepartment(departmentName);
	}

}
