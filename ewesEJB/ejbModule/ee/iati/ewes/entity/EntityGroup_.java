package ee.iati.ewes.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-04-01T15:48:24.233+0300")
@StaticMetamodel(EntityGroup.class)
public class EntityGroup_ {
	public static volatile SingularAttribute<EntityGroup, Integer> groupId;
	public static volatile SingularAttribute<EntityGroup, String> title;
	public static volatile SingularAttribute<EntityGroup, String> description;
	public static volatile SingularAttribute<EntityGroup, Integer> parent;
}
