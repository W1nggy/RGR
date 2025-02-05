package COM.TPP.RGR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import COM.TPP.RGR.models.Musicgroup;

@Repository
public interface MusicgroupRepository extends JpaRepository<Musicgroup, Integer> {

}
