package me.exemplo.service;

import me.exemplo.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
