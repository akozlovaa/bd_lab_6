package com.iot.service;

import com.iot.domain.Genre;
import com.iot.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GenreService extends AbstractService<Genre> {
    @Autowired
    public GenreService(GenreRepository repository) {
        super(repository);
    }
}
