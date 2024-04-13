package com.ed.dessertmangement.repository;



import org.springframework.data.jpa.repository.JpaRepository;


import com.ed.dessertmangement.entity.Menu;
import com.ed.dessertmangement.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Integer>{
	Menu findBySkillName(String string);
}
