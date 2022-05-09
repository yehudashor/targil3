import java.util.ArrayList;
import java.util.HashSet;

public class DirectoryDetails extends FileDetails {

    private ArrayList<FileDetails> filesDetails;

    public DirectoryDetails(String path, String name) {
        super(path, name);
        filesDetails = new ArrayList<>();
    }

    @Override
    public void accept(Visitor visitor) {
        for (var item : filesDetails) {
            item.accept(visitor);
        }
        visitor.visitor(this);
    }

    public void addFile(FileDetails fileDetails) {
        filesDetails.add(fileDetails);
    }
}