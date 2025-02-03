package COM.TPP.RGR.service;

import COM.TPP.RGR.models.Song;
import COM.TPP.RGR.repository.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SongService {

    @Autowired
    private SongRepository songRepository;

    public List<Song> getAllSongs() {
        return songRepository.findAll(Sort.by(Sort.Order.asc("id")));
    }

    public Optional<Song> findSongById(int id) {
        return songRepository.findById(id);
    }

    public void saveSong(Song song) {
        songRepository.save(song);
    }

    public void updateSong(Song updatedSong) {
        Song existingSong = songRepository.findById(updatedSong.getId())
                .orElseThrow(() -> new IllegalArgumentException("Song not found"));

        existingSong.setSongName(updatedSong.getSongName());
        existingSong.setDuration(updatedSong.getDuration());
        existingSong.setGenreSong(updatedSong.getGenreSong());
        existingSong.setMusicGroup(updatedSong.getMusicGroup());

        songRepository.save(existingSong);
    }

    public void deleteSong(int id) {
        songRepository.deleteById(id);
    }
}
