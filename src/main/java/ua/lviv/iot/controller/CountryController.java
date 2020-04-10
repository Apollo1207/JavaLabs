package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.business.CountryService;
import ua.lviv.iot.model.Country;

import java.util.List;

@RequestMapping("/countries")
@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping
    public List<Country> getGroups() {
        return countryService.getCountries();
    }
}
