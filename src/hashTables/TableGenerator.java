package hashTables;

import cs1c.SongEntry;

import java.util.ArrayList;

/**
 * This class will create and populate two hash tables of type FHhashQPwFind class
 * One for each wrapper class
 *
 * @author Foothill College, Michael Bernal
 */
public class TableGenerator
{
    /**
     * tableOfSongIDs is a has table based on SongCompInt
     * tableOfSongGenres is a hash table based on SongsCompGenre
     * ArrayList String genreNames contained a list of genre types
     */
    private FHhashQPwFind<Integer, SongCompInt> tableOfSongIDs = new FHhashQPwFind<Integer, SongCompInt>();
    private FHhashQPwFind<String, SongsCompGenre> tableOfSongGenres = new FHhashQPwFind<String, SongsCompGenre>();
    private ArrayList<String> genreNames = new ArrayList<String>();

    /**
     * Populates the tableOfSongIDs hash table
     * @param allSongs all songs
     * @return tableOfSongIDs
     */
    public FHhashQPwFind<Integer, SongCompInt>populateIDtable(SongEntry[] allSongs)
    {
        for(int i = 0; i < allSongs.length; i++)
        {
            SongCompInt song = new SongCompInt(allSongs[i]);
            tableOfSongIDs.insert(song);
        }
        return tableOfSongIDs;
    }

    /**
     * Populates the tableOfSongGenres hash table
     * @param allSongs all songs
     * @return tableOfSongGenres
     */
    public FHhashQPwFind<String, SongsCompGenre>populateGenreTable(SongEntry[] allSongs)
    {
        for(int i = 0; i < allSongs.length; i++)
        {
            try
            {
                SongsCompGenre curGenre = tableOfSongGenres.find(allSongs[i].getGenre());
                curGenre.addSong(allSongs[i]);
            }
            catch (Exception e)
            {
                SongsCompGenre song = new SongsCompGenre(allSongs[i].getGenre(), allSongs[i]);
                tableOfSongGenres.insert(song);
                genreNames.add(allSongs[i].getGenre());
            }
        }
        return tableOfSongGenres;
    }

    /**
     * Getter method for genre names
     * @return genreNames
     */
    public ArrayList<String> getGenreNames()
    {
        return genreNames;
    }
}
