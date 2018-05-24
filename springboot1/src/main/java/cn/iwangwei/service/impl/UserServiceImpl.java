package cn.iwangwei.service.impl;

import cn.iwangwei.model.User;
import cn.iwangwei.repository.UserRepository;
import cn.iwangwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
