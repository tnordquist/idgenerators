package edu.cnm.deepdive.idgenerators;

import edu.cnm.deepdive.idgenerators.model.entity.Employee;
import edu.cnm.deepdive.idgenerators.model.entity.repos.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class IdgeneratorsApplicationTests {

  @Autowired
  EmployeeRepository er;

  @Test
  void testCreateEmploye() {

    Employee employee = new Employee();
    employee.setName("John");
    er.save(employee);
  }

}
