package com.ledgerlizard.ledgerlizardbackend.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity save(UserEntity user) { return userRepository.save(user); }

    public UserEntity findById(String id) {return userRepository.findById(id).orElseThrow(EntityNotFoundException::new);}

    public List<UserEntity> findAll() {
        List<UserEntity> userEntityList = new ArrayList<UserEntity>();
        userRepository.findAll().forEach(userEntityList::add);
        return userEntityList;
    }

    public Optional<UserEntity> findByUsername(String username) {
        for (UserEntity userEntity : userRepository.findAll()) {
            if (userEntity.getUsername() == username) {
                return userRepository.findById(Integer.toString(userEntity.getUserId()));
            }
        }
        return null;
    }
}
