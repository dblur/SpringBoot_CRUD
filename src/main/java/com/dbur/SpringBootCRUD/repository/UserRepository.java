package com.dbur.SpringBootCRUD.repository;

import com.dbur.SpringBootCRUD.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
