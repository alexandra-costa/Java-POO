package br.com.startaideia.rental.repository;

import br.com.startaideia.rental.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}