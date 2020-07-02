package com.codecool.emufoundation.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.codecool.emufoundation.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
