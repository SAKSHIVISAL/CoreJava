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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="student")
@Data
@AllArgsConstructor
@RequiredArgsConstructor

public class UserInfo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long SrNo;
	@Column(name="User_name")
	private String UserName;
	@Column(name="Phone_no")
	private long  phone_No;
	@Column(name="Address")
	private String Address;
	@ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL) 
	@JoinTable(name="Dessert_UserInfo",
	joinColumns= {@JoinColumn(name="userName")},
	inverseJoinColumns= {@JoinColumn(name="SrNo")}
)
	private Set<Menu>UserInfo=new HashSet<Menu>();
}

	


