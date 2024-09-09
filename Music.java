public class Music extends Media implements  IAudioStandard
{
    private String audioCodec;

    public Music()
    {
        audioCodec = "";
    }
    public Music(String name, String audioCodec)
    {
        super(name);
        this.audioCodec = audioCodec;

    }

    @Override
    public String getAudioCodec() {
        String output = "Audio codec: " + audioCodec;

        return output;
    }

    @Override
    public String getMediaInfo() {
        String output = "Music ID: " + getId() + "\n" +
                "Music name: " + getFileName() + "\n" +
                getAudioCodec();

        return output;
    }
}
