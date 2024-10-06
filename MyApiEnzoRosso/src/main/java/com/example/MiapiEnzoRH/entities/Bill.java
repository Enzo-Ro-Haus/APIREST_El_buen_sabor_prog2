package com.example.MiapiEnzoRH.entities;

import com.example.MiapiEnzoRH.entities.enums.PaymentMethod;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "bills")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Bill extends Base {

    @Column(name = "billing_date")
    private LocalDate billingDate;
    @Column(name = "mp_peyment_Id")
    private Integer mpPaymentId;
    @Column(name = "mp_merchant_Order_Id")
    private Integer mpMerchantOrderId;
    @Column(name = "mp_preference_id")
    private Integer mpPreferenceId;
    @Column(name = "mp_payment_type")
    private String mpPaymentType;
    @Column(name = "payment_method")
    private PaymentMethod paymentMethod;
    @Column(name = "total_sale")
    private Double totalSale;

    @OneToOne
    @JoinColumn(name = "order_id")
    private Order order;

}
