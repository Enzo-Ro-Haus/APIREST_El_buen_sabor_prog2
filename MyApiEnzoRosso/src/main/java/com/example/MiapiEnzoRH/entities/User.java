package com.example.MiapiEnzoRH.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends Base{
    @Column(name = "auth_id")
    private String authoID;

    @Column(name = "user_name")
    private String userName;

}
