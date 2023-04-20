package com.isthifa.multithreading.service;

import com.isthifa.multithreading.entity.User;
import com.isthifa.multithreading.repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserImpl implements userService{
    private userRepo userrepo;
    @Autowired
    public UserImpl(userRepo userrepo)
    {
        this.userrepo=userrepo;
    }
    @Override
    @Async
    public void findall() throws InterruptedException {
        System.out.println("Thread sleep started");
        Thread.sleep(1000);
        System.out.println("Thread sleep ended");
        List<User> response=userrepo.findAll();
        response.forEach(user -> {
            System.out.println("Response data ="+user.toString()+" "+Thread.currentThread().getName());
        });

    }

    @Override
    public User save(User user) throws InterruptedException {
        System.out.println(user+" "+Thread.currentThread().getName());
        Thread.sleep(1000);
        return userrepo.save(user);
    }

    @Override
    @Async
    public void findbyid(int id)  {
        Optional<User> user=userrepo.findById(id);
        System.out.println(" "+ user +" "+Thread.currentThread().getName());
    }

}
