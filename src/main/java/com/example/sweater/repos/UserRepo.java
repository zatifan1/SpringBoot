package com.example.sweater.repos;

import com.example.sweater.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

//для работы с базой данных
public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);//поиск по имени;
}
