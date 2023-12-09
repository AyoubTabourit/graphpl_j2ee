package ma.xproce.video_service.Dao.Repository;

import ma.xproce.video_service.Dao.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video,Integer> {
}
