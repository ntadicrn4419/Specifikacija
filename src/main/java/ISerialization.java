import java.util.List;

public interface ISerialization {
    public void saveUserData(String filePath);
    public List<Object> readSavedUsers(String filePath);
}
