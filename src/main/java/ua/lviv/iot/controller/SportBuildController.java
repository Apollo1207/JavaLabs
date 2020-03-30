package ua.lviv.iot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.model.SportBuild;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/sportbuilds")
@RestController
public class SportBuildController {

    private static Map<Integer, SportBuild> sportBuilds = new HashMap<>();

    private static AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<SportBuild> getSportsBuilds() {
        return new LinkedList<>(sportBuilds.values());
    }

    @GetMapping(path = "/{id}")
    public SportBuild getSportBuild(final @PathVariable("id") Integer id) {
        return sportBuilds.get(id);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public SportBuild createSportBuild(final @RequestBody SportBuild sportBuild) {
        sportBuild.setId(idCounter.incrementAndGet());
        sportBuilds.put(sportBuild.getId(), sportBuild);
        return sportBuild;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<SportBuild> deleteSportBuild(@PathVariable("id") Integer id) {
        HttpStatus deleteStatus = sportBuilds.remove(id) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(deleteStatus).build();
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<SportBuild> updateSportBuild(
            final @PathVariable("id") Integer id,
            final @RequestBody SportBuild sportBuild) {
        sportBuild.setId(id);
        SportBuild previousValue = sportBuilds.put(id, sportBuild);
        return previousValue == null ? ResponseEntity.notFound().build() : ResponseEntity.ok(previousValue);

    }
}
