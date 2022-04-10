package com.ledgerlizard.ledgerlizardbackend.data;

import javax.persistence.Id;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Income {
    @Id
    private String incomeId;
    private String description;
    private String person;
    private int userId;
    private int payFrequencyId;
    private Date startDate;
    private Date endDate;
}
