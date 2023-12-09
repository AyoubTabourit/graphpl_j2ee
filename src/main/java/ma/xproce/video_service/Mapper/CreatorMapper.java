package ma.xproce.video_service.Mapper;
import ma.xproce.video_service.Dtos.CreatorDto;
import ma.xproce.video_service.Dao.entities.Creator;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class CreatorMapper {

    private ModelMapper mapper;

    public CreatorMapper() {
        this.mapper = new ModelMapper();
    }
    public CreatorDto creatorDtotoCreator(Creator creator){
        return this.mapper.map(creator,CreatorDto.class);
    }
    public Creator fromCreatorDtoToCreator(CreatorDto creatorDto){
        return this.mapper.map(creatorDto,Creator.class);
    }
}
