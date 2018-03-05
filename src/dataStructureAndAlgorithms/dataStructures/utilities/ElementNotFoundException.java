package dataStructureAndAlgorithms.dataStructures.utilities;

/**
 * Represents the situation in which a target element is not present in a collection
 */
public class ElementNotFoundException extends RuntimeException {
    /**
     * Sets up this exception with an appropriate message.
     *
     * @param collection
     */
    public ElementNotFoundException(String collection) {
        super("The target element is not in this " + collection);
    }
}
