package dataStructureAndAlgorithms.dataStructures.utilities;

/**
 * Represents the situation in which a target element is not present in a collection
 */

public class EmptyCollectionException extends RuntimeException {
    /**
     * @param collection
     */
    public EmptyCollectionException(String collection) {
        super("The " + collection + " is empty.");
    }
}
