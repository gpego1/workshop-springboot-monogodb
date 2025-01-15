package org.gabrielpego.mongodbb.repository;

import org.gabrielpego.mongodbb.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository <User, String> {

}
