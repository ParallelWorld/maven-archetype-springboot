package pw.parallelworld.archetype.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pw.parallelworld.archetype.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
