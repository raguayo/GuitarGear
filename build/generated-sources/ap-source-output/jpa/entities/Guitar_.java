package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Gear;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-08T20:28:18")
@StaticMetamodel(Guitar.class)
public class Guitar_ { 

    public static volatile CollectionAttribute<Guitar, Gear> gearCollection;
    public static volatile SingularAttribute<Guitar, Integer> guitarId;
    public static volatile SingularAttribute<Guitar, String> model;
    public static volatile SingularAttribute<Guitar, String> brand;

}