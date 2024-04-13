package com.ed.dessertmangement.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="skill")
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
	
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private long orderId;
		@Column(name="item_name")
		private String itemName;
		@Column(name="qty")
		private String qty;
	

}
