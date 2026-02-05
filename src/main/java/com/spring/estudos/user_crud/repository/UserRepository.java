package com.spring.estudos.user_crud.repository;

import com.spring.estudos.user_crud.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
