package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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
    public List<Sponsor> getSponsors() {
        return sponsorService.getSponsors();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Sponsor createSponsor(final @RequestBody Sponsor sponsor) {
        return sponsorService.createSponsor(sponsor);
    }
}
