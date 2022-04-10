package com.ledgerlizard.ledgerlizardbackend.repository;

import com.ledgerlizard.ledgerlizardbackend.data.Income;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IncomeRepository extends CrudRepository<Income, String> {

}
