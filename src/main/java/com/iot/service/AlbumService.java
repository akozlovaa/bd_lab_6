package com.iot.service;

import com.iot.domain.Album;
import com.iot.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlbumService extends AbstractService<Album> {
    @Autowired
    public AlbumService(AlbumRepository repository) {
        super(repository);
    }
}
