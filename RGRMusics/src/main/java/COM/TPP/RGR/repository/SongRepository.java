package COM.TPP.RGR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import COM.TPP.RGR.models.Song;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {

}
