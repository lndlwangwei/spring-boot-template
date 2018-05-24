package cn.iwangwei.service;

import cn.iwangwei.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    boolean addUser();
}
