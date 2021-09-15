package com.farukyilmaz.spring.boot.rest.api.repositories;

import com.farukyilmaz.spring.boot.rest.api.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{
}
