package app.com.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.com.desafio.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  User findByEmail(String email);
}
