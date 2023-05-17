//Child class of Parent Song Class
public class Audiobook extends Song{
    
    //Constructor
    public Audiobook(String title, String writer, String direction) {
        super(title, writer, "Book", direction);
    }

    // getter methods
    public String getTitle() {
        return super.getTitle();
    }

    public String getAuthor() {
        return super.getArtist();
    }

    public String getFilePath() {
        return super.getFilePath();
    }
}