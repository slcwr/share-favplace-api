package com.pandaman.sharefavplaceapi.service;

import com.pandaman.sharefavplaceapi.entity.User;
import com.pandaman.sharefavplaceapi.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import org.springframework.dao.DataIntegrityViolationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;
    
    /** ロガー名「appLogger」を指定していためappLoggerが適用される */
    private final Logger logger = LoggerFactory.getLogger("appLogger");


    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<User> saveAll(List<User> users){
        try{
        users.forEach(user -> {
            if (user.getCreatedAt() == null) {
                user.setCreatedAt(new Date());
            }
            if(user.getUpdatedAt() == null) {
                user.setUpdatedAt(new   Date());
            }
            });
        
        return userRepository.saveAll(users);
        }
            catch (DataIntegrityViolationException e) {
                logger.error("Data integrity violation while saving users", e);
                throw e;  // rethrow the exception after logging  
        }
    
    }

}


