package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.business.CountryService;
import ua.lviv.iot.model.Country;

import java.util.List;

@RequestMapping("/countries")
@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public final List<Country> getCountries() {
        return countryService.getCountries();
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Country> getCountry(final @PathVariable("id") Integer id) {
        Country countryNow;
        return (countryNow = countryService.getCountry(id)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(countryNow, HttpStatus.OK);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Country createCountry(final @RequestBody Country country) {
        return countryService.createCountry(country);
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity<Country> deleteCountry(final @PathVariable("id") Integer id) {
        HttpStatus status = countryService.deleteCountry(id) ? HttpStatus.OK :
                HttpStatus.NOT_FOUND;
        return new ResponseEntity<>(status);
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<Country> updateCountry(final @PathVariable("id") Integer id,
                                                       final @RequestBody Country country) {
        country.setId(id);
        Country previousCountry;
        return (previousCountry = countryService.updateCountry(id, country)) == null
                ? new ResponseEntity<>(HttpStatus.NOT_FOUND)
                : new ResponseEntity<>(previousCountry, HttpStatus.OK);
    }
}
