package storageSpec;

public class MyFile {

    private Directory parentDir;

    public MyFile(Directory parentDir) {
        this.parentDir = parentDir;
    }

    public Directory getParentDir() {
        return parentDir;
    }

    public void setParentDir(Directory parentDir) {
        this.parentDir = parentDir;
    }

}
