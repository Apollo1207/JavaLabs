package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.SponsorRepository;
import ua.lviv.iot.model.Sponsor;

import java.util.List;

@Service
public class SponsorService {
    @Autowired
    private SponsorRepository sponsorRepository;

    public List<Sponsor> getSponsors() {
        return sponsorRepository.findAll();
    }

    public Sponsor getSponsor(Integer id) {
        if (sponsorRepository.existsById(id)) {
            return sponsorRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public Sponsor createSponsor(Sponsor sponsor) {
        return sponsorRepository.save(sponsor);
    }

    public boolean deleteSponsor(Integer id) {
        if (sponsorRepository.existsById(id)) {
            sponsorRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public Sponsor updateSponsor(Integer id, Sponsor sponsor) {
        if (sponsorRepository.existsById(id)) {
            Sponsor previousSponsor = sponsorRepository.findById(id).get();
            sponsorRepository.save(sponsor);
            return previousSponsor;
        } else {
            return null;
        }
    }


}
