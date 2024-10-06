package com.example.MiapiEnzoRH.entities;

import com.example.MiapiEnzoRH.entities.enums.PaymentMethod;
import com.example.MiapiEnzoRH.entities.enums.ShippingType;
import com.example.MiapiEnzoRH.entities.enums.State;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "orders")
//@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order extends Base{

@Column(name = "estimated_completion_time")
private LocalTime estimatedCompletionTime;
@Column(name = "total")
private Double total;
@Column(name = "total_cost")
private Double totalCost;
@Column(name = "state")
private State state;
@Column(name = "shipping_type")
private ShippingType shippingType;
@Column(name = "payment_method")
private PaymentMethod paymentMethod;
@Column(name = "order_date")
private LocalDate orderDate;

@ManyToOne
@JoinColumn(name = "client_id")
    private Client client;

@ManyToOne
@JoinColumn(name = "employee_id")
private Employee employee;

@ManyToOne
@JoinColumn(name = "branch_id")
private Branch branch;

@OneToOne
@JoinColumn(name = "bill_id")
private Bill bill;

}

