package Structural_Bridge;

public class YouTubeVideo extends Video{
    public YouTubeVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        System.out.print("You Tube");
        videoProcessor.process(videoFile);
    }
}
