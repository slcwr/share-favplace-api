package com.pandaman.sharefavplaceapi.service;

import com.pandaman.sharefavplaceapi.entity.User;
import com.pandaman.sharefavplaceapi.repository.UserRepository;

import dto.CreateDTO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;



public interface UserService {

    
    /**
     * ユーザー全件取得
     *
     * @return List<User>
     */

    List<User> findAll();

    List<User> saveAll(List<User> users);
        
}

