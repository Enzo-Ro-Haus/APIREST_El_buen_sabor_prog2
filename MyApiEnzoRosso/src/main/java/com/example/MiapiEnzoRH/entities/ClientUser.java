package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client_users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientUser extends User{

    @OneToOne
    @JoinColumn(name = "client")
    private Client client;
}
