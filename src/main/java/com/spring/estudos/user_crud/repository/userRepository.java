package com.spring.estudos.user_crud.repository;

import com.spring.estudos.user_crud.model.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user, Long> {

}
