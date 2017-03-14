package com.pedroaugust8.usercrud;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author Pedro Barros
 */
public interface UserDaoMongo extends MongoRepository<User, String> {
}
