package com.iot.controller;

import com.iot.domain.Song;
import com.iot.service.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/song", produces = MediaType.APPLICATION_JSON_VALUE)
public class SongController extends AbstractController<Song> {

    @Autowired
    public SongController(SongService songService) {
        super(songService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Song> updateObject(@PathVariable final Integer id,
                                               @RequestBody final Song song) {
        song.setId(id);
        Song oldSong = service.updateObject(id, song, new Song());
        return oldSong == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldSong, HttpStatus.OK);
    }
}