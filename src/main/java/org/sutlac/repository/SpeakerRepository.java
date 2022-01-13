package org.sutlac.repository;

import org.sutlac.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
