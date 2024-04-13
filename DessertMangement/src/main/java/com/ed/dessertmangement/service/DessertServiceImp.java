package com.ed.dessertmangement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ed.dessertmangement.entity.Menu;
import com.ed.dessertmangement.exception.MenuResource;
import com.ed.dessertmangement.repository.MenuRepository;





@Service
public class DessertServiceImp implements DessertService{
	@Autowired
	MenuRepository repo;

	@Override
	public Menu craeteMenu(Menu s) {
		return repo.save(s);
	}

	@Override
	public Menu updateMenu(Menu s) {
		Optional<Menu>menu=repo.findById(s.getId());
		if(menu.isPresent()) {
			Menu updatestudent=menu.get();
			updatestudent.setId(s.getId());
			updatestudent.setMenu(s.getMenu());
			updatestudent.setPrice(s.getPrice());	
			
			return updateMenu(null);
			
			
		}
		else {
			throw new MenuResource("Searching is not avaliable");
		}
	}

	@Override
	public List<Menu> getAllMenu() {
		return repo.findAll();
	}

	@Override
	public Menu getMenuById(int id) {
		Optional<Menu>menu=repo.findById(id);
		if(menu.isPresent()) {
			return menu.get();
		}
		else {
			throw new MenuResource("Searching is not avaliable");
		}
	}
	

	@Override
	public void deleteMenu(int id) {
		Optional<Menu>menu=repo.findById(id);
		if(menu.isPresent()) {
		repo.delete(menu.get());;
		}
		else {
			throw new MenuResource("Searching is not avaliable");
		}
		
	}
		
	}

	
	

	