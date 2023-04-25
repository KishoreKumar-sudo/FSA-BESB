package com.codewithkishore.fullstackbackend.repository;

import com.codewithkishore.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
