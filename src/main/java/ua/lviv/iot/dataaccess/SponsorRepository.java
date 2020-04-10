package ua.lviv.iot.dataaccess;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.model.Sponsor;


@Repository
public interface SponsorRepository extends JpaRepository<Sponsor, Integer> {
}
