package com.codecool.emualapitvany.repository;

import com.codecool.emualapitvany.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
