package COM.TPP.RGR.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "genres")
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer genreId;

    @NotBlank(message = "Genre name is required")
    private String genreName;

    private String description;

    // Гетери та сетери
    public Integer getGenreId() {
        return genreId;
    }
    public void setGenreId(Integer genreId) {
        this.genreId = genreId;
    }
    public String getGenreName() {
        return genreName;
    }
    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
