package com.tw.apistackbase.service;

import com.tw.apistackbase.repo.InquisitorRepository;
import com.tw.apistackbase.theCase.Inquisitor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InquisitorService {
    @Autowired
    private InquisitorRepository inquisitorRepository;

    public Inquisitor findById(int id) {
        return inquisitorRepository.findById(id).get();
    }

}
