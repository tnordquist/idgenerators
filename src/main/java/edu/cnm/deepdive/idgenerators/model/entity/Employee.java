package edu.cnm.deepdive.idgenerators.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {

  @Id
//  @TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName = "gen_name", valueColumnName = "gen_val", allocationSize = 100)
//  @GeneratedValue(strategy = GenerationType.TABLE,generator = "employee_gen")
  @GenericGenerator(name = "employee_id", strategy = "edu.cnm.deepdive.idgenerators.CustomRandomIDGenerator")
  @GeneratedValue(generator = "employee_id")
  private Long id;

  private String name;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
