package com.isthifa.multithreading.service;

import com.isthifa.multithreading.entity.User;

public interface userService {
    void findall() throws InterruptedException;
    User save(User user) throws InterruptedException;
    void findbyid(int id) throws InterruptedException;
}
