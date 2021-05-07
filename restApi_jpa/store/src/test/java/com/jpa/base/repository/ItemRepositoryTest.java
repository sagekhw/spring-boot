package com.jpa.base.repository;

import com.jpa.base.BaseApplicationTests;
import com.jpa.base.entity.Item;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.Optional;

public class ItemRepositoryTest extends BaseApplicationTests {

    @Autowired
    private ItemRepository itemRepository;

    @Test
    public void create(){

        Item item = Item.builder()
                .name("Laptop")
                .price(1000000)
                .content("HP Laptop")
                .build();

        Item newItem = itemRepository.save(item);
        System.out.println(newItem);
    }


    @Test
    public void read(){
        Long id = 1L;
        Optional<Item> item = itemRepository.findById(id);

        item.ifPresent(selectItem ->{
            System.out.println("selectItem : "+selectItem);
        });

    }
}
