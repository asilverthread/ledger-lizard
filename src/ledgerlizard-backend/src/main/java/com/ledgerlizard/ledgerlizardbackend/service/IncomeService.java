package com.ledgerlizard.ledgerlizardbackend.service;

import com.ledgerlizard.ledgerlizardbackend.data.IncomeEntity;
import com.ledgerlizard.ledgerlizardbackend.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Service
public class IncomeService {
    @Autowired
    private IncomeRepository incomeRepository;

    public List<IncomeEntity> findAll(){
        List<IncomeEntity> incomeEntityList = new ArrayList<IncomeEntity>();
        incomeRepository.findAll().forEach(incomeEntityList::add);
        return incomeEntityList;
    }

    public IncomeEntity findById(String id) {
        return incomeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public IncomeEntity save(IncomeEntity income) {
        return incomeRepository.save(income);
    }

    public void deleteById(String id) {
        incomeRepository.deleteById(id);
    }
}
