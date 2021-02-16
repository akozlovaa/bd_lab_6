package com.iot.controller;

import com.iot.domain.Genre;
import com.iot.service.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/genre", produces = MediaType.APPLICATION_JSON_VALUE)
public class GenreController extends AbstractController<Genre> {

    @Autowired
    public GenreController(GenreService genreService) {
        super(genreService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Genre> updateObject(@PathVariable final Integer id,
                                                @RequestBody final Genre genre) {
        genre.setId(id);
        Genre oldGenre = service.updateObject(id, genre, new Genre());
        return oldGenre == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldGenre, HttpStatus.OK);
    }
}