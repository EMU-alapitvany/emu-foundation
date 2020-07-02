package com.codecool.emualapitvany.repository;

import com.codecool.emualapitvany.model.user.Admin;
import com.codecool.emualapitvany.model.user.User;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void saveOneSimple() {
        Admin john = Admin.builder()
                .firstName("John")
                .lastName("Smith")
                .username("Captain")
                .email("captain@gmail.com")
                .role("ADMIN")
                .build();
        userRepository.save(john);
        List<User> userList = userRepository.findAll();
        assertThat(userList).hasSize(1);
    }


}