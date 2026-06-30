package org.example.exceptionhandelinign1.respository;

import org.example.exceptionhandelinign1.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserInfo,String> {
}
