package ee.iati.ewes.utils;

public enum GROUP_LINK_TYPE {
	ADMIN,
	TEACHER,
	STUDENT,
	UNKNOWN;
	
	public static GROUP_LINK_TYPE convert(int linkType)
	{ 
		GROUP_LINK_TYPE eRet = GROUP_LINK_TYPE.UNKNOWN;
		for (GROUP_LINK_TYPE enumConst : GROUP_LINK_TYPE.values())
		{
			if (enumConst.ordinal() == linkType)
			{
				eRet = enumConst;
				break;
			}
		}
		
		return eRet; 
	}
}
