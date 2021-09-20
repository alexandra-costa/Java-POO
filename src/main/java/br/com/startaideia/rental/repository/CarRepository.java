package br.com.startaideia.rental.repository;

import br.com.startaideia.rental.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}