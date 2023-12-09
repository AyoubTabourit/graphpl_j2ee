package ma.xproce.video_service.Dtos;

import lombok.Data;

import java.util.Date;

@Data
public class VideoDto {
    private String name;
    private String url;
    private String description;
    private Date datePublication;

    private CreatorDto creatorDto;
}
