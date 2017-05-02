package com.stevesolution.repository;

import com.stevesolution.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by steve on 2017/5/1.
 */

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
}
