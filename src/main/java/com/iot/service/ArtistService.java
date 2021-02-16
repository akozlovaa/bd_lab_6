package com.iot.service;

import com.iot.domain.Artist;
import com.iot.repository.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends AbstractService<Artist> {
    @Autowired
    public ArtistService(ArtistRepository repository) {
        super(repository);
    }
}
