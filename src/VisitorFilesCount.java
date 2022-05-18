import java.util.HashMap;
import java.util.Map;

// Class that summarizes the number of files in the system.
public class VisitorFilesCount implements Visitor {

    public HashMap<String, Integer> filesCount = new HashMap<>();

    public VisitorFilesCount() {
        filesCount.put("root", 0);
    }

    @Override
    public void visitor(DirectoryDetails directoryDetails) {
    }

    private void addFileCount(String path) {
        addToMap("root");

        for (String folderName : path.split("/")) {
            addToMap(folderName);
        }
    }

    private void addToMap(String folderName){
        if(filesCount.containsKey(folderName)){
            filesCount.put(folderName, filesCount.get(folderName) + 1);
        }
        else {
            filesCount.put(folderName, 1);
        }
    }
    @Override
    public void visitor(DocxFileDetails docxFileDetails) {
        addFileCount(docxFileDetails.getPath());
    }

    @Override
    public void visitor(HtmlFileDetails htmlFileDetails) {
        addFileCount(htmlFileDetails.getPath());
    }

    @Override
    public void visitor(JpgFileDetails jpgFileDetails) {
        addFileCount(jpgFileDetails.getPath());
    }

    @Override
    public void visitor(Mp3FileDetails mp3FileDetails) {
        addFileCount(mp3FileDetails.getPath());
    }

    @Override
    public void visitor(PptxFileDetails pptxFileDetails) {
        addFileCount(pptxFileDetails.getPath());
    }

    @Override
    public void visitor(TxtFileDetails txtFileDetails) {
        addFileCount(txtFileDetails.getPath());
    }
}
