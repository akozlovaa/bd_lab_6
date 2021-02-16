package com.iot.service;


import com.iot.domain.Song;
import com.iot.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SongService extends AbstractService<Song> {
    @Autowired
    public SongService(SongRepository repository) {
        super(repository);
    }
}
