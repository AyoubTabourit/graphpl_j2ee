package ma.xproce.video_service.metier;

import ma.xproce.video_service.Dao.entities.Video;

import java.util.List;

public interface IVideoService {
    Video save(Video video);
    List<Video> videoList();
}
