package com.api.taller.programacion.worktallerprogramacionmysqlapirest.services;

import com.api.taller.programacion.worktallerprogramacionmysqlapirest.model.UserModel;
import com.api.taller.programacion.worktallerprogramacionmysqlapirest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<UserModel> getUsers() {
        return (List<UserModel>) userRepository.findAll();
    };

//  Optional porque puede que exista o no
    public Optional<UserModel> getUserById(UserModel user) {
        return userRepository.findById(user.getId());
    }

    public void insertUser(UserModel user) {
        userRepository.save(user);
    };

    public void deleteUserById(UserModel user) {
        userRepository.deleteById(user.getId());
    }
}
