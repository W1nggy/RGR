package COM.TPP.RGR.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import COM.TPP.RGR.models.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {
}
