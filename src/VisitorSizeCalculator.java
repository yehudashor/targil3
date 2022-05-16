// Class for size files Calculator in the system.

public class VisitorSizeCalculator implements Visitor {
    private long sizeCalculator;

    private void setSizeCalculator(int sizeCalculator) {
        this.sizeCalculator += sizeCalculator;
    }

    public long getSizeCalculator() {
        return sizeCalculator;
    }

    @Override
    public void visitor(DirectoryDetails directoryDetails) {
    }

    @Override
    public void visitor(DocxFileDetails docxFileDetails) {
        setSizeCalculator(docxFileDetails.getSize());
    }

    @Override
    public void visitor(HtmlFileDetails htmlFileDetails) {
        setSizeCalculator(htmlFileDetails.getSize());
    }

    @Override
    public void visitor(JpgFileDetails jpgFileDetails) {
        setSizeCalculator(jpgFileDetails.getSize());
    }

    @Override
    public void visitor(Mp3FileDetails mp3FileDetails) {
        setSizeCalculator(mp3FileDetails.getSize());
    }

    @Override
    public void visitor(PptxFileDetails pptxFileDetails) {
        setSizeCalculator(pptxFileDetails.getSize());
    }

    @Override
    public void visitor(TxtFileDetails txtFileDetails) {
        setSizeCalculator(txtFileDetails.getSize());
    }
}
