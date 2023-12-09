package ma.xproce.video_service.Mapper;

import ma.xproce.video_service.Dtos.VideoDto;
import ma.xproce.video_service.Dao.entities.Video;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;



public class VideoMapper {
    private ModelMapper mapper;
    public VideoMapper(){
        mapper = new ModelMapper();
    }
    public VideoDto toVideo(Video video){
        return this.mapper.map(video,VideoDto.class);
    }
    public Video fromVideoDto(VideoDto videoDto){
        return this.mapper.map(videoDto,Video.class);
    }
}
