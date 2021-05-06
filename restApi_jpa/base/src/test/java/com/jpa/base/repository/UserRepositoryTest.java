package com.jpa.base.repository;

import com.jpa.base.BaseApplicationTests;
import com.jpa.base.entity.Item;
import com.jpa.base.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;


public class UserRepositoryTest extends BaseApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
//    @Transactional
    public void create(){
        User user = User.builder()
                .account("Test01")
                .password("1234")
                .email("Test01@gmail.com")
                .phone_number("010-1111-1111")
                .created_at(LocalDateTime.now())
                .created_by("admin")
                .build();
        User newUser = userRepository.save(user);
        System.out.println(newUser);
    }

    @Test
    @Transactional
    public void read(){
        Optional<User> user = userRepository.findById(2L);
        user.ifPresent(selectUser ->{
            selectUser.getOrderDetailList().stream().forEach(detail -> {
                Item item = detail.getItem();
                System.out.println(item);

            });
            System.out.println("user : "+selectUser);
        });

    }

    @Test
//    @Transactional
    public void update(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser ->{
            selectUser.setAccount("Test_edit_1");
            selectUser.setUpdated_at(LocalDateTime.now());

            userRepository.save(selectUser);
        });

    }

    @Test
//    @Transactional
    public void delete(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser ->{
            userRepository.delete(selectUser);
        });
//        Optional<User> delete_user = userRepository.findById(2L);

    }

}