package ma.xproce.video_service.metier;

import ma.xproce.video_service.Dtos.CreatorDto;
import ma.xproce.video_service.Dao.entities.Creator;

public interface ICreatorService {
    Creator creatorById(Long id);
    Creator saveCreator( CreatorDto creatorDto);
}
