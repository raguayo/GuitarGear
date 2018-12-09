package jpa.entities;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import jpa.entities.Gear;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-12-08T20:28:18")
@StaticMetamodel(Amp.class)
public class Amp_ { 

    public static volatile CollectionAttribute<Amp, Gear> gearCollection;
    public static volatile SingularAttribute<Amp, Integer> ampId;
    public static volatile SingularAttribute<Amp, String> model;
    public static volatile SingularAttribute<Amp, String> brand;

}