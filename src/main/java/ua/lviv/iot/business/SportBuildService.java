package ua.lviv.iot.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.dataaccess.SportBuildRepository;
import ua.lviv.iot.model.SportBuild;

import java.util.List;

@Service
public class SportBuildService {

    @Autowired
    private SportBuildRepository sportBuildRepository;

    public List<SportBuild> getSportBuilds() {
        return sportBuildRepository.findAll();
    }

    public SportBuild getSportBuild(Integer id) {
        if (sportBuildRepository.existsById(id)) {
            return sportBuildRepository.findById(id).get();
        } else {
            return null;
        }
    }

    public SportBuild createSportBuild(SportBuild sportBuild) {
        return sportBuildRepository.save(sportBuild);
    }

    public boolean deleteSportBuild(Integer id) {
        if (sportBuildRepository.existsById(id)) {
            sportBuildRepository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public SportBuild updateSportBuild(Integer id, SportBuild sportBuild) {
        if (sportBuildRepository.existsById(id)) {
            SportBuild previousSportBuild = sportBuildRepository.findById(id).get();
            sportBuildRepository.save(sportBuild);
            return previousSportBuild;
        } else {
            return null;
        }
    }

}
