package br.com.startaideia.rental.model;

import br.com.startaideia.rental.model.Enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 50)
    private String name;

    @Column(length = 50, unique = true, nullable = false)
    private String email;

    @Column(length = 11, unique = true, nullable = false)
    private String cpf;

    @Column(length = 15)
    private String phone;

    private GenderEnum gender;

    private Date birth;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private Address address;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private Rent rent;


}
