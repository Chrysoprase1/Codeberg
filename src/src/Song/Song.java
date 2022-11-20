
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    public boolean equals (Object compared) {
        // return true if variables are stored in the same position
        if (this == compared) {
            return true;
        }
        // return false if compared is not of the Song class
        if (!(compared instanceof Song)) {
            return false;
        }
        // create compare object of the Song class
        // return true if every variably of the compare object equals the other
        Song comparedSong = (Song) compared;
        if (this.artist.equals (comparedSong.artist) &&
                this.name.equals (comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds) {
            return true;
        }
        // otherwise, return false
        return false;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
