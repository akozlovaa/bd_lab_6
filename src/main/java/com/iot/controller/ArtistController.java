package com.iot.controller;

import com.iot.domain.Artist;
import com.iot.service.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/artist", produces = MediaType.APPLICATION_JSON_VALUE)
public class ArtistController extends AbstractController<Artist> {

    @Autowired
    public ArtistController(ArtistService artistService) {
        super(artistService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Artist> updateObject(@PathVariable final Integer id,
                                                @RequestBody final Artist artist) {
        artist.setId(id);
        Artist oldArtist = service.updateObject(id, artist, new Artist());
        return oldArtist == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldArtist, HttpStatus.OK);
    }
}
