package com.spring.estudos.user_crud.service;

import com.spring.estudos.user_crud.model.User;
import com.spring.estudos.user_crud.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAll() {return userRepository.findAll();}

    public User save (User user) {return userRepository.save(user);}

    public void deleteById (Long id) {userRepository.deleteById(id);}
}
