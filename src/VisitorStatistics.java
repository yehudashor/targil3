import java.util.HashMap;
import java.util.Map;

public class VisitorStatistics implements Visitor {

    private double bytesPerSecondMp3;
    private double bytesPerPixelJpg;
    private long countOfWordsTxt;
    private long countOfLineHtml;
    private long sizeOfPptx;
    private long slidesOfPptx;
    public Map <String, Integer> CountOfFilesInFolders = new HashMap<>();

    public long getCountOfLine() {
        return countOfLineHtml;
    }

    private void setCountOfLine(long _countOfLine) {
        countOfLineHtml += _countOfLine;
    }

    public long AverageSizeSlide(){
        return sizeOfPptx / slidesOfPptx;
    }

    private long round(double number) {
        return Math.round(number);
    }

    private void setBytesPerSecondMp3(double _bytesPerSecondMp3) {
        bytesPerSecondMp3 += _bytesPerSecondMp3;
    }

    public long GetBytesPerSecondMp3() {
        return round(bytesPerSecondMp3);
    }

    private void setBytesPerSecondPixel(double _bytesPerPixel) {
        bytesPerPixelJpg += _bytesPerPixel;
    }

    public long GetBytesPerSecondPixel() {
        return round(bytesPerPixelJpg);
    }

    private void setCountOfWords(int _countOfWords) {
        countOfWordsTxt += _countOfWords;
    }

    public long GetCountOfWords() {
        return countOfWordsTxt;
    }

    private void setSizeOfPptx(int _sizeOfPptx ){
        sizeOfPptx += _sizeOfPptx;
    }

    private void setSlidesOfPptx(int _slidesOfPptx ){
        slidesOfPptx += _slidesOfPptx;
    }


    @Override
    public void visitor(DirectoryDetails directoryDetails) {

    }

    @Override
    public void visitor(DocxFileDetails docxFileDetails) {

    }

    @Override
    public void visitor(HtmlFileDetails htmlFileDetails) {
        setCountOfLine(htmlFileDetails.getLines());
    }

    @Override
    public void visitor(JpgFileDetails jpgFileDetails) {
        setBytesPerSecondPixel(jpgFileDetails.getSize() / jpgFileDetails.getHeight() * jpgFileDetails.getWidth());
    }

    @Override
    public void visitor(Mp3FileDetails mp3FileDetails) {
        setBytesPerSecondMp3(mp3FileDetails.getSize() / mp3FileDetails.getLengthSec());
    }

    @Override
    public void visitor(PptxFileDetails pptxFileDetails) {
        setSizeOfPptx(pptxFileDetails.getSize());
        setSlidesOfPptx(pptxFileDetails.getSlides());
    }

    @Override
    public void visitor(TxtFileDetails txtFileDetails) {
       setCountOfWords(txtFileDetails.getWords());
    }
}
