public class Video extends Media implements IImageStandard, IAudioStandard
{
    private String imageCodec;
    private String audioCodec;

    public Video()
    {
        audioCodec = "";
        imageCodec = "";
    }
    public Video(String name, String imageCodec, String audioCodec)
    {
        super(name);
        this.audioCodec = audioCodec;
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
    public String getAudioCodec() {
        String output = "Audio codec: " + audioCodec;

        return output;
    }

    @Override
    public String getMediaInfo()
    {
        String output = "Video ID: " + getId() + "\n" +
                        "Video name: " + getFileName() + "\n" +
                        getImageCodec() + "\n" +
                        getAudioCodec();

        return output;
    }
}
