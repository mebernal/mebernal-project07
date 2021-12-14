Project folder:
mebernal-project07/

doc/
    - Javadoc

src/hashTables/FHhashQP.java
    - FHhashQP class.
src/hashTables/FHhashQPwFind.java
    - Implementation of class FHhashQPwFind that extends FHhashQP.
src/hashTables/HashEntry.java
    - HashEntry class for use by FHhashQP.
src/hashTables/MyTunes.java
    - Tests the functionality of FHhashQPwFind.java. Specifically checks for
      implementation of find() function to return an object associated with a given key input.
src/hashTables/SongCompInt.java
    - Wrapper class for a SongEntry object. We will use this to compare objects based
      on the songs int id field
src/hashTables/SongsCompGenre.java
    - Wrapper class for a SongEntry object. We will use this to compare objects based
      on the songs String genre field. We will use this to determine the number of
      songs in each genre.
src/hashTables/TableGenerator.java
    - This class will create and populate two hash tables of type FHhashQPwFind class.
      One for each wrapper class.

resources/RUN.txt
    - Console output of MyTunes.java, FHhashQP.java, FHhashQPwFind.java, HashEntry.java, SongCompInt.java,
      SongsCompGenre.java, and TableGenerator.java

README.txt
    - Description of submitted files.