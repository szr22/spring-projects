package com.prettyye.service;

import com.prettyye.model.Speaker;
import com.prettyye.repository.HibernateSpeakerRepositoryImpl;
import com.prettyye.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    public List<Speaker> findAll(){
        return repository.findAll();
    }
}
