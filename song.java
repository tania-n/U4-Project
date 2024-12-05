public class Song 
{ 
    // instance variables
    String title; 
    String artist; 
    String album; 
    int year; 
    
    // constructor 
    public Song(String title, String artist, String album, int year){
        this.title = title; 
        this.artist = artist; 
        this.album = album; 
        this.year = year; 
    } 
    
    // getter for the title 
    public String getTitle(){ 
        return title; 
    } 
    
    // setter for the title 
    public void setTitle(String title){ 
        this.title = title; 
    }
    
    // getter for the artist 
    public String getArtist(){ 
        return artist; 
    } 
    
    // setter for the artist 
    public void setArtist(String artist){ 
        this.artist = artist; 
    }
    
    // getter for the album 
    public String getAlbum(){ 
        return album; 
    } 
    
    // setter for the album 
    public void setAlbum(String album){ 
        this.album = album; 
    }
    
    // getter for the year 
    public int getYear(){ 
        return year; 
    } 
    
    // setter for the year 
    public void setYear(int year){ 
        this.year = year; 
    }
    
    // checks if there is an album name  
    public String toString(){ 
        // if there isn't, when returning the album, it will say non-album single 
        if(album.equals("none")){ 
            return "Artist: " + artist + "\nTitle: " + title + "\nNon-album single"; 
        } 
        // if there is an album name, then it will print it  
        else{ 
            return "Artist: " + artist + "\nTitle: " + title + "\nAlbum: " + album; 
        }
    }
    
} 

