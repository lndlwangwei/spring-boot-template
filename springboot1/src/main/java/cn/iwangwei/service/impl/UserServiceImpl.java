package cn.iwangwei.service.impl;

import cn.iwangwei.model.User;
import cn.iwangwei.repository.UserRepository;
import cn.iwangwei.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    @Transactional
    public boolean addUser() {
        User user = new User();
        user.setId(1001);
        user.setUsername("wangwei112");
        user.setFullname("wangwei123412341242");
        user.setMobile("11234123412342");
        userRepository.save(user);
        return true;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
