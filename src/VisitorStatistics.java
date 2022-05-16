
// Class for Statistics files in the system.
public class VisitorStatistics implements Visitor {

    private long round(double number) {
        return Math.round(number);
    }

    @Override
    public void visitor(DirectoryDetails directoryDetails) {
        System.out.println("Directory " + directoryDetails.getName() + " has " +
                directoryDetails.filesDetails.size() + " files");
    }

    @Override
    public void visitor(DocxFileDetails docxFileDetails) {
        System.out.println("The file " + docxFileDetails.getName() + " has an average of " +
                docxFileDetails.getWords() / docxFileDetails.getPages() + " words per page.");
    }

    @Override
    public void visitor(HtmlFileDetails htmlFileDetails) {
        System.out.println("The file " + htmlFileDetails.getName() + " contains " + htmlFileDetails.getLines() +
                " lines.");
    }

    @Override
    public void visitor(JpgFileDetails jpgFileDetails) {
        System.out.println("The picture " + jpgFileDetails.getName() + " has an average of " +
                round((double)jpgFileDetails.getSize() / (jpgFileDetails.getHeight() * jpgFileDetails.getWidth())) +
                " bytes per pixel.");
    }

    @Override
    public void visitor(Mp3FileDetails mp3FileDetails) {
        System.out.println("The bitrate of song.mp3 is " + mp3FileDetails.getSize() / mp3FileDetails.getLengthSec() +
                " bytes per second.");
    }

    @Override
    public void visitor(PptxFileDetails pptxFileDetails) {
        System.out.println("The average slide size in Presentation " + pptxFileDetails.getName() + " is "
                + pptxFileDetails.getSize() / pptxFileDetails.getSlides() + ".");
    }

    @Override
    public void visitor(TxtFileDetails txtFileDetails) {
        System.out.println("The file " + txtFileDetails.getName() + " contains " + txtFileDetails.getWords() +
                " words.");
    }
}
