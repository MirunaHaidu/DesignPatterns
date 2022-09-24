package structuralPattern.anotherAdapter;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AdapterPlayer extends MP3Player{
    private MP4Video mp4Video;


    @Override
    public void playSong() {
        mp4Video.playVideo();
    }
}
