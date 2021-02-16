package com.iot.controller;

import com.iot.domain.Album;
import com.iot.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/album", produces = MediaType.APPLICATION_JSON_VALUE)
public class AlbumController extends AbstractController<Album> {

    @Autowired
    public AlbumController(AlbumService albumService) {
        super(albumService);
    }

    @Override
    @PutMapping("/{id}")
    public ResponseEntity<Album> updateObject(@PathVariable final Integer id,
                                                    @RequestBody final Album album) {
        album.setId(id);
        Album oldAlbum = service.updateObject(id, album, new Album());
        return oldAlbum == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(oldAlbum, HttpStatus.OK);
    }
}
