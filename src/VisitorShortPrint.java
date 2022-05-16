
// Class for print all files name in the system.

public class VisitorShortPrint implements Visitor {

    private void printName(String name){
        System.out.println(name);
    }

    @Override
    public void visitor(DirectoryDetails directoryDetails) {
        printName(directoryDetails.getName());
    }

    @Override
    public void visitor(DocxFileDetails docxFileDetails) {
        printName(docxFileDetails.getName());
    }

    @Override
    public void visitor(HtmlFileDetails htmlFileDetails) {
        printName(htmlFileDetails.getName());
    }

    @Override
    public void visitor(JpgFileDetails jpgFileDetails) {
        printName(jpgFileDetails.getName());
    }

    @Override
    public void visitor(Mp3FileDetails mp3FileDetails) {
        printName(mp3FileDetails.getName());
    }

    @Override
    public void visitor(PptxFileDetails pptxFileDetails) {
        printName(pptxFileDetails.getName());
    }

    @Override
    public void visitor(TxtFileDetails txtFileDetails) {
        printName(txtFileDetails.getName());
    }
}
