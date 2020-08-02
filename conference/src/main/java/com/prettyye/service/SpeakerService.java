package com.prettyye.service;

import com.prettyye.model.Speaker;
import com.prettyye.repository.HibernateSpeakerRepositoryImpl;
import com.prettyye.repository.SpeakerRepository;

import java.util.List;

public interface SpeakerService {
    List<Speaker> findAll();
}
