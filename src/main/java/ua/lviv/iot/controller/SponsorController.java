package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.SponsorService;
import ua.lviv.iot.model.Sponsor;

import java.util.List;

@RequestMapping("/sponsors")
@RestController
public class SponsorController {

    @Autowired
    private SponsorService sponsorService;

    @GetMapping
    public final List<Sponsor> getSponsors() {
        return sponsorService.getSponsors();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Sponsor> getSponsor(final @PathVariable("id") Integer id) {
        Sponsor sponsorNow;
        return (sponsorNow = sponsorService.getSponsor(id)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(sponsorNow, HttpStatus.OK);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Sponsor createSponsor(final @RequestBody Sponsor sponsor) {
        return sponsorService.createSponsor(sponsor);
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<Sponsor> deleteSponsor(final @PathVariable("id") Integer id) {
        HttpStatus status = sponsorService.deleteSponsor(id) ? HttpStatus.OK :
                HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(status);
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<Sponsor> updateSponsor(final @PathVariable("id") Integer id,
                                                       final @RequestBody Sponsor sponsor) {
        sponsor.setId(id);
        Sponsor previousSponsor;
        return (previousSponsor = sponsorService.updateSponsor(id, sponsor)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(previousSponsor, HttpStatus.OK);
    }
}
