package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Amp;
import jpa.entities.Guitar;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-08T20:28:18")
@StaticMetamodel(Gear.class)
public class Gear_ { 

    public static volatile SingularAttribute<Gear, String> notes;
    public static volatile SingularAttribute<Gear, Amp> ampId;
    public static volatile SingularAttribute<Gear, Integer> gearId;
    public static volatile SingularAttribute<Gear, Guitar> guitarId;
    public static volatile SingularAttribute<Gear, String> title;

}