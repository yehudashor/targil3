// abstract class File Details this is the base class of all files in the system.
public abstract class FileDetails {
    protected String name;
    private String path;

    public FileDetails(String path, String fileName) {
        this.path = path == null ? "" : path.substring(0, path.length() - 1);
        this.name = fileName;
    }

    public String getName() {
        return name;
    }

    public String getFullName() {
        return (path.isEmpty() ? "" : path + "/") + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    // Function that Is part of the visitor design pattern.
    public abstract void accept(Visitor visitor);
}
