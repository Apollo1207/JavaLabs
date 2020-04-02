package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.SportBuildService;
import ua.lviv.iot.model.SportBuild;

import java.util.List;

@RequestMapping("/sportbuilds")
@RestController
public class SportBuildController {

    @Autowired
    private SportBuildService sportBuildService;

    @GetMapping
    public final List<SportBuild> getSportBuilds() {
        return sportBuildService.getSportBuilds();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<SportBuild> getSportBuild(final @PathVariable("id") Integer id) {
        SportBuild sportBuildNow;
        return (sportBuildNow = sportBuildService.getSportBuild(id)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(sportBuildNow, HttpStatus.OK);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final SportBuild createSportBuild(final @RequestBody SportBuild sportBuild) {
        return sportBuildService.createSportBuild(sportBuild);
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<SportBuild> deleteSportBuild(final @PathVariable("id") Integer id) {
        HttpStatus status = sportBuildService.deleteSportBuild(id) ? HttpStatus.OK :
                HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(status);
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<SportBuild> updateSportBuild(final @PathVariable("id") Integer id,
                                                             final @RequestBody SportBuild sportBuild) {
        sportBuild.setId(id);
        SportBuild previousSportBuild;
        return (previousSportBuild = sportBuildService.updateSportBuild(id, sportBuild)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(previousSportBuild, HttpStatus.OK);
    }
}

