package com.ed.dessertmangement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ed.dessertmangement.entity.Menu;



@Repository
public interface MenuRepository extends JpaRepository<Menu,Integer> {

}
