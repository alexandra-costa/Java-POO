package br.com.startaideia.rental.repository;

import br.com.startaideia.rental.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}