public interface Visitor {
    void visitor(DirectoryDetails directoryDetails);
    void visitor(DocxFileDetails docxFileDetails);
    void visitor(HtmlFileDetails htmlFileDetails);
    void visitor(JpgFileDetails jpgFileDetails);
    void visitor(Mp3FileDetails mp3FileDetails);
    void visitor(PptxFileDetails pptxFileDetails);
    void visitor(TxtFileDetails txtFileDetails);
}
