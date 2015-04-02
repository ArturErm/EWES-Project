package ee.iati.ewes.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-29T17:30:11.176+0300")
@StaticMetamodel(EntityUser.class)
public class EntityUser_ {
	public static volatile SingularAttribute<EntityUser, Integer> userId;
	public static volatile SingularAttribute<EntityUser, String> fname;
	public static volatile SingularAttribute<EntityUser, String> lname;
	public static volatile SingularAttribute<EntityUser, String> pwd;
	public static volatile SingularAttribute<EntityUser, String> email;
	public static volatile SingularAttribute<EntityUser, String> ik;
}
