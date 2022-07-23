package com.thymleaf.ThymeleafDemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.thymleaf.ThymeleafDemo.model.User;

import java.util.List;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(String name);

}
