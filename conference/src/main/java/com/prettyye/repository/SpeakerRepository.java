package com.prettyye.repository;

import com.prettyye.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
