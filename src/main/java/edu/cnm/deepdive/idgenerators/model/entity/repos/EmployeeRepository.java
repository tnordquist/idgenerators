package edu.cnm.deepdive.idgenerators.model.entity.repos;

import edu.cnm.deepdive.idgenerators.model.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {



}
