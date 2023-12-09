package ma.xproce.video_service.metier;

import ma.xproce.video_service.Dao.Repository.CreatorRepository;
import ma.xproce.video_service.Dao.entities.Video;
import ma.xproce.video_service.Dao.Repository.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VideoServiceImpl implements IVideoService{
        @Autowired
        CreatorRepository creatorRepository;
        @Autowired
        VideoRepository videoRepository;
        @Override
        public Video save(Video video) {
            creatorRepository.save(video.getCreator());
            return videoRepository.save(video) ;
        }

        @Override
        public List<Video> videoList() {

            return videoRepository.findAll();
        }

}
