package com.life.imt.repository;

import org.springframework.data.repository.CrudRepository;
import com.life.imt.entity.*;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}