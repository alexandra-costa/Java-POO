package br.com.startaideia.rental.repository;

import br.com.startaideia.rental.model.Rent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Long> {
}