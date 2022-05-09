public class VisitorFilesCount implements Visitor{

    private int fileCount;

    public int getFileCount(){return  fileCount;}

    private void FileCount(){ fileCount++; }
    @Override
    public void visitor(DirectoryDetails directoryDetails) {}

    @Override
    public void visitor(DocxFileDetails docxFileDetails) { FileCount();}

    @Override
    public void visitor(HtmlFileDetails htmlFileDetails) {
        FileCount();
    }

    @Override
    public void visitor(JpgFileDetails jpgFileDetails) {
        FileCount();
    }

    @Override
    public void visitor(Mp3FileDetails mp3FileDetails) {
        FileCount();
    }

    @Override
    public void visitor(PptxFileDetails pptxFileDetails) {
        FileCount();
    }

    @Override
    public void visitor(TxtFileDetails txtFileDetails) {
        FileCount();
    }
}
