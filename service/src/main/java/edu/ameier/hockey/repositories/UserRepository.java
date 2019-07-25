package edu.ameier.hockey.repositories;

import edu.ameier.hockey.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
