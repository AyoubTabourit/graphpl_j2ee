package ma.xproce.video_service.Dao.entities;

import java.util.Date;

import jakarta.persistence.*;
import lombok.*;
import ma.xproce.video_service.Dao.entities.Creator;

//import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String url;
    private String description;
    private Date datePublication;
    @ManyToOne
    private Creator creator;

}
