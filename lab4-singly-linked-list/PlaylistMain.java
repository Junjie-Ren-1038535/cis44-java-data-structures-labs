public class PlaylistMain {
    public static void main(String[] args){
        // Creating new playlist
        Playlist NewPlaylist = new Playlist();
        // Creating new songs
        Song Song1 = new Song("Never gonna give you up", "Rick Astley");
        Song Song2 = new Song("World's smallest violin", "AJR");
        Song Song3 = new Song("Life goes on","Oliver Tree");
        // Put Songs into playlist
        NewPlaylist.addSong(Song1);
        NewPlaylist.addSong(Song2);
        NewPlaylist.addSong(Song3);
        // Display it.
        NewPlaylist.displayPlaylist();
        NewPlaylist.playNext();
        // Remove a song
        NewPlaylist.removeSong("World's smallest violin");
        // Display after removing
        NewPlaylist.displayPlaylist();
        // Remove all the songs
        NewPlaylist.removeSong("Never gonna give you up");
        NewPlaylist.removeSong("Life goes on");
        // Display a playlist with 0 songs
        NewPlaylist.displayPlaylist();

    }
}