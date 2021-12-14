package hashTables;

import cs1c.SongEntry;

import java.util.ArrayList;

/**
 * Wrapper class for a SongEntry object
 * We will use this to compare objects based on the songs String genre field
 * We will use this to determine the number of songs in each genre
 *
 * @author Foothill College, Michael Bernal
 */
public class SongsCompGenre implements Comparable<String>
{
    /**
     * String attribute for name of the genre
     * ArrayList SongEntry attribute for all the songs in that genre
     */
    private String genre;
    private ArrayList<SongEntry> songEntryObj;

    /**
     * Class constructor
     */
    public SongsCompGenre()
    {
        songEntryObj = new ArrayList<SongEntry>();
        genre = "undefined";
    }

    /**
     * Class constructor that takes parameters
     * @param genre the genre
     * @param curSong the current song
     */
    public SongsCompGenre(String genre, SongEntry curSong)
    {
        this();
        this.genre = genre;
        addSong(curSong);
    }

    /**
     * toString() override
     * @return songEntryObj
     */
    public String toString()
    {
        return songEntryObj.toString();
    }

    /**
     * compareTo() override
     * @param str a String
     * @return genre
     */
    public int compareTo(String str)
    {
        return genre.compareTo(str);
    }

    /**
     * equals() override
     * @param rhs
     * @return songEntryObj
     */
    public boolean equals(SongsCompGenre rhs)
    {
        return songEntryObj.equals(rhs.songEntryObj);
    }

    /**
     * hashCode() override
     * @return genre
     */
    public int hashCode()
    {
        return genre.hashCode();
    }

    /**
     * Adds song to list of songs
     * @param song a song
     */
    public void addSong(SongEntry song)
    {
        songEntryObj.add(song);
    }

    /**
     * Getter method for attribute
     * @return genre
     */
    public String getName()
    {
        return genre;
    }

    /**
     * Getter method for attribute
     * @return songEntryObj
     */
    public ArrayList<SongEntry> getData()
    {
        return songEntryObj;
    }
}
