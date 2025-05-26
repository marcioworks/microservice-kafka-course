package com.food.ordering.system.order.service.dataaccess.order.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "order_address")
public class OrderAdressEntity {
}
