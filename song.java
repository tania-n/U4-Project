public class Song 
{ 
    String title; 
    String artist; 
    String album; 
    int year; 
    
    public Song(String title, String artist, String album, int year){
        this.title = title; 
        this.artist = artist; 
        this.album = album; 
        this.year = year; 
    } 
    
    public String getTitle(){ 
        return title; 
    } 
    
    public void setTitle(String title){ 
        this.title = title; 
    }
    
    public String getArtist(){ 
        return artist; 
    } 
    
    public void setArtist(String artist){ 
        this.artist = artist; 
    }
    
    public String getAlbum(){ 
        return album; 
    } 
    
    public void setAlbum(String album){ 
        this.album = album; 
    }
    
    public int getYear(){ 
        return year; 
    } 
    
    public void setYear(int year){ 
        this.year = year; 
    }
    
    public String toString(){ 
        if(album.equals("none")){ 
            return "Artist: " + artist + "\nTitle: " + title + "\nNon-album single"; 
        }
        else{ 
            return "Artist: " + artist + "\nTitle: " + title + "\nAlbum: " + album; 
        }
    }
    
} 

