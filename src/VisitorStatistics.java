import java.util.HashMap;
import java.util.Map;

public class VisitorStatistics implements Visitor {

    private double bytesPerSecondMp3;
    private double bytesPerPixelJpg;
    private long countOfWordsTxt;
    private long countOfLineHtml;
    private long sizeOfPptx;
    private long slidesOfPptx;
    private long wordsOfDocx;
    private long pagesOfDocx;
    public Map<String, Integer> CountOfFilesInFolders = new HashMap<>();

    private long round(double number) {
        return Math.round(number);
    }

    public long AverageSizeSlidePptx() {
        return sizeOfPptx / slidesOfPptx;
    }

    public long AverageWordsPagesDocx() {
        return wordsOfDocx / pagesOfDocx;
    }

    public long GetCountOfWordsTxt() {
        return countOfWordsTxt;
    }

    public long GetBytesPerSecondMp3() {
        return round(bytesPerSecondMp3);
    }

    public long GetBytesPerPixelJpg() {
        return round(bytesPerPixelJpg);
    }

    public long GetCountOfLineHtml() {
        return countOfLineHtml;
    }

    private void setBytesPerSecondMp3(double _bytesPerSecondMp3) {
        bytesPerSecondMp3 += _bytesPerSecondMp3;
    }

    private void setBytesPerSecondPixelJpg(double _bytesPerPixel) {
        bytesPerPixelJpg += _bytesPerPixel;
    }

    private void setCountOfWordsTxt(int _countOfWords) {
        countOfWordsTxt += _countOfWords;
    }

    private void setSizeOfPptx(int _sizeOfPptx) {
        sizeOfPptx += _sizeOfPptx;
    }

    private void setSlidesOfPptx(int _slidesOfPptx) {
        slidesOfPptx += _slidesOfPptx;
    }

    private void setWordsOfDocx(int _wordsOfDocx) {
        wordsOfDocx += _wordsOfDocx;
    }

    private void setPagesOfDocx(int _pagesOfDocx) {
        pagesOfDocx += _pagesOfDocx;
    }

    private void setCountOfLineHtml(long _countOfLine) {
        countOfLineHtml += _countOfLine;
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
                round( jpgFileDetails.getSize() / jpgFileDetails.getHeight() * jpgFileDetails.getWidth()) +
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
