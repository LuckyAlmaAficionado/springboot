package com.railway.belajarrailway.service;

import com.railway.belajarrailway.model.Users;
import com.railway.belajarrailway.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersService {

    @Autowired
    UsersRepository repository;

    public List<Users> getUsers() {
        return repository.findAll();
    }

    public Users register(Users users) {
        return repository.save(users);
    }
}
