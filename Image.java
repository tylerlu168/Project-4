public class Image extends Media implements IImageStandard
{
    private String imageCodec;

    public Image()
    {
        imageCodec = "";
    }
    public Image(String name, String imageCodec)
    {
        super(name);
        this.imageCodec = imageCodec;
    }

    @Override
    public String getImageCodec()
    {
        String output = "";
        output += "Image codec: " + imageCodec;
        return output;
    }

    @Override
    public String getMediaInfo()
    {
        String output = "Image ID: " + getId() + "\n" +
                            "Image name: " + getFileName() + "\n" +
                            getImageCodec();

        return output;
    }
}
