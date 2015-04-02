package ee.iati.ewes.dto;

import ee.iati.ewes.utils.GROUP_LINK_TYPE;

public class DTOGroupLink extends DTOBase{
	private static final long serialVersionUID = 1L;
		
	private Integer groupLinkId;
	private Integer groupId;
	private GROUP_LINK_TYPE linkType;
	private Integer userId;
	
	public Integer getGroupLinkId()						{ return groupLinkId; }
	public void setGroupLinkId(Integer groupLinkId)		{ this.groupLinkId = groupLinkId; }

	public Integer getGroupId()							{ return groupId; }
	public void setGroupId(Integer groupId)				{ this.groupId = groupId; }

	public GROUP_LINK_TYPE getLinkType()				{ return linkType; }
	public void setLinkType(GROUP_LINK_TYPE linkType)	{ this.linkType = linkType; }

	public Integer getUserId()							{ return userId; }
	public void setUserId(Integer userId)				{ this.userId = userId; }

	public DTOGroupLink() { }
	public DTOGroupLink(Integer groupLinkId, Integer groupId, GROUP_LINK_TYPE linkType, Integer userId) 
	{ 
		this.groupLinkId = groupLinkId;
		this.groupId = groupId;
		this.linkType = linkType;
		this.userId = userId;
	}
}
