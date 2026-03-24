package com.rafaelfelix.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rafaelfelix.web_services.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
