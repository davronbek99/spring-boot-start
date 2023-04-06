package com.example.dev.davron.springbootstart2710.repository;

import com.example.dev.davron.springbootstart2710.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUserName(String userName);

}
