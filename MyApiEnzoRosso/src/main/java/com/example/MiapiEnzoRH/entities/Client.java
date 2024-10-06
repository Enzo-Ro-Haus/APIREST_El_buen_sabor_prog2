package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "clients")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Client extends Person{

    @ManyToMany
    @JoinTable(name = "client_address",
    joinColumns = @JoinColumn(name = "client_id"),
    inverseJoinColumns = @JoinColumn(name = "address_id"))
    @Builder.Default
    private Set<Address> addresses = new HashSet<>();

    @OneToOne
    @JoinColumn(name = "client_image")
    private Image clientImage;

    @OneToOne
    @JoinColumn(name = "client_user")
    private ClientUser clientUser;
}
