package com.jpa.base.entity;


import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString(exclude = {"user","item"})
public class OrderDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime order_at;

    @ManyToOne
    private User user; // user_id

    @ManyToOne
    private Item item; // item_id
}
