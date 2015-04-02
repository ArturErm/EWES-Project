package ee.iati.ewes.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-29T17:29:11.338+0300")
@StaticMetamodel(EntityNotification.class)
public class EntityNotification_ {
	public static volatile SingularAttribute<EntityNotification, Integer> notificationId;
	public static volatile SingularAttribute<EntityNotification, String> title;
	public static volatile SingularAttribute<EntityNotification, String> content;
	public static volatile SingularAttribute<EntityNotification, Date> creationDate;
	public static volatile SingularAttribute<EntityNotification, EntityUser> recieverId;
	public static volatile SingularAttribute<EntityNotification, EntityUser> senderId;
}
