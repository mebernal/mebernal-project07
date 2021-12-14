package hashTables;

import java.util.NoSuchElementException;

/**
 * Implementation of class FHhashQPwFind that extends FHhashQP
 *
 * @author Foothill College, Michael Bernal
 */
public class FHhashQPwFind<KeyType, E extends Comparable<KeyType>> extends FHhashQP<E>
{
    /**
     * Returns the found object or throws a NoSuchElementException
     * @param key search key
     * @return found object
     */
    public E find(KeyType key)
    {
        int bucket = findPosKey(key);

        if(mArray[bucket].state != ACTIVE)
            throw new NoSuchElementException();

        return mArray[bucket].data;
    }

    /**
     * Protected method which provides trivial modification to findPos() which uses the key rather than the object
     * to hash
     * @param key search key
     * @return the index position
     */
    protected int findPosKey(KeyType key)
    {
        int i = myHashKey(key);
        int k = 1;

        while(mArray[i].state != EMPTY && (mArray[i].data.compareTo(key) != 0))
        {
            i += k;
            k += 2;

            if(i >= mTableSize)
                i -= mTableSize;
        }
        return i;
    }

    /**
     * Protected method which provides a trivial modification to myHash() which uses the key rather than the object
     * to hash
     * @param key used to hash
     * @return the hash key
     */
    protected int myHashKey(KeyType key)
    {
        int hashVal;

        hashVal = key.hashCode() % mTableSize;

        if(hashVal < 0)
            hashVal += mTableSize;

        return hashVal;
    }
}
