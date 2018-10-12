package com.stackroute.service;

import com.stackroute.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserService {
    public User saveUser(User user);
    public List<User> getallUsers();

}
