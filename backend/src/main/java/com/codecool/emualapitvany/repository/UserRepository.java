package java.com.codecool.emualapitvany.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.com.codecool.emualapitvany.model.user.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
