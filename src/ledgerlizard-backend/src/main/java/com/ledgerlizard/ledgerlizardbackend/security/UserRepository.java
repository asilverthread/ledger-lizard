package com.ledgerlizard.ledgerlizardbackend.security;

import com.ledgerlizard.ledgerlizardbackend.security.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {

}
