package br.com.startaideia.rental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String model;

    private String brand;

    private String color;

    private String plate;

    private String chasi;

    @Column(length = 4)
    private Integer year;

    @OneToMany(mappedBy = "car", cascade = CascadeType.ALL)
    private Rent rent;

}
