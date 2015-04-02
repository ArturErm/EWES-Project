package ee.iati.ewes.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-29T17:29:25.709+0300")
@StaticMetamodel(EntitySubject.class)
public class EntitySubject_ {
	public static volatile SingularAttribute<EntitySubject, Integer> assignedSubjectId;
	public static volatile SingularAttribute<EntitySubject, EntityGroup> groupId;
	public static volatile SingularAttribute<EntitySubject, EntitySubjectDescription> subjectId;
	public static volatile SingularAttribute<EntitySubject, EntityUser> teacherId;
}
