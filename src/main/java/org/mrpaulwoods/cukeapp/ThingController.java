package org.mrpaulwoods.cukeapp;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/things")
public class ThingController {

    Bag bag = new Bag();

    @GetMapping
    Bag get() {
        return bag;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    void put(@RequestBody String thing) {
        bag.add(thing);
    }

    @DeleteMapping
    void removeEverything() {
        bag.removeEverything();
    }

}

