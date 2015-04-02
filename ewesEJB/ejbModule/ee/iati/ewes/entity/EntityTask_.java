package ee.iati.ewes.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2015-03-29T17:29:44.585+0300")
@StaticMetamodel(EntityTask.class)
public class EntityTask_ {
	public static volatile SingularAttribute<EntityTask, Integer> taskId;
	public static volatile SingularAttribute<EntityTask, String> descr;
	public static volatile SingularAttribute<EntityTask, Date> startDate;
	public static volatile SingularAttribute<EntityTask, Date> endDate;
	public static volatile SingularAttribute<EntityTask, EntitySubject> assignedSubjectId;
}
