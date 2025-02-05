package COM.TPP.RGR.service;

import COM.TPP.RGR.models.Genre;
import COM.TPP.RGR.repository.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;


    public List<Genre> getAllGenres() {
        return genreRepository.findAll(Sort.by(Sort.Order.asc("genreId")));
    }


    public Optional<Genre> findGenreById(int id) {
        return genreRepository.findById(id);
    }


    public void saveGenre(Genre genre) {
        genreRepository.save(genre);
    }


    public void updateGenre(Genre updatedGenre) {
        Genre existingGenre = genreRepository.findById(updatedGenre.getGenreId())
                .orElseThrow(() -> new IllegalArgumentException("Genre not found"));

        existingGenre.setGenreName(updatedGenre.getGenreName());
        existingGenre.setDescription(updatedGenre.getDescription());

        genreRepository.save(existingGenre);
    }


    public void deleteGenre(int id) {
        genreRepository.deleteById(id);
    }
}
