package com.spring.estudos.user_crud.controller;

import com.spring.estudos.user_crud.model.User;
import com.spring.estudos.user_crud.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getall() {return userService.getAll();}

    @PostMapping
    public User create(@RequestBody User user) {return userService.save(user);}

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) { userService.deleteById(id);}

    @PutMapping("/{id}")
    public ResponseEntity<User> update(
            @PathVariable Long id,
            @RequestBody User user){

        User updateUser = userService.update(id, user);
        return ResponseEntity.ok(updateUser);
    }
}
