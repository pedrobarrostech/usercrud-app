package com.pedroaugust8.usercrud;

/**
 * @author Pedro Barros
 */
public interface UserRepository {
    Iterable<User> list();

    User get(String id);

    void save(User user);

    void delete(String id);
}
