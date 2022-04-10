package com.ledgerlizard.ledgerlizardbackend.repository;

import com.ledgerlizard.ledgerlizardbackend.data.IncomeEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IncomeRepository extends CrudRepository<IncomeEntity, String> {

}
