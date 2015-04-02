package ee.iati.ewes.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-29T17:30:19.182+0300")
@StaticMetamodel(EntityUserLink.class)
public class EntityUserLink_ {
	public static volatile SingularAttribute<EntityUserLink, Integer> userLinkId;
	public static volatile SingularAttribute<EntityUserLink, EntityUser> childId;
	public static volatile SingularAttribute<EntityUserLink, EntityLinkType> linkTypeId;
	public static volatile SingularAttribute<EntityUserLink, EntityUser> masterId;
}
