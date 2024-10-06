package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "employees")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee extends Person {

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "branch_id")
    private Branch branch;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_imagen")
    private Image employeeImage;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_user")
    private EmployeeUser employeeUser;

}
