package ntd.calculator.repository;

import ntd.calculator.domain.User;
import ntd.calculator.domain.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

    User findByUsernameAndStatus(String username, UserStatus userStatus);

    List<User> findByStatus(UserStatus userStatus);

}
