package pw.parallelworld.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pw.parallelworld.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
