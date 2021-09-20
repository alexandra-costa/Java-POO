package br.com.startaideia.rental.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Rent")
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "Start_Date")
    private LocalDateTime startDate;

    @Column(name = "Finish_Date")
    private LocalDateTime finishDate;

    @Column(name = "Total_Value")
    private Double totalValue;

    private String observation;

    @ManyToOne
    private Users user;

    @ManyToOne
    private Car car;
}
