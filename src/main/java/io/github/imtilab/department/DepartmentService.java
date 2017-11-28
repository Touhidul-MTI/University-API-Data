package io.github.imtilab.department;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments(String universityId) {
		List<Department> department = new ArrayList<>();
		departmentRepository.findByUniversityId(universityId).forEach(department::add);
		return department;
	}

	public Department getDepartment(String departmentName) {
		return departmentRepository.findOne(departmentName);
	}

	public void addDepartment(Department department) {
		departmentRepository.save(department);
	}

	public void updateDepartment(Department department) {
		departmentRepository.save(department);
	}

	public void deleteDepartment(String departmentName) {
		departmentRepository.delete(departmentName);
	}

}
