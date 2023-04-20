package com.isthifa.multithreading.repository;

import com.isthifa.multithreading.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface userRepo extends JpaRepository<User, Integer> {
}
