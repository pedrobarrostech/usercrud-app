package com.pedroaugust8.usercrud;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

/**
 * @author Pedro Barros
 */
@RestController
@RequestMapping("/users")
public class UserRest {
    private final UserRepository userRepository;

    @Inject
    public UserRest(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<User> list() {
        return userRepository.list();
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody User user) {
        userRepository.save(user);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") final String id) {
        userRepository.delete(id);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public User get(@PathVariable("id") final String id) {
        return userRepository.get(id);
    }
}