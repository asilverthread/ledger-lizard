package com.ledgerlizard.ledgerlizardbackend;

import com.ledgerlizard.ledgerlizardbackend.data.Income;
import com.ledgerlizard.ledgerlizardbackend.service.IncomeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/income")
public class IncomeController {
    private IncomeService incomeService;

    @GetMapping("/hello")
    public String sayHelloWorld() {
        return "hello world";
    }

    /*@GetMapping
    public List<Income> findAll() {
        return incomeService.findAll();
    }*/

    @GetMapping("/{id}")
    public Income findById(@PathVariable String id) {
        return incomeService.findById(id);
    }

    @PostMapping
    public Income create(@RequestBody Income income) {
        return incomeService.save(income);
    }

    @PutMapping("/{id}")
    public Income update(@RequestBody Income income) {
        return incomeService.save(income);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        incomeService.deleteById(id);
    }

}
