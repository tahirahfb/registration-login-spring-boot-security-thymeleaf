package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springboot.model.*;

/*JPA Repository exposes database CRUD operations on User entity, 
need to pass type of primary key (id, which is type Long) as a second argument*/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
