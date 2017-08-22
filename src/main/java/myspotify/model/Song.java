package myspotify.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Song implements NamedEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    private Artist artist;

    @ManyToOne
    @JsonIgnore
    private Album album;

    @JsonIgnore
    private String filename;

    public Song(String name, Artist artist, Album album, String filename) {
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.filename = filename;
    }

    // jpa
    Song() {
    }
}
