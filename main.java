import java.io.File; 
import java.util.Scanner; 

public class Main {
  public static void main(String[] args) throws Exception {
    File file = new File("top100streams.txt"); 
    Scanner text = new Scanner(file); 

    String str = text.nextLine();
    System.out.println("Top Streams of 2016");
    int i = 1; 
    // while loop goes through each line for each song 
    while(text.hasNextLine()){ 
        str = text.nextLine(); 
        // finds the index of each "|" symbol 
        int index1 = str.indexOf("|");
        int index2 = str.indexOf("|", index1 + 1); 
        int index3 = str.indexOf("|", index2 + 1); 
        int index4 = str.indexOf("|", index3 + 1); 
        int index5 = str.indexOf("|", index4 + 1); 
        // saves info between index 1 and 2 to title 
        String title = str.substring(index1 + 1, index2); 
        // saves info between index 2 and 3 to artist 
        String artist = str.substring(index2 + 1, index3); 
        // saves info between index 3 and 4 to album 
        String album = str.substring(index3 + 1, index4); 
        // saves the date the song was released 
        String date = str.substring(index5 + 1); 
        // checks if 2016 is in the string 
        if(date.indexOf("2016") != -1){ 
            // saves song into song1 
            Song song1 = new Song(title, artist, album, 2016); 
            System.out.println(i); 
            System.out.println(song1);
            System.out.println(); 
            // increases i by 1 after each loop 
            i++; 
        }
    }

  }
}



