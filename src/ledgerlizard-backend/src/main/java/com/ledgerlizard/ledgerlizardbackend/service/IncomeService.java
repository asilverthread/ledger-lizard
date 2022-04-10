package com.ledgerlizard.ledgerlizardbackend.service;

import com.ledgerlizard.ledgerlizardbackend.data.Income;
import com.ledgerlizard.ledgerlizardbackend.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;

    /*public List<Income> findAll(){
        return incomeRepository.findAll();
    }*/

    public Income findById(String id) {
        return incomeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Income save(Income income) {
        return incomeRepository.save(income);
    }

    public void deleteById(String id) {
        incomeRepository.deleteById(id);
    }
}
