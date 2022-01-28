package nvc.bcit.icefactory.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter @Setter @NoArgsConstructor

public class Camera {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int factory_id;
    private String name;
    private String location;



    @OneToMany(mappedBy = "camera")
    private List<Factory> factories;
    
}
