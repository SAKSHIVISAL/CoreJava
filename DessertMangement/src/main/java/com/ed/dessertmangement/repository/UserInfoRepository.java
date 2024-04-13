package com.ed.dessertmangement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ed.dessertmangement.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Integer> {

}
