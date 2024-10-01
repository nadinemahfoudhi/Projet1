package org.example.projet1.Repository;
import org.example.projet1.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRep extends JpaRepository<User,String> {
}
