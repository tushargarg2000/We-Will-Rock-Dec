import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    String name;
    String artistName;

    ArrayList<Song> songs;


    public Album(String name, String artistName) {
        this.name = name;
        this.artistName = artistName;
        this.songs = new ArrayList<>(); //THIS IS WHERE ALOT OF STUDENT
    }

    public boolean findSong(String title){

        //Complete this function..
        for(Song song:songs){

            if(song.getTitle().equals(title)){
                return true;
            }
        }
        return false;
    }

    public void addSongToAlbum(String title,double duration){

        //Make sure..that exists or not

        //if it exists --> dont add...

        //Add the song

        if(findSong(title)==true){
            System.out.println("The song is already present");
        }
        else{
            Song newSong = new Song(title,duration);
            songs.add(newSong);
            System.out.println("New song has been added");
        }
    }

    public void addToPlayList(int trackNo, LinkedList<Song> playList){

        //How we will get the Song Object ????

        int index = trackNo - 1;

        //Get the song Object :

        if(index>=0&&index<songs.size()){

            Song song = this.songs.get(index);
            playList.add(song);

        }

    }

    public void addToPlayList(String title,LinkedList<Song>playList){

        //How to do this...

        //findSong() --> true false only and not the object

        for(Song song:this.songs){ //Iterating over the songs

            if(song.getTitle().equals(title)){

                //I found a Song Object
                //I need to add it..
                playList.add(song);

            }

        }
    }
}
