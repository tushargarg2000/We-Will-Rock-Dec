import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    public static ArrayList<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        
        Album album = new Album("Album1","AC/DC");

        album.addSongToAlbum("TNT",4.5);
        album.addSongToAlbum("Highway to hell",3.5);
        album.addSongToAlbum("ThunderStruck",5.0);

        albums.add(album);

        album = new Album("Album2","Eminem");

        album.addSongToAlbum("Rap god",4.5);
        album.addSongToAlbum("Not Afraid",3.5);
        album.addSongToAlbum("Lose yourself",4.5);

        //How many songs will this album variable have ?


        albums.add(album);

        LinkedList<Song> playList_1 = new LinkedList<>();

        albums.get(0).addToPlayList("TNT",playList_1);
        albums.get(0).addToPlayList("Highway to hell",playList_1);
        albums.get(1).addToPlayList("Rap god",playList_1);
        albums.get(1).addToPlayList("Lose yourself",playList_1);
        play(playList_1);

    }
    public static void play(LinkedList<Song> playList){

        printMenu();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your option");

        int option = sc.nextInt();


        ListIterator<Song> listIterator = playList.listIterator();

        if(playList.size()>0){

            System.out.println("Playing the first Song "+playList.get(0).toString());
            //how to print the first song




        }else{
            System.out.println("PlayList is empty");
        }

    }

    private static void printMenu(){
        System.out.println("Available options\n press");
        System.out.println("0 - to quit\n"+
                "1 - to play next song\n"+
                "2 - to play previous song\n"+
                "3 - to replay the current song\n"+
                "4 - list of all songs \n"+
                "5 - print all available options\n"+
                "6 - delete current song");
    }
}