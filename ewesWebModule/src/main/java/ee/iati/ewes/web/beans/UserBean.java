package ee.iati.ewes.web.beans;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.inject.Inject;
import javax.inject.Named;

import ee.iati.ewes.dto.DTOUser;

@ManagedBean
@RequestScoped
public class UserBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject protected Logger log;
	@ManagedProperty(value="#{treeBean}") private TreeBean tree;
	
	@Named public TreeBean getTree()			{ return tree; }
	public void setTree(TreeBean tree)			{ this.tree = tree; }
	
	private DTOUser user;
	private Integer linkKey;
	private Integer linkType;

	@Named public DTOUser getUser()				{ return user; }
	public void setUser(DTOUser user)			{ this.user = user; }
	
	@Named public Integer getLinkKey()			{ return linkKey; }
	public void setLinkKey(Integer linkKey)		{ this.linkKey = linkKey; }
	
	@Named public Integer getLinkType()			{ return linkType; }
	public void setLinkType(Integer linkType)	{ this.linkType = linkType; }
	
	@PostConstruct
	public void init()
	{
		user = new DTOUser();
		log.log(Level.INFO, "UserBean initialized");
	}
	
	@PreDestroy
	public void cleanUp()
	{
		log.log(Level.INFO, "UserBean Destroyed");
	}
	
	public void create()
	{
		log.log(Level.INFO, user.toString() + " " + tree.getCurrentSelection().getKey() + " " + tree.getCurrentSelection().getType());
	}
}
