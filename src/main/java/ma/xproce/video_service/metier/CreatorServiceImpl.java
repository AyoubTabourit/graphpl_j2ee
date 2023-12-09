package ma.xproce.video_service.metier;

import ma.xproce.video_service.Dtos.CreatorDto;
import ma.xproce.video_service.Mapper.CreatorMapper;
import ma.xproce.video_service.Dao.entities.Creator;
import ma.xproce.video_service.Dao.Repository.CreatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatorServiceImpl implements ICreatorService {

    @Autowired
    CreatorMapper creatorMapper ;
    @Autowired
    CreatorRepository creatorRepository;


    @Override
    public Creator creatorById(Long id) {
        return creatorRepository.findById(id).orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }

    @Override
    public Creator saveCreator(CreatorDto creatorDto) {
        System.out.println(creatorDto);
        return creatorRepository.save(creatorMapper.fromCreatorDtoToCreator(creatorDto));
    }
}
