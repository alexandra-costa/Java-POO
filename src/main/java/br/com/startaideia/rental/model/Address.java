package br.com.startaideia.rental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 80)
    private String street;

    @Column(length = 40)
    private String district;

    @Column(length = 15)
    private String number;

    private String complement;

    @Column(length = 2)
    private String state;

    private String city;

    @OneToOne
    private Users user;

}
