package com.ed.dessertmangement.service;

import java.util.List;

import com.ed.dessertmangement.entity.Menu;



public interface DessertService {
	Menu craeteMenu(Menu s);
	Menu updateMenu(Menu s);
	List<Menu>getAllMenu();
	Menu getMenuById(int id);
	void deleteMenu(int id);
}
