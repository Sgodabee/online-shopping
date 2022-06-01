package com.Sgodabee.onlineshopping.service;

import com.Sgodabee.onlineshopping.model.User;

public interface UserService {

    boolean saveUser(User user);

    User findUserByEmail(String email);

}
