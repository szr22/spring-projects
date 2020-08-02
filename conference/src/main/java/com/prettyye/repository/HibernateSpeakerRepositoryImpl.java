package com.prettyye.repository;

import com.prettyye.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("General");
        speaker.setLastName("Tzo");

        speakers.add(speaker);

        return speakers;
    }
}
