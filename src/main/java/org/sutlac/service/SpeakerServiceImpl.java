package org.sutlac.service;

import org.sutlac.model.Speaker;
import org.sutlac.repository.HibernateSpeakerImpl;
import org.sutlac.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository= new HibernateSpeakerImpl();
    @Override
    public List<Speaker> findAll(){
        return repository.findAll();

    }
}
