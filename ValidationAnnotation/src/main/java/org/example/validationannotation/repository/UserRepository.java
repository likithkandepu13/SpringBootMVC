package org.example.validationannotation.repository;


import org.example.validationannotation.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUsername(String name);
}
