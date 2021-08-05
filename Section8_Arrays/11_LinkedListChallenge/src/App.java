import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class App {

    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) throws Exception {
        
        Album album = new Album("El Diablito", "Caifanes");
        album.addSong("Detras de ti", 3.36);
        album.addSong("Antes de que nos olviden", 4.45);
        album.addSong("La vida no es eterna", 3.54);
        album.addSong("De noche todos los gatos son pardos", 4.13);
        album.addSong("Sombras en tiempos perdidos", 5.52);
        album.addSong("Negro cosmico", 3.42);
        album.addSong("La celula que explota", 3.35);
        album.addSong("Aqui no pasa nada", 4.37);
        album.addSong("Los dioses ocultos", 4.39);
        album.addSong("Elefante", 3.00);
        album.addSong("Amarrate a una escoba y vuela lejos", 3.52);
        albums.add(album);

        album = new Album("Presence", "Led Zeppelin");
        album.addSong("Achilles last stand", 10.22);
        album.addSong("For your life", 6.40);
        album.addSong("Royal orleans", 3.01);
        album.addSong("Nobody's fault but mine", 6.43);
        album.addSong("Candy store rock", 4.11);
        album.addSong("Hots on for nowhere",4.44);
        album.addSong("Tea for one", 9.28);
        albums.add(album);

        //Playlist
        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("La celula que explota", playList);
        albums.get(0).addToPlaylist("Negro cosmico", playList);
        albums.get(0).addToPlaylist("Detras de ti", playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(1, playList);

        play(playList);
    }
    //Play method
    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {

                case 0:
                System.out.println("Playlist complete.");
                quit = true;
                break;

                case 1:
                if(!forward) {
                    if(listIterator.hasNext()) {
                        listIterator.next();
                    }
                    forward = true;
                }
                if(listIterator.hasNext()) {
                    System.out.println("Now playin " + listIterator.next().toString());
                } else {
                    System.out.println("We have reached the end of the playlist.");
                    forward = false;
                }
                break;

                case 2:
                if(forward) {
                    if(listIterator.hasPrevious()) {
                        listIterator.previous();
                    }
                    forward = false;
                    System.out.println("Now playing " + listIterator.previous().toString());
                } else {
                    System.out.println("We are at the start of the playlist.");
                    forward = true;
                }
                break;

                case 3:
                if(forward) {
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now replaying " + listIterator.previous().toString());
                        forward = false;
                    } else {
                        System.out.println("We are at the start of the list");                        
                    }
                } else {
                    if(listIterator.hasNext()) {
                        System.out.println("Now replaying " + listIterator.next().toString());
                        forward = true;
                    } else {
                        System.out.println("We have reached the end of the list");
                    }
                }
                break;

                case 4:
                printList(playList);
                break;

                case 5:
                printMenu();
                break;

                case 6:
                if(playList.size() > 0) {
                    listIterator.remove();
                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else if(listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous());
                    }
                }
                break;
            }
        }
    }
    //Print Menu method
    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 -- to quit\n" +
        "1 -- to play next song\n" +
        "2 -- to play previous song\n" +
        "3 -- to replay the current song\n" +
        "4 -- list songs in the playlist\n" +
        "5 -- print available actions.\n" +
        "6 -- delete current song.");
    }
    //Print a list of available songs method
    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("============================");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("============================");
    }
}
