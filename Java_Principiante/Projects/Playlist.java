package Projects;
import java.util.ArrayList;


public class Playlist {
    public static void main(String[] args) {
      ArrayList<String> desertIslandPlaylist;
      desertIslandPlaylist = new ArrayList<>();

      desertIslandPlaylist.add("Song 1");
      desertIslandPlaylist.add("Song 2");
      desertIslandPlaylist.add("Song 3"); //
      desertIslandPlaylist.add("Song 4");
      desertIslandPlaylist.add("Song 5"); //Index 3
      desertIslandPlaylist.add("Song 6"); //
      desertIslandPlaylist.add("Song 7");

      System.out.println("Current playlist: " + desertIslandPlaylist);
      
      int longitud = desertIslandPlaylist.size();
      System.out.println("Playlist length: " + longitud);

      desertIslandPlaylist.remove(2);
      desertIslandPlaylist.remove(5);
     // desertIslandPlaylist.remove("Song 7");
 //desertIslandPlaylist.remove(longitud - 2);
      System.out.println("Updated playlist length: " + desertIslandPlaylist.size());
      System.out.println("Updated playlist length: " + desertIslandPlaylist);

      String temp = desertIslandPlaylist.get(3);//Song 5
      desertIslandPlaylist.set(3, desertIslandPlaylist.get(4));
      desertIslandPlaylist.set(4, temp);
      System.out.println("Updated playlist length: " + desertIslandPlaylist.size());
      System.out.println("Updated playlist length: " + desertIslandPlaylist);
    }
}
