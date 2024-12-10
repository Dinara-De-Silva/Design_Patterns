package Structural_Bridge;

public class HDProcessor extends VideoProcessor{
    @Override
    public void process(String videoFile) {
        System.out.println(" HD video is playing. File Name : "+videoFile);
    }
}
