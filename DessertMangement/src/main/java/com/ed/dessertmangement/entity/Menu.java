package com.ed.dessertmangement.entity;


	import java.util.HashSet;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
	import lombok.AllArgsConstructor;
	import lombok.Data;
	import lombok.NoArgsConstructor;
	@Entity
	@Table(name="Dessert")
	@Data
	@AllArgsConstructor
	@NoArgsConstructor
	public class Menu {
		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
		@Column(name="Menu")
	private String Menu;
		@Column(name="Price")
	private int Price;
		@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "menu") 
		private Set<Menu> menus = new HashSet<>(); 
		@Override 
		public String toString() { 
		return "Menu [id=" + id + ", Menu=" + Menu + ", Price=" + Price + "]";
		

	}
	}

