package com.example.MiapiEnzoRH.entities;

import com.example.MiapiEnzoRH.entities.enums.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Data
public abstract class Person  extends Base implements Serializable {

    protected String name;
    protected String surname;
    protected int dni;
    protected LocalDate birthday;
    protected Rol rol;
    protected String phoneNumber;
    protected String email;

    @OneToOne
    @JoinColumn(name = "image_id")
    protected Image personImage;

    @OneToOne
    @JoinColumn(name = "user_id")
    protected User user;


}
