package com.snapnet.citizensdatarecord.data.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Citizens {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @Enumerated
    private Gender gender;

    private String address;

    private String phoneNumber;

    @OneToOne
    private Wards ward;
}
