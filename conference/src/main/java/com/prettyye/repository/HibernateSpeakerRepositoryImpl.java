package com.prettyye.repository;

import com.prettyye.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("General");
        speaker.setLastName("Tzo");

        speakers.add(speaker);

        return speakers;
    }
}
