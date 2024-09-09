package ntd.calculator.service;

import ntd.calculator.domain.User;
import ntd.calculator.domain.UserStatus;

import java.util.List;

public interface UserService {

    User findByUsername(String username);

    User findByUsernameAndStatus(String username, UserStatus userStatus);

    List<User> findByStatus(UserStatus userStatus);
}
