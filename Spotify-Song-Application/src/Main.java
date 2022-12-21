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


        ListIterator<Song> listIterator = playList.listIterator();

        boolean forward = true; //This is one step ahead already

        if(playList.size()>0){

            System.out.println("Playing the first song");
            System.out.println(listIterator.next().toString());
            //how to print the first song


        }else{
            System.out.println("PlayList is empty");
            return;
        }
        System.out.println("Enter your option");

        boolean quit = false;
        Scanner sc = new Scanner(System.in);

        while(!quit){

            int option = sc.nextInt();

            //Switch case
            switch(option){

                case 0:
                    quit = true;
                    break;
                case 1:
                    if(forward==false){ //One step behind
                        listIterator.next(); //Take one step step forward
                        forward=true; //Now its on the right side of that number
                    }
                    if(listIterator.hasNext()){ //If it has another option
                        System.out.println("Next Song"+listIterator.next().toString());
                        forward = true;
                    }else{
                        System.out.println("You are at the last song");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward==true){ //Extra 1 step ahead
                        listIterator.previous(); //Move one step back
                        forward = false; //right position --> forward var
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Previous song playing "+listIterator.previous().toString());
                        forward = false;
                    }else{
                        System.out.println("You are at the first song");
                        forward = false;
                    }
                    break;
                case 3:
                    if(forward==true){

                        if(listIterator.hasPrevious()){
                            System.out.println("Repeating the song "+listIterator.previous().toString());
                            forward = false;
                        }

                    }else{ //forward variable is false

                        if(listIterator.hasNext()){
                            System.out.println("Repeating the song "+listIterator.next().toString());
                            forward = true;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Printing all the songs");
                    printSongs(playList);
                case 5:
                    printMenu();
                case 6:
                    //TODO --> listIterator.remove()
            }
        }






    }

    public static void printSongs(LinkedList<Song> playList){

        for(Song song:playList){
            System.out.println(song.toString()+"  ");
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