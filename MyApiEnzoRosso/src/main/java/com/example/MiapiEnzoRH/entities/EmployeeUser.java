package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "employees_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeUser extends User {

  @OneToOne
  @JoinColumn(name = "employee")
  private Employee employee;
}