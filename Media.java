abstract class Media
{
    private String fileName;
    private int id;
    private static int nextId = 1;

    public Media()
    {
        id = nextId;
        nextId++;
        fileName = "";
    }

    public Media(String fileName)
    {
        this.fileName = fileName;
        id = nextId;
        nextId++;
    }

    public String getFileName()
    {
        return fileName;
    }

    public int getId()
    {
        return id;
    }
}
