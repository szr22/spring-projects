package com.prettyye.repository;

import com.prettyye.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Autowired
    private Calendar cal;

    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();
        Speaker speaker = new Speaker();

        speaker.setFirstName("General");
        speaker.setLastName("Tzo");

        System.out.println("cal: " + cal.getTime());

        speakers.add(speaker);

        return speakers;
    }
}
