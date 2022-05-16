import java.util.ArrayList;

// class for Directory File that extends from File Details.
// In addition, implements a composite design pattern.
public class DirectoryDetails extends FileDetails {

    // ArrayList of files of  Directory.
    public ArrayList<FileDetails> filesDetails;

    public DirectoryDetails(String path, String name) {
        super(path, name);
        filesDetails = new ArrayList<>();
    }

    // Function that implements a composite design pattern.
    @Override
    public void accept(Visitor visitor) {
        // Activating to accept of each one of the files in the folder.
        // In case it is a folder itself then a recursive reading is performed.
        for (var item : filesDetails) {
            item.accept(visitor);
        }
        visitor.visitor(this);
    }

    // add File to list.
    public void addFile(FileDetails fileDetails) {
        filesDetails.add(fileDetails);
    }
}