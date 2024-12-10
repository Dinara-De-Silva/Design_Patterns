package Structural_Bridge;

public class NetflixVideo extends Video{

    public NetflixVideo(VideoProcessor videoProcessor) {
        super(videoProcessor);
    }

    @Override
    public void play(String videoFile) {
        System.out.print("Netflix");
        videoProcessor.process(videoFile);
    }
}
