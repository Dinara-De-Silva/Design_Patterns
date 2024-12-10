package Structural_Bridge;

public class VideoMenu {
    public static void main(String[] arg) {
        Video myYT_HD_video = new YouTubeVideo(new HDProcessor());
        myYT_HD_video.play("devi.mp4");
        Video myNetflix_8K_video = new NetflixVideo(new _8kProcessor());
        myNetflix_8K_video.play("after.mp4");
    }
}
