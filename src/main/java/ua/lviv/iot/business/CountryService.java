package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.CountryRepository;
import ua.lviv.iot.model.Country;

import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public List<Country> getCountries() {
        return countryRepository.findAll();
    }

    public Country getCountry(Integer id) {
        if (countryRepository.existsById(id)) {
            return countryRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public Country createCountry(Country country) {
        return countryRepository.save(country);
    }

    public boolean deleteCountry(Integer id) {
        if (countryRepository.existsById(id)) {
            countryRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Country updateCountry(Integer id, Country country) {
        if (countryRepository.existsById(id)) {
            Country previousCountry = countryRepository.findById(id).get();
            countryRepository.save(country);
            return previousCountry;
        } else {
            return null;
        }
    }

}