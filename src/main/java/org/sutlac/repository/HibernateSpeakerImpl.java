package org.sutlac.repository;

import org.sutlac.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker= new Speaker();

        speaker.setFirstName("Malcolm");
        speaker.setLastName("X");

        speakers.add(speaker);

        return speakers;

    }
}
