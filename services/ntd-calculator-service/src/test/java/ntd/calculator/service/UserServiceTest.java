package ntd.calculator.service;

import ntd.calculator.domain.User;
import ntd.calculator.enums.UserStatus;
import ntd.calculator.repository.UserRepository;
import ntd.calculator.service.impl.UserServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    private final User activeUser = new User();

    private final User inactiveUser = new User();

    @BeforeEach
    void setup() {
        activeUser.setId(1L);
        activeUser.setUsername("oscar.santamaria@ntdsoftware.com");
        activeUser.setPassword("testPassword");
        activeUser.setStatus(UserStatus.ACTIVE);
        activeUser.setBalance(new BigDecimal(5000));

        inactiveUser.setId(2L);
        inactiveUser.setUsername("nayla.corteguera@ntdsoftware.com");
        inactiveUser.setPassword("testPassword");
        inactiveUser.setStatus(UserStatus.INACTIVE);
        inactiveUser.setBalance(new BigDecimal(5000));
    }

    @Test
    void findByUsernameTest() {
        String username = "oscar.santamaria@ntdsoftware.com";
        given(userRepository.findByUsername(username)).willReturn(activeUser);
        User existingUser = userService.findByUsername(username);
        assertThat(existingUser).isNotNull();
    }

    @Test
    void findByUsernameAndStatusTest() {
        String activeUsername = "oscar.santamaria@ntdsoftware.com";
        String inactiveUsername = "nayla.corteguera@ntdsoftware.com";

        given(userRepository.findByUsernameAndStatus(activeUsername, UserStatus.ACTIVE))
                .willReturn(activeUser);
        given(userRepository.findByUsernameAndStatus(inactiveUsername, UserStatus.INACTIVE))
                .willReturn(inactiveUser);

        assertThat(userService.findByUsernameAndStatus(activeUsername, UserStatus.ACTIVE))
                .isNotNull();
        assertThat(userService.findByUsernameAndStatus(inactiveUsername, UserStatus.INACTIVE))
                .isNotNull();
    }

    @Test
    void saveUserTest() {
        given(userRepository.save(activeUser)).willReturn(activeUser);
        assertThat(userService.save(activeUser)).isNotNull();
    }

}
