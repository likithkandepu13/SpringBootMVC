package org.example.queryparams.repository;

import org.example.queryparams.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Integer>
{

    List<User> findByEmail(String email);

    List<User> findByCityAndCountry(String city, String country);
}
