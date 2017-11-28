package io.github.imtilab.department;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends CrudRepository<Department, String>{
	
	public List<Department> findByUniversityId(String universityId);

}
