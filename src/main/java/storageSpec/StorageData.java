package storageSpec;

import java.util.Collection;
import java.util.Map;
/**
 * Class for Storage serialization.
 * */
public class StorageData {
    /**
     * Storages storageName.
     */
    private String storageName;
    /**
     * Storages storageID.
     */
    private String storageID;
    /**
     * Storages rootLocation.
     */
    private String rootLocation;
    /**
     * Storages storagesSize.
     */
    private int storageSize;
    /**
     * Storages forbiddenExtensions.
     */
    private Collection<String> forbiddenExtensions;
    /**
     * Storages dirsMaxChildrenCount.
     */
    private Map<String, Integer> dirsMaxChildrenCount;
    /**
     * Constructs empty StorageData object.
     */
    public StorageData() {

    }

    /**
     * Getters and setters.
     */

    public String getStorageName() {
        return storageName;
    }

    public void setStorageName(String storageName) {
        this.storageName = storageName;
    }

    public String getStorageID() {
        return storageID;
    }

    public void setStorageID(String storageID) {
        this.storageID = storageID;
    }

    public String getRootLocation() {
        return rootLocation;
    }

    public void setRootLocation(String rootLocation) {
        this.rootLocation = rootLocation;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public Collection<String> getForbiddenExtensions() {
        return forbiddenExtensions;
    }

    public void setForbiddenExtensions(Collection<String> forbiddenExtensions) {
        this.forbiddenExtensions = forbiddenExtensions;
    }

    public Map<String, Integer> getDirsMaxChildrenCount() {
        return dirsMaxChildrenCount;
    }

    public void setDirsMaxChildrenCount(Map<String, Integer> dirsMaxChildrenCount) {
        this.dirsMaxChildrenCount = dirsMaxChildrenCount;
    }
}
